package BS.game.agents;


import BS.game.actions.ActionListener;
import BS.game.actions.Skill;

import java.util.List;

public class Agent {
    private float hp;
    private String name;
    private int lvl;
    private List<Skill> skills;
    //private CA
    //private PA
    private ActionListener action_listener;
    private String img_path;

    public Agent(float hp, String name, int lvl, String img_path,
                 ActionListener action_listener, List<Skill> skills) {
        this.hp = hp;
        this.name = name;
        this.lvl = lvl;
        this.skills = skills;
        this.img_path = img_path;
        this.action_listener = action_listener;
    }

    public float receiveDamage(float damage){
        hp = hp - damage;
        return hp;
    }

    public String getImgPath() {
        return img_path;
    }

    public void setImgPath(String img_path) {
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

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public ActionListener getActionListener() {
        return action_listener;
    }

    public void setActionListener(ActionListener action_listener) {
        this.action_listener = action_listener;
    }
}
