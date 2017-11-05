package BS.game.actions.skills;

import BS.game.actions.Skill;
import BS.game.agents.Agent;

public class BasicAtack extends Skill {
    private float damage;

    public BasicAtack(Agent source) {
        super(source);
        damage = 1.5f;
    }

    @Override
    public void execute() {
        target.get(0).receiveDamage(damage);
    }
}
