package BS.Items;

import BS.SkillTrees.SkillTree;

/**
 * Weapon is the base class for all the types of weapons (weapons classes)
 * @since 20/10/17
 * @author Bruno Cesar
 */
public class Weapon {

    /**
     * Basic constructor for a weapon
     */
    public Weapon(String name, String desc, Rarity rarity, SkillTree skill_tree, Requirements requirements, int durability) {
        this.name = name;
        this.desc = desc;
        this.rarity = rarity;
        this.skill_tree = skill_tree;
        this.requirements = requirements;
        this.durability = durability;
    }

    //Basic attributes
    protected String name;
    protected String desc;
    protected Rarity rarity;
    protected SkillTree skill_tree;
    protected Requirements requirements;
    protected int durability;

    protected boolean fire_dmg;
    protected float fire_dmg_v;

    protected boolean fire_effect;
    protected float fire_effect_v;

    protected boolean ice_dmg;
    protected float ice_dmg_v;

    protected boolean eletric_dmg;
    protected float eletric_dmg_v;

    protected boolean dark_dmg;
    protected float dark_dmg_v;

    protected boolean neutral_magic_dmg;
    protected float neutral_magic_dmg_v;

    protected boolean poison_effect;
    protected float poison_effect_v;

    protected boolean acid_effect;
    protected float acid_effect_v;

    protected boolean pierce_effect;
    protected float pierce_effect_v;

    protected boolean slash_dmg;
    protected float slash_dmg_v;

    protected boolean bash_dmg;
    protected float bash_dmg_v;

    protected boolean heal_pwr;
    protected float heal_pwr_v;

    protected boolean heal_bonus;
    protected float heal_bonus_v;

    protected boolean curse_bonus;
    protected float curse_bonus_v;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public SkillTree getSkill_tree() {
        return skill_tree;
    }

    public Requirements getRequirements() {
        return requirements;
    }

    public int getDurability() {
        return durability;
    }
}
