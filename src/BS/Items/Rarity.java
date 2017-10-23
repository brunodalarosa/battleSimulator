package BS.Items;

/**
 * This ENUM
 */
public enum Rarity {
    COMMON("common",1),
    SPECIAL("special",2),
    RARE("rare",3),
    EPIC("epic",4),
    LEGENDARY("legendary",5);

    private String rarity;
    private int id;

    Rarity(String rarity, int id){
        this.rarity = rarity;
        this.id = id;
    }
}
