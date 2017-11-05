package BS.game.itens;

public enum EquipmentType {
    HEAD("head",1),
    BODY("body",2),
    FEET("feet",3),
    BACK("back",4),
    RING("ring",5),
    AMULET("accessory",6);

    private String type;
    private int id;

    EquipmentType(String type, int id){
        this.type = type;
        this.id = id;
    }
}
