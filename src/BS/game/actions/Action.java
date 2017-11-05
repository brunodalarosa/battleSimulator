package BS.game.actions;

import BS.game.agents.Agent;

public class Action {
    private Agent source;
    private Agent target;

    public Action(Agent source, Agent target) {
        this.source = source;
        this.target = target;
    }

    public void execute(){

    }

    public Agent getSource() {
        return source;
    }

    public void setSource(Agent source) {
        this.source = source;
    }

    public Agent getTarget() {
        return target;
    }

    public void setTarget(Agent target) {
        this.target = target;
    }
}
