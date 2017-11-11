package BS.game.passives;

import BS.game.agents.Agent;

/**
 * Estilo de batalha agressiva - Garante bônus em velocidade e ataque.
 * No nível máximo também ativa uma chance pequena de contra-ataques.
 */
public class AgressiveStyle extends PassiveEffect {
    private int lvl;
    private float atk_val;
    private float speed_val;


    public AgressiveStyle(Agent target, String name, int lvl) {
        super(target, name);
        this.lvl = lvl;
        this.atk_val = target.getCA().getAtk() * 0.02f * lvl; // Atk += lvl*2%atk_val
        this.speed_val = target.getCA().getSpd() * 0.01f * lvl; // SPD += lvl*1%spd
        this.target.addPassive(this);
    }


    @Override
    public void applyEffect() {
        target.getCA().setAtk(target.getCA().getAtk() + this.atk_val);
        target.getCA().setSpd(target.getCA().getSpd() + this.speed_val);

        if(lvl >= 5) target.getCA().setCounter_chance(target.getCA().getCounter_chance() + 2); // 2% Counter chance
    }
}
