package BS.loggers;

import BS.old.Battle.Battle;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class BattleLogger{

    private FileWriter fileWriter;
    private PrintWriter printWriter;
    private Date date;
    private Battle b;

    /**
     * Create a logger and an empty log file.
     *
     */
    public BattleLogger(Battle b) {
        this.b = b;
        String fname = "battle_" + b.getId() + ".txt";
        try {
            this.fileWriter = new FileWriter(fname);
            this.printWriter = new PrintWriter(this.fileWriter);
            this.date = new Date();
        } catch (IOException e) {
            e.printStackTrace();
        }

        banner();

    }

    /**
     * Print the battle banner with all the initial Battle information
     */
    public void banner(){
        printWriter.printf("Battle %s started at %s",b.getId(),this.date.toString());
        //TODO construir o banner certo
    }
}