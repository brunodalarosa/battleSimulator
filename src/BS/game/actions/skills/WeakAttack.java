package BS.game.actions.skills;

import BS.game.agents.Agent;

public class WeakAttack extends Skill{
    private float damage;

    public WeakAttack(Agent source) {
        super(source,"Weak Attack");
        damage = 0.5f;
    }

    @Override
    public void execute() {
        display();
        for(Agent a : target){
            a.receiveDamage(damage);
        }
    }
}
