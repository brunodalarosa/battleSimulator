package BS.game.actions.skills;

import BS.game.actions.Skill;
import BS.game.agents.Agent;

public class StrongAttack extends Skill {
    private float damage;

    public StrongAttack(Agent source) {
        super(source);
        damage = 1f;
    }

    @Override
    public void execute() {
        target.get(0).receiveDamage(damage);
    }
}