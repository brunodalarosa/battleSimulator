package BS.game.skillTrees;

import BS.old.Agents.Agent;
import BS.BS;

/**
 * Basic attack action is considered a skill
 * @author Bruno Cesar
 * @since 25/10/2017
 */
public class basicAttack{

    /**
     * Calculate and apply a basic attack (Physical)
     * @param source The agent who's attacking
     * @param target The target of the attack
     */
    public basicAttack(Agent source, Agent target){
    /*    super(source);
        //TODO Encontrar uma boa formula de cálculo para ataque fisico e modificar esta função implementando ela.
        boolean hit = BS.getInstance().getSkillUtils().hit(source.getAttributes().getAcc(),target.getAttributes().getEva());

        if(hit){
            float dmg;

            if(source.getAttributes().getAtk() - target.getAttributes().getDef() <= source.getAttributes().getAtk() * 0.01f) {
                dmg = source.getAttributes().getAtk() * 0.01f;
            } else dmg = source.getAttributes().getAtk() - target.getAttributes().getDef();

            //TODO log attack
            //TODO display attack
            target.damage(dmg);

        } else{
            //TODO log miss
            //TODO display miss
        }*/
    }
}
