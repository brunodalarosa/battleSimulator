package BS.game.actions.actionListeners;

import BS.game.actions.ActionListener;
import BS.game.actions.Skill;
import BS.game.agents.Agent;

import java.util.Random;

public class ControlledActionListener implements ActionListener {
    private Agent controlled;
    private Agent player;

    public ControlledActionListener(Agent controlled, Agent player) {
        this.controlled = controlled;
        this.player = player;
    }

    @Override
    public Skill getAction() {
        if(controlled == null) System.out.printf("nao tem controlled");
        if(controlled.getSkills() == null) System.out.println("nao tem skills");
        int i = new Random().nextInt(controlled.getSkills().size());
        controlled.getSkills().get(i).setTarget(player);
        return controlled.getSkills().get(i);
    }
}
