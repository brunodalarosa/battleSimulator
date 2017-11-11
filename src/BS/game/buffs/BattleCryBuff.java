package BS.game.buffs;

import BS.game.agents.Agent;

/**
 * Grito de batalha -  Buff temporário no ataque.
 */
public class BattleCryBuff extends Buff {
    private int lvl;
    private float atk_val;

    public BattleCryBuff(Agent target, int lvl) {
        super(target, "Battle Cry", lvl);
        this.lvl = lvl;
        this.atk_val = target.getCA().getAtk() * 0.04f * lvl; //atk += 0.4%atk * lvl
        this.target.addBuff(this);

        if(lvl < 3){
            this.turns = 2;
        } else if(lvl < 4){
            this.turns = 3;
        } else{
            this.turns = 4;
        }
    }

    @Override
    public void applyEffect() {
        target.getCA().setAtk(target.getCA().getAtk() + atk_val);
        System.out.println(target + " now has " + this.name + " : Atk + " + this.atk_val);
    }

    @Override
    public void removeEffect() {
        target.getCA().setAtk(target.getCA().getAtk() - atk_val);
        System.out.println(target + " no longer on effect of " + this.name);
    }
}
