package BS.game.actions.skills;

import BS.game.actions.Skill;
import BS.game.agents.Agent;
/**
 * Estilo de batalha agressiva - Garante bônus em velocidade e ataque.
 * No nível máximo também ativa uma chance pequena de contra-ataques.
 */
public class AgressiveStyle extends Skill {
    int lvl;

    public AgressiveStyle(Agent source, String name, int lvl) {
        super(source, name);
        this.lvl = lvl;
    }

    @Override
    public void execute() {
        float spd_bonus = source.getCA().getSpd() * (0.02f * lvl);
        float atk_bonus = source.getCA().getAtk() * (0.03f * lvl);
        float counter_chance = 0.0f;
        if(lvl == 5) counter_chance = 0.05f;
        //TODO criar um sistema de como aplicar efeitos passivos ao personagem.

    }
}
