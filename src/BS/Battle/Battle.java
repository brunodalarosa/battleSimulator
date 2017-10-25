package BS.Battle;

import BS.Agents.Agent;
import BS.Agents.Character;
import BS.Agents.Enemy;
import BS.BS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This class controls and represents a battle simulation
 * @author Bruno Cesar
 * @since 25/10/2017
 */
public class Battle {
    private String id;
    private List<Character> party;
    private List<Enemy> enemies;
    private List<Agent> actionList;


    //ISSO AQUI FUNCIONA???? LOL
    Comparator<Agent> spdComparator = (o1, o2) -> (int) (o1.getSpd() - o2.getSpd());

    public Battle(String id, List<Character> party, List<Enemy> enemies) {
        this.id = id;
        this.party = party;
        this.enemies = enemies;

        BS.getInstance().getSysLog().newBattle(id);

        actionList = new ArrayList<>();
        actionList.addAll(party);
        actionList.addAll(enemies);
        actionList.sort(spdComparator);

        System.out.println("Ordem de açao na batalha:\n");
        for (Agent a:actionList) {
            System.out.println(a.getName());
        }
    }

    public String getId() {
        return id;
    }

    public List<Character> getParty() {
        return party;
    }

    public void setParty(List<Character> party) {
        this.party = party;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public List<Agent> getActionList() {
        return actionList;
    }

    public void setActionList(List<Agent> actionList) {
        this.actionList = actionList;
    }
}
