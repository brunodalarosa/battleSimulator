package BS.Items;

import BS.CombatAttributes;

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
    private CombatAttributes attributes;
}
