package BS.Agents;

/**
 * Um Agent é a classe base para todos e qualquer alvo em batalhas, incluindo jogador, personagens e inimigos.
 * @since 19/10/17
 * @author Bruno Cesar
 */
public class Agent {

    /**
     * Basic constructor, works for scenario objects
     */
    public Agent(String name, int lvl, int HP) {
        this.name = name;
        this.lvl = lvl;
        this.HP = HP;
    }

    //Basic attributes
    protected String name;
    protected int lvl;
    private boolean[] states;


    //Combat atributes (All used in battles)

    //Bonuses
    protected float fire_dmg;
    protected float fire_effect;
    protected float ice_dmg;
    protected float eletric_dmg;
    protected float dark_dmg;
    protected float neutral_magic_dmg;
    protected float poison_effect;
    protected float acid_effect;
    protected float pierce_effect;
    protected float slash_dmg;
    protected float bash_dmg;
    protected float heal_pwr;
    protected float heal_bonus;
    protected float curse_bonus;


    //Resistances
    protected float res_fire_dmg;
    protected float res_fire_effect;
    protected float res_ice_dmg;
    protected float res_ice_effect;
    protected float res_eletric_dmg;
    protected float res_dark_dmg;
    protected float res_poison;
    protected float res_acid_effect;
    protected float block_chance;
    protected float res_confusion;
    protected float res_topple;
    protected float res_launch;
    protected float res_stun;
    protected float res_blind;
    protected float res_mute;
    protected float res_sleep;
    protected float res_curse;
    protected float res_bleed;

    //Main atributes
    protected float HP; //Health Points
    protected int MP; //Magic Points
    protected int WP; //Will Points
    protected float spd; //Speed
    protected float atk; //Attack
    protected float def; //Defense
    protected float m_atk; //Magical Attack
    protected float m_def; //Magical Defense
    protected float acc; //Accuracy
    protected float eva; //Evasion
    protected float not; //Notoriety
    protected float crit; //Critical Attack chance

    public void damage(float dmg){
        this.HP -= dmg;
        if (this.HP <= 0){
            states[AgentState.DEAD.getId()] = true; //???? Retrabalhar isso
        }
    }

    public String getName() {
        return name;
    }

    public boolean[] getStates() {
        return states;
    }

    public float getFire_dmg() {
        return fire_dmg;
    }

    public float getFire_effect() {
        return fire_effect;
    }

    public float getIce_dmg() {
        return ice_dmg;
    }

    public float getEletric_dmg() {
        return eletric_dmg;
    }

    public float getDark_dmg() {
        return dark_dmg;
    }

    public float getNeutral_magic_dmg() {
        return neutral_magic_dmg;
    }

    public float getPoison_effect() {
        return poison_effect;
    }

    public float getAcid_effect() {
        return acid_effect;
    }

    public float getPierce_effect() {
        return pierce_effect;
    }

    public float getSlash_dmg() {
        return slash_dmg;
    }

    public float getBash_dmg() {
        return bash_dmg;
    }

    public float getHeal_pwr() {
        return heal_pwr;
    }

    public float getHeal_bonus() {
        return heal_bonus;
    }

    public float getCurse_bonus() {
        return curse_bonus;
    }

    public float getRes_fire_dmg() {
        return res_fire_dmg;
    }

    public float getRes_fire_effect() {
        return res_fire_effect;
    }

    public float getRes_ice_dmg() {
        return res_ice_dmg;
    }

    public float getRes_ice_effect() {
        return res_ice_effect;
    }

    public float getRes_eletric_dmg() {
        return res_eletric_dmg;
    }

    public float getRes_dark_dmg() {
        return res_dark_dmg;
    }

    public float getRes_poison() {
        return res_poison;
    }

    public float getRes_acid_effect() {
        return res_acid_effect;
    }

    public float getBlock_chance() {
        return block_chance;
    }

    public float getRes_confusion() {
        return res_confusion;
    }

    public float getRes_topple() {
        return res_topple;
    }

    public float getRes_launch() {
        return res_launch;
    }

    public float getRes_stun() {
        return res_stun;
    }

    public float getRes_blind() {
        return res_blind;
    }

    public float getRes_mute() {
        return res_mute;
    }

    public float getRes_sleep() {
        return res_sleep;
    }

    public float getRes_curse() {
        return res_curse;
    }

    public float getRes_bleed() {
        return res_bleed;
    }

    public float getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getWP() {
        return WP;
    }

    public float getSpd() {
        return spd;
    }

    public float getAtk() {
        return atk;
    }

    public float getDef() {
        return def;
    }

    public float getM_atk() {
        return m_atk;
    }

    public float getM_def() {
        return m_def;
    }

    public float getAcc() {
        return acc;
    }

    public float getEva() {
        return eva;
    }

    public float getNot() {
        return not;
    }

    public float getCrit() {
        return crit;
    }

    public int getLvl() {
        return lvl;
    }
}
