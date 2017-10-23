package BS;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Implements the Logging system, each instance represents a different log
 */
public class Logger {
    /**
     * Create a logger and an empty log file.
     * @param fname log and file name
     */
    public Logger(String fname) {

        this.fname = fname;
        try {
            fileWriter = new FileWriter(this.fname);
            printWriter = new PrintWriter(this.fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.date = new Date();

        printWriter.printf("%s Log created in %s\n", this.fname, this.date.toString());
    }

    /**
     * Constructor for the system logger
     * @param system_log
     */
    public Logger(boolean system_log){
        try {
            fileWriter = new FileWriter("system_log.txt", system_log);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.date = new Date();

        printWriter.printf("System log created in %s\n\n",this.date.toString());
    }

    private FileWriter fileWriter;
    private PrintWriter printWriter;
    private String fname;
    private Date date;
    private boolean append;

    /* System */

    /**
     * Log a new battle simulation
     * @param id The battle ID
     */
    public void newBattle(int id){
        printWriter.printf("New battle simulation [%d] started at %s",
                id, this.date.toString());
    }


}
