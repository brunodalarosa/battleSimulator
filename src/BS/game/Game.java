package BS.game;

import BS.game.actions.Action;
import BS.game.agents.Agent;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Game {
    private List<Agent> agents;
    private Queue<Action> actions;

    private Comparator<Agent> comparator = (o1, o2) -> (int) (o1.getHp() - o2.getHp());


    public Game(List<Agent> agents) {
        this.agents = agents;
        actions = new PriorityQueue<>();

        agents.sort(comparator);
    }

    public void gameLoop(){
        for(Agent agent : agents){
            actions.add(agent.getActionListener().getAction());
        }

        for(Action action : actions){
            action.execute();
        }

        agents.sort(comparator);
    }
}
