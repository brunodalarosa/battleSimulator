package BS.Agents;

public class Enemy extends Agent {


    /**
     * Basic constructor, works for scenario objects
     * @param name
     * @param HP
     */
    public Enemy(String name, int lvl, int HP) {
        super(name, HP, AgentType.ENEMY);
    }
}
