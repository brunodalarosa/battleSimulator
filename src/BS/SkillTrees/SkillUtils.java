package BS.SkillTrees;

import java.util.Random;

/**
 * Utility functions for skills
 * @author Bruno Cesar
 * @since 25/10/2017
 */
public class SkillUtils {

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
}
