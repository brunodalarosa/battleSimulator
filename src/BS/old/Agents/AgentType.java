package BS.old.Agents;

/**
 * This ENUM is used in Agent to set the different types of Agents in battle
 */
public enum AgentType {
    USER(   "user",    0), //Agents that the user controls
    ENEMY(  "enemy",   1), //Common enemies
    BOSS(   "boss",    2), //Boss enemy (has special features)
    AI_ALLY("AI ally", 3), //Ally Agents that the user doesn't control
    OBJECT( "object",  4); //Neutral objects (battlefield stuff among others)

    private String state;
    private int id;

    AgentType(String state, int id){
        this.state = state;
        this.id = id;
    }

    public String getstate() {
        return state;
    }

    public int getId() {
        return id;
    }
}
