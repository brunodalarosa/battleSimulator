package BS.game.itens;

import BS.game.agents.CombatAttributes;

/**
 * Equipment class
 */
public class Equipment {

    private String name;
    private Requirements requirements;
    private EquipmentType type;
    private Rarity rarity;
    private String desc;
    private CombatAttributes attributes;

    /**
     * Minimum constructor for equipment
     * @param name
     * @param requirements
     * @param type
     * @param desc
     */
    public Equipment(String name, Requirements requirements, EquipmentType type, Rarity rarity, String desc) {
        this.name = name;
        this.requirements = requirements;
        this.type = type;
        this.rarity = rarity;
        this.desc = desc;
    }
}
