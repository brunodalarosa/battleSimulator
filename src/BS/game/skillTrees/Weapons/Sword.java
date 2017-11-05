package BS.game.skillTrees.Weapons;

import BS.old.Agents.Agent;
import BS.game.skillTrees.SkillTree;

/**
 * The Sword skill tree (More info on the game design documents)
 */
public class Sword extends SkillTree {

    /**
     * Levels
     */
    private int lvl;
    private int warriorsChoice_lvl;
    private int agressiveBattleStyle_lvl;
    private int verticalSlash_lvl;
    private int horizontalSlash_lvl;
    private int stab_lvl;
    private int warCry_lvl;
    private int diagonalSlash_lvl;
    private int battleStance_lvl;
    private int stunningStroke_lvl;

    /**
     * Auxiliary atributes
     */
    private Agent warriorChoice = null;

    /**
     * Sword SkillTree Constructor
     * @param lvl
     * Plus the level of each skill
     */
    public Sword(int lvl, int warriorsChoice_lvl, int agressiveBattleStyle_lvl, int verticalSlash_lvl,
                 int horizontalSlash_lvl, int stab_lvl, int warCry_lvl, int diagonalSlash_lvl,
                 int battleStance_lvl, int stunningStroke_lvl) {

        this.lvl = lvl;
        this.warriorsChoice_lvl = warriorsChoice_lvl;
        this.agressiveBattleStyle_lvl = agressiveBattleStyle_lvl;
        this.verticalSlash_lvl = verticalSlash_lvl;
        this.horizontalSlash_lvl = horizontalSlash_lvl;
        this.stab_lvl = stab_lvl;
        this.warCry_lvl = warCry_lvl;
        this.diagonalSlash_lvl = diagonalSlash_lvl;
        this.battleStance_lvl = battleStance_lvl;
        this.stunningStroke_lvl = stunningStroke_lvl;
    }

    /* Basicas */

    /**
     * Escolha do guerreiro - Garante bônus de ataque para ataques consecutivos no mesmo alvo.
     */
    public void warriorsChoice(){

    }

    /**
     * Posição agressiva - Garante bônus em velocidade e ataque. No nível máximo também ativa uma chance pequena de contra-ataques.
     */
    public void agressiveBattleStyle(){

    }

    /**
     * Corte vertical -  Um ataque vertical num único alvo, chance baixa de causar confusão.
     */
    public void verticalSlash(){

    }

    /* Level 5 */

    /**
     * Corte Horizontal - Ataque largo que pode atingir até três alvos.
     */
    public void horizontalSlash(){

    }

    /**
     * Estocada - Ataque perfurante num único alvo, chance baixa de causar sangramento.
     */
    public void stab(){

    }

    /* Level 10 */

    /**
     * Grito de guerra -  Buff temporário no ataque. No nível máximo tem chance alta de cancelar o status “dormindo” de todos os personagens na batalha.
     */
    public void warCry(){

    }

    /**
     * Corte Diagonal - Um ataque em três alvos, o alvo central leva 20% a mais de dano e pode sofrer confusão cm Chance baixa.
     */
    public void diagonalSlash(){

    }

    /**
     * Postura de batalha - Buff de ataque, velocidade e na chance de contra-ataque por três turnos.
     */
    public void battleStance(){

    }

    /**
     * Golpe atordoante - Ataque pesado com chance média de causar atordoamento e chance baixa de derrubar. Cooldown de um turno.
     */
    public void stunningStroke(){

    }

}
