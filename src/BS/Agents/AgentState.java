package BS.Agents;

/**
 * This ENUM is used in Agent to set an array of possibles states of an Agent in battle.
 */
public enum AgentState {
    DEAD("dead",         0),
    FLAMES("in flames",  1),
    FROZEN("frozen",     2),
    CONFUSED("confused", 3),
    TOPPLED("toppled",   4),
    STUNNED("stunned",   5),
    POISONED("poisoned", 6),
    MUTED("muted",       7),
    ASLEEP("asleep",     8);

    private String state;
    private int id;

    AgentState(String state, int id){
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
