package BS.game.skillTrees;

import BS.old.Agents.Agent;

import java.util.List;

/**
 * Generic skill class
 * @author Bruno Cesar
 * @since 25/10/2017
 */
public class Skill {
    private Agent source;

    private List<Agent> targets;

    private int left_charging_turns;


    private boolean passive;
    private boolean trap;
    private boolean multi_target;
    private boolean needs_charge;
    private boolean charged;

    /**
     * Basic constructor only set the source
     * @param source The Agent who casted the skill
     */
    public Skill(Agent source) {
        this.source = source;
    }
}
