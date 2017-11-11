package BS.game.buffs;

import BS.game.agents.Agent;
import BS.game.agents.CombatAttributes;

/**
 * A buff represents a temporary effect (positive or negative) on an Agent.
 * It is not an state change, but simply a change in the agent's CA.
 */
public abstract class Buff {
    protected String name;
    protected Agent target;
    protected int turns;
    protected int lvl;

    public Buff(Agent target, String name, int lvl) {
        this.name = name;
        this.target = target;
        this.lvl = lvl;
    }

    /**
     * Apply the effects of the buff in Agent's CA
     */
    public abstract void applyEffect();

    /**
     * Remove the buff effects
     */
    public abstract void removeEffect();

    public void decreaseDuration(){
        this.turns--;
        if(this.turns > 0) System.out.println(this.target.getName() + "'s " + this.name + " now have " + this.turns + " turns left"); //todo log

        if(this.turns == 0){
            this.target.removeBuff(this);
        }
    }

}
