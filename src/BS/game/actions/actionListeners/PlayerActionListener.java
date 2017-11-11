package BS.game.actions.actionListeners;

import BS.game.actions.skills.Skill;
import BS.game.agents.Agent;

public class PlayerActionListener implements ActionListener {
    private Agent player;
    private Skill next_skill;

    public PlayerActionListener(Agent player) {
        this.player = player;
    }

    @Override
    public Skill getAction() {
        return next_skill;
    }

    public Agent getPlayer() {
        return player;
    }

    public void setPlayer(Agent player) {
        this.player = player;
    }

    public Skill getNextSkill() {
        return next_skill;
    }

    public void setNextSkill(Skill next_skill) {
        this.next_skill = next_skill;
    }
}
