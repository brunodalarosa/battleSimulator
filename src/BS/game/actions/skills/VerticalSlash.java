package BS.game.actions.skills;

import BS.game.actions.Skill;
import BS.game.agents.Agent;

/**
 * Corte vertical -  Um ataque vertical num único alvo, chance baixa de causar confusão.
 */
public class VerticalSlash extends Skill {
    private float dmg;
    private int lvl;


    public VerticalSlash(Agent source, int lvl) {
        super(source, "Vertical Slash");
        this.lvl = lvl;
        float mult = 1.00f + 0.05f * lvl; //Lvl 1 = 1.05 -- lvl 5 = 1.25 (5% ate 25%)
        this.dmg = (source.getCA().getAtk() * mult) * source.getCA().getBonus_slash(); //Dano * mult * Bonus slash
    }

    @Override
    public void execute() {
        if(0.01 * lvl > Math.random()){ //de 1% a 5% de chance de causar confusao
            //TODO aplicar confusao no target
        }

        target.get(0).receiveDamage(dmg);
    }
}
