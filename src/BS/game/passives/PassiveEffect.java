package BS.game.passives;

import BS.game.agents.Agent;
import BS.game.agents.CombatAttributes;

/**
 * A passive effect is often a result of a Passive Skill
 * It affects the CA of an Agent through the battle
 */
public abstract class PassiveEffect {
    protected String name;
    protected Agent target;

    public PassiveEffect(Agent target, String name) {
        this.name = name;
        this.target = target;
    }

    public abstract void applyEffect();
}
