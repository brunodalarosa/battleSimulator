package BS.game.actions;

import BS.game.agents.Agent;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic skill class
 * @author Bruno Cesar
 * @since 25/10/2017
 */
public abstract class Skill{
    protected Agent source;
    protected List<Agent> target;
    protected String name;

    public Skill(Agent source, String name) {
        this.source = source;
        this.name = name;
    }

    /**
     * Display the skill for multi-target
     */
    protected void display(){
        System.out.print(source.getName() + " used " + this.name + " on ");
        for (Agent t: target) {
            System.out.print(t.getName() + " ");
        }
        System.out.println();
    }


    /**
     * Display the skill for single-target
     */
    protected void display(Agent target){
        System.out.println(source.getName() + " used " + this.name + " on " + target.getName());
    }

    public abstract void execute();

    public Agent getSource() {
        return source;
    }

    public void setSource(Agent source) {
        this.source = source;
    }

    public List<Agent> getTarget() {
        return target;
    }

    public String getName() {
        return name;
    }

    public void setTarget(List<Agent> target) {
        this.target = target;
    }

    public void setTarget(Agent target) {
        this.target = new ArrayList<>();
        this.target.add(target);
    }
}
