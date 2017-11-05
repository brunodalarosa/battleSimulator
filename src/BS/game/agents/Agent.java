package BS.game.agents;


import BS.game.actions.ActionListener;
import javafx.scene.image.Image;

public class Agent {
    private float hp;
    private String name;
    private int lvl;
    //private CA
    //private PA
    private ActionListener action_listener;
    private String img_path;

    public Agent(float hp, String name, int lvl, String img_path,
                 ActionListener action_listener) {
        this.hp = hp;
        this.name = name;
        this.lvl = lvl;
        this.img_path = img_path;
        this.action_listener = action_listener;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
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
