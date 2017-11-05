package BS.game.agents;


import BS.game.actions.ActionListener;

public class Agent {
    private float hp;
    private String name;
    private int lvl;
    //private CA
    //private PA
    private ActionListener action_listener;
    //private img

    public Agent(float hp, String name, int lvl, ActionListener action_listener) {
        this.hp = hp;
        this.name = name;
        this.lvl = lvl;
        this.action_listener = action_listener;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public ActionListener getActionListener() {
        return action_listener;
    }

    public void setActionListener(ActionListener action_listener) {
        this.action_listener = action_listener;
    }
}
