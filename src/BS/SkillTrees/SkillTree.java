package BS.SkillTrees;

import BS.Agents.Agent;

import java.util.Random;

/**
 * Base SKillTree class
 */
public class SkillTree {
    private String name;

    /**
     * Calculates if an attack will hit.
     * @param source_acc The source accuracy
     * @param target_eva The target evasion
     * @return True if if hits or false if it doesn't
     */
    public boolean hit(float source_acc, float target_eva){
        //TODO testar se essa formula funciona bem, pesquisar mais sobre, revisar.
        int chance;
        Random rnd = new Random();

        if(source_acc - target_eva >= 0){
            chance = 99;
        } else if(source_acc - target_eva < 5){
            chance = 5;
        } else chance = Float.floatToIntBits(source_acc - target_eva);

        int val = rnd.nextInt(100);

        return val < chance;
    }

    /**
     * Calculate and apply a basic attack (Physical)
     * @param source The agent who's attacking
     * @param target The target of the attack
     */
    public void basicAttacck(Agent source, Agent target){
        //TODO Encontrar uma boa formula de cálculo para ataque fisico e modificar esta função implementando ele.
        boolean hit = hit(source.getAcc(),target.getEva());

        if(hit){
            float dmg;

            if(source.getAtk() - target.getDef() <= source.getAtk() * 0.01f) {
                dmg = source.getAtk() * 0.01f;
            } else dmg = source.getAtk() - target.getDef();

            //TODO log attack
            //TODO display attack
            target.damage(dmg);

        } else{
            //TODO log miss
            //TODO display miss
        }
    }
}
