package BS.game.itens;

import BS.game.CombatAttributes;
import BS.game.skillTrees.SkillTree;

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
    private String name;
    private String desc;
    private Rarity rarity;
    private SkillTree skill_tree;
    private Requirements requirements;
    private int durability;
    private CombatAttributes attributes;
    

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
