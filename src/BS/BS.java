package BS;

import BS.Loggers.SystemLogger;
import BS.SkillTrees.SkillUtils;
import GUI.GUIController;
import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * Classe principal da aplicação
 * @author Bruno Cesar
 * @since 19/10/17
 */
public class BS {
    private static BS instance_ = null;
    private Stage main_stage_;

    private SystemLogger sysLog;
    private SkillUtils skillUtils;


    /**
     * @return A instância do singleton
     */
    public static BS getInstance() {
        if(instance_ == null){
            instance_ = new BS();
        }
        return instance_;
    }

    /**
     * Carrega os componentes principais do sistema e o inicia
     * @param main_stage Stage inicial necessário para a aplicação
     */
    void start(Stage main_stage) throws Exception {
        main_stage_ = main_stage;

        initSystems();

        GUIController.getInstance().showGUI();
    }

    /**
     * Inicializa os sistemas iniciais (GUI, BD, Logger, etc)
     * @throws Exception Em caso de erro em alguma das partes
     */
    private void initSystems() throws Exception{
        GUIController.getInstance().guiInit(main_stage_);
        this.sysLog = new SystemLogger();
        this.skillUtils = new SkillUtils();
    }


    public SystemLogger getSysLog() {
        return sysLog;
    }

    public SkillUtils getSkillUtils() {
        return skillUtils;
    }

    /**
     * Função executada quando a aplicação é encerrada
     */
    public void stop(){
        Platform.exit();
        }

    /**
     * Construtor privado sem argumentos
     */
    private BS() {
    }
}
