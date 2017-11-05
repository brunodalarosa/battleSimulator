package BS.game.actions.skills;

import BS.game.actions.Skill;
import BS.game.agents.Agent;

public class BasicAttack extends Skill {
    private float damage;

    public BasicAttack(Agent source) {
        super(source,"Basic Attack");
        damage = 1.5f;
    }

    @Override
    public void execute() {
        for(Agent a : target){
            a.receiveDamage(damage);
            System.out.println("oi mamae basic");
        }
    }
}
