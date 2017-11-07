package BS.game.agents;

/**
 * Basic attributes are the attributes that a character increases when leveling up
 * They are also the base for Combat Attributes calculus.
 * @author Bruno Cesar
 * @since 6/11/17
 */
public class BasicAttributes {
    private int STR;
    private int AGI;
    private int VIT;
    private int INT;
    private int WIS;
    private int LCK;

    /**
     * Empty constructor
     */
    public BasicAttributes() {
        this.STR = 1;
        this.AGI = 1;
        this.VIT = 1;
        this.INT = 1;
        this.WIS = 1;
        this.LCK = 1;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getAGI() {
        return AGI;
    }

    public void setAGI(int AGI) {
        this.AGI = AGI;
    }

    public int getVIT() {
        return VIT;
    }

    public void setVIT(int VIT) {
        this.VIT = VIT;
    }

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public int getWIS() {
        return WIS;
    }

    public void setWIS(int WIS) {
        this.WIS = WIS;
    }

    public int getLCK() {
        return LCK;
    }

    public void setLCK(int LCK) {
        this.LCK = LCK;
    }
}
