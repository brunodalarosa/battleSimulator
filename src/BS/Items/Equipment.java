package BS.Items;

/**
 * Equipment class
 */
public class Equipment {

    /**
     * Minimum constructor for equipment
     * @param name
     * @param requirements
     * @param type
     * @param desc
     */
    public Equipment(String name, Requirements requirements, EquipmentType type, String desc) {
        this.name = name;
        this.requirements = requirements;
        this.type = type;
        this.desc = desc;
    }

    private String name;
    private Requirements requirements;
    private EquipmentType type;
    private String desc;

    private boolean def;
    private int def_v;

    private boolean m_def;
    private int m_def_v;

    protected boolean res_fire_dmg;
    protected float res_fire_dmg_v;

    protected boolean res_fire_effect;
    protected float res_fire_effect_v;

    protected boolean res_ice_dmg;
    protected float res_ice_dmg_v;

    protected boolean res_ice_effect;
    protected float res_ice_effect_v;

    protected boolean res_eletric_dmg;
    protected float res_eletric_dmg_v;

    protected boolean res_dark_dmg;
    protected float res_dark_dmg_v;

    protected boolean res_poison;
    protected float res_poison_v;

    protected boolean res_acid_effect;
    protected float res_acid_effect_v;

    protected boolean block_chance;
    protected float block_chance_v;

    protected boolean res_confusion;
    protected float res_confusion_v;

    protected boolean res_topple;
    protected float res_topple_v;

    protected boolean res_launch;
    protected float res_launch_v;

    protected boolean res_stun;
    protected float res_stun_v;

    protected boolean res_blind;
    protected float res_blind_v;

    protected boolean res_mute;
    protected float res_mute_v;

    protected boolean res_sleep;
    protected float res_sleep_v;

    protected boolean res_curse;
    protected float res_curse_v;

    protected boolean res_bleed;
    protected float res_bleed_v;

}
