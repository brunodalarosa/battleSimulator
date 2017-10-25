package BS.Loggers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class SystemLogger {

    private FileWriter fileWriter;
    private PrintWriter printWriter;
    private Date date;

    /**
     * Constructor for the system logger
     */
    public SystemLogger(){
        try {
            this.fileWriter = new FileWriter("system_log.txt", true);
            this.printWriter = new PrintWriter(this.fileWriter);
            this.date = new Date();
        } catch (IOException e) {
            e.printStackTrace();
        }

        printWriter.printf("Battle simulator started at %s\n\n",this.date.toString());
    }

    /**
     * Log a new battle simulation
     * @param id The battle ID
     */
    public void newBattle(String id){
        printWriter.printf("New battle simulation [%s] started at %s",
                id, this.date.toString());
    }
}
