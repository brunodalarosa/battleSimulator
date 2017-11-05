package BS.old;

/**
 * This class represents the combat attributes that every Agent, Equipment and Weapon have
 * the idea behind this class is to re-use code.
 * @author Bruno Cesar
 * @since 3/11/17
 */
public class CombatAttributes {

    /* Empty constructor */
    public CombatAttributes() {

    }

    //Bonuses
    private float bonus_fire;
    private float bonus_ice;
    private float bonus_eletric;
    private float bonus_wind;
    private float bonus_poison;
    private float bonus_acid;
    private float bonus_dark;
    private float bonus_heal;
    private float bonus_heal_absorb;
    private float bonus_pierce;
    private float bonus_slash;
    private float bonus_bash;
    private float bonus_mp_regen;
    private float bonus_hp_regen;

    //Resistances
    private float res_fire;
    private float res_ice;
    private float res_eletric;
    private float res_wind;
    private float res_poison;
    private float res_acid;
    private float res_dark;
    private float res_sleep;
    private float res_mute;
    private float block_chance;

    //Main atributes
    private float HP; //Health Points
    private int MP; //Magic Points
    private int WP; //Will Points
    private float spd; //Speed
    private float atk; //Attack
    private float def; //Defense
    private float m_atk; //Magical Attack
    private float m_def; //Magical Defense
    private float acc; //Accuracy
    private float eva; //Evasion
    private float not; //Notoriety
    private float crit; //Critical Attack chance

    public float getBonus_fire() {
        return bonus_fire;
    }

    public void setBonus_fire(float bonus_fire) {
        this.bonus_fire = bonus_fire;
    }

    public float getBonus_ice() {
        return bonus_ice;
    }

    public void setBonus_ice(float bonus_ice) {
        this.bonus_ice = bonus_ice;
    }

    public float getBonus_eletric() {
        return bonus_eletric;
    }

    public void setBonus_eletric(float bonus_eletric) {
        this.bonus_eletric = bonus_eletric;
    }

    public float getBonus_wind() {
        return bonus_wind;
    }

    public void setBonus_wind(float bonus_wind) {
        this.bonus_wind = bonus_wind;
    }

    public float getBonus_poison() {
        return bonus_poison;
    }

    public void setBonus_poison(float bonus_poison) {
        this.bonus_poison = bonus_poison;
    }

    public float getBonus_acid() {
        return bonus_acid;
    }

    public void setBonus_acid(float bonus_acid) {
        this.bonus_acid = bonus_acid;
    }

    public float getBonus_dark() {
        return bonus_dark;
    }

    public void setBonus_dark(float bonus_dark) {
        this.bonus_dark = bonus_dark;
    }

    public float getBonus_heal() {
        return bonus_heal;
    }

    public void setBonus_heal(float bonus_heal) {
        this.bonus_heal = bonus_heal;
    }

    public float getBonus_heal_absorb() {
        return bonus_heal_absorb;
    }

    public void setBonus_heal_absorb(float bonus_heal_absorb) {
        this.bonus_heal_absorb = bonus_heal_absorb;
    }

    public float getBonus_pierce() {
        return bonus_pierce;
    }

    public void setBonus_pierce(float bonus_pierce) {
        this.bonus_pierce = bonus_pierce;
    }

    public float getBonus_slash() {
        return bonus_slash;
    }

    public void setBonus_slash(float bonus_slash) {
        this.bonus_slash = bonus_slash;
    }

    public float getBonus_bash() {
        return bonus_bash;
    }

    public void setBonus_bash(float bonus_bash) {
        this.bonus_bash = bonus_bash;
    }

    public float getBonus_mp_regen() {
        return bonus_mp_regen;
    }

    public void setBonus_mp_regen(float bonus_mp_regen) {
        this.bonus_mp_regen = bonus_mp_regen;
    }

    public float getBonus_hp_regen() {
        return bonus_hp_regen;
    }

    public void setBonus_hp_regen(float bonus_hp_regen) {
        this.bonus_hp_regen = bonus_hp_regen;
    }

    public float getRes_fire() {
        return res_fire;
    }

    public void setRes_fire(float res_fire) {
        this.res_fire = res_fire;
    }

    public float getRes_ice() {
        return res_ice;
    }

    public void setRes_ice(float res_ice) {
        this.res_ice = res_ice;
    }

    public float getRes_eletric() {
        return res_eletric;
    }

    public void setRes_eletric(float res_eletric) {
        this.res_eletric = res_eletric;
    }

    public float getRes_wind() {
        return res_wind;
    }

    public void setRes_wind(float res_wind) {
        this.res_wind = res_wind;
    }

    public float getRes_poison() {
        return res_poison;
    }

    public void setRes_poison(float res_poison) {
        this.res_poison = res_poison;
    }

    public float getRes_acid() {
        return res_acid;
    }

    public void setRes_acid(float res_acid) {
        this.res_acid = res_acid;
    }

    public float getRes_dark() {
        return res_dark;
    }

    public void setRes_dark(float res_dark) {
        this.res_dark = res_dark;
    }

    public float getRes_sleep() {
        return res_sleep;
    }

    public void setRes_sleep(float res_sleep) {
        this.res_sleep = res_sleep;
    }

    public float getRes_mute() {
        return res_mute;
    }

    public void setRes_mute(float res_mute) {
        this.res_mute = res_mute;
    }

    public float getBlock_chance() {
        return block_chance;
    }

    public void setBlock_chance(float block_chance) {
        this.block_chance = block_chance;
    }

    public float getHP() {
        return HP;
    }

    public void setHP(float HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getWP() {
        return WP;
    }

    public void setWP(int WP) {
        this.WP = WP;
    }

    public float getSpd() {
        return spd;
    }

    public void setSpd(float spd) {
        this.spd = spd;
    }

    public float getAtk() {
        return atk;
    }

    public void setAtk(float atk) {
        this.atk = atk;
    }

    public float getDef() {
        return def;
    }

    public void setDef(float def) {
        this.def = def;
    }

    public float getM_atk() {
        return m_atk;
    }

    public void setM_atk(float m_atk) {
        this.m_atk = m_atk;
    }

    public float getM_def() {
        return m_def;
    }

    public void setM_def(float m_def) {
        this.m_def = m_def;
    }

    public float getAcc() {
        return acc;
    }

    public void setAcc(float acc) {
        this.acc = acc;
    }

    public float getEva() {
        return eva;
    }

    public void setEva(float eva) {
        this.eva = eva;
    }

    public float getNot() {
        return not;
    }

    public void setNot(float not) {
        this.not = not;
    }

    public float getCrit() {
        return crit;
    }

    public void setCrit(float crit) {
        this.crit = crit;
    }
}
