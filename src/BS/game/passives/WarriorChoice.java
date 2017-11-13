package BS.game.passives;

import BS.game.agents.Agent;

/**
 * Escolha do guerreiro - Garante bônus de ataque para ataques consecutivos no mesmo alvo.
 */
public class WarriorChoice extends PassiveEffect {
    private int lvl;
    private Agent marked = null;
    private int bonus_atk = 0;

    public WarriorChoice(Agent target, String name, int lvl) {
        super(target, "Warrior choice");

    }


    public void checkTarget(Agent a){
        if(marked == null){
            marked = a;
        } else{
            if(a == marked){
                if(bonus_atk < lvl){
                    bonus_atk += 1;
                }
            } else{
                bonus_atk = 0;
            }
        }
    }

    @Override
    public void applyEffect() {

    }
}
