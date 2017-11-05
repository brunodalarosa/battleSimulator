package BS.old.Agents;

import BS.game.itens.Equipment;
import BS.game.itens.Weapon;

public class Character extends Agent {

    /**
     * Basic character constructor
     */
    public Character(String name, int lvl, int HP, int STR, int AGI, int INT, int WIS, int VIG, int LCK) {
        super(name, HP, AgentType.USER);
        this.lvl = lvl;
        this.STR = STR;
        this.AGI = AGI;
        this.INT = INT;
        this.WIS = WIS;
        this.VIG = VIG;
        this.LCK = LCK;
    }

    //Primary atributes (Define others attributes together with equipment)
    private int STR;
    private int AGI;
    private int INT;
    private int WIS;
    private int VIG;
    private int LCK;

    //Equipment
    private Weapon weapon;
    private Weapon sub_weapon;
    private Equipment head;
    private Equipment body;
    private Equipment feet;
    private Equipment back;
    private Equipment ring;
    private Equipment accessory;

    public int getSTR() {
        return STR;
    }

    public int getAGI() {
        return AGI;
    }

    public int getINT() {
        return INT;
    }

    public int getWIS() {
        return WIS;
    }

    public int getVIG() {
        return VIG;
    }

    public int getLCK() {
        return LCK;
    }
}
