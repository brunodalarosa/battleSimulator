package BS.Items;

import BS.Agents.Character;

/**
 * Define the requirements to equip a equipment, acessory or weapon
 */
public class Requirements {
    private int lvl;

    private int STR;
    private int AGI;
    private int INT;
    private int WIS;

    public Requirements(int lvl, int STR, int AGI, int INT, int WIS) {
        this.lvl = lvl;
        this.STR = STR;
        this.AGI = AGI;
        this.INT = INT;
        this.WIS = WIS;
    }

    /**
     * Verify if a character can equip the equipment
     * @param character
     * @return true if can equip or else
     */
    public boolean verify(Character character) {
        return character.getLvl() >= lvl
                && character.getSTR() >= STR
                && character.getAGI() >= AGI
                && character.getINT() >= INT
                && character.getWIS() >= WIS;
    }

    public int getLvl() {
        return lvl;
    }

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
}
