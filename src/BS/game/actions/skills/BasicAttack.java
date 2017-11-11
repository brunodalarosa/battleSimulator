package BS.game.actions.skills;

import BS.game.agents.Agent;

public class BasicAttack extends Skill {
    private float damage;

    public BasicAttack(Agent source) {
        super(source,"Basic Attack");
        damage = source.getCA().getAtk();
    }

    @Override
    public void execute() {
        Agent t = target.get(0);
        display(t);
        t.receiveDamage(damage);
    }
}
