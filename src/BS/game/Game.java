package BS.game;

import BS.game.actions.Skill;
import BS.game.agents.Agent;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Game {
    private List<Agent> agents;
    private Queue<Skill> actions;

    private Comparator<Agent> comparator = (o1, o2) -> (int) (o1.getHp() - o2.getHp());


    public Game(List<Agent> agents) {
        this.agents = agents;
        actions = new LinkedBlockingQueue<>();
        agents.sort(comparator);
    }

    public void gameLoop(){
        for(Agent agent : agents){
            actions.add(agent.getActionListener().getAction());
        }

        for(Skill skill : actions){
            skill.execute();
        }

        actions.clear();
        agents.sort(comparator);
        System.out.println("\n--- END OF TURN ---\n");
    }
}
