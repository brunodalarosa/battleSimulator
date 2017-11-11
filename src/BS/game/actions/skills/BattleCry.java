package BS.game.actions.skills;

import BS.game.agents.Agent;
import BS.game.buffs.BattleCryBuff;

import java.util.ArrayList;

public class BattleCry extends Skill {
    int lvl;

    public BattleCry(Agent source, float mp_cost, int lvl) {
        super(source, "Battle Cry", mp_cost);
        this.lvl = lvl;
    }

    @Override
    public void execute() {
        target = new ArrayList<>();
        target.add(source);
        new BattleCryBuff(this.source,lvl);
        display();
    }
}
