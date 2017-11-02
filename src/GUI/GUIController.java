package GUI;

import FXController.ScreenController;
import FXController.StagesController;
import javafx.stage.Stage;

import java.net.URISyntaxException;

/**
 * Singleton responsável por executar serviços relacionados a GUI
 * @author Cristofer Oswald
 * @author Bruno Cesar
 * @since 19/10/17
 */
public class GUIController {
    private static GUIController instance_ = new GUIController();
    private ScreenController main_controller;

    public ScreenController getMain_controller() {
        return main_controller;
    }

    /**
     * @return A instância do singleton
     */
    public static GUIController getInstance() {
        return instance_;
    }

    /**
     * Inicializa o controlador geral da GUI e carrega as telas
     * @param main_stage O Stage principal dado pelo Application
     */
    public void guiInit(Stage main_stage) throws URISyntaxException {
        //Cria um controlador para cada janela
        main_controller = new ScreenController(main_stage, true);
        //Adiciona os controladores ao controlador de janelas
        StagesController.getInstance().addScreenController("main", main_controller);

        main_controller.loadScreen("main",
                GUIController.class.getResource("/fxmls/main.fxml"));
        main_controller.loadScreen("weapons",
                GUIController.class.getResource("/fxmls/weapons.fxml"));
        main_controller.loadScreen("create_weapon",
                GUIController.class.getResource("/fxmls/create_weapon.fxml"));
        main_controller.loadScreen("bestiary",
                GUIController.class.getResource("/fxmls/bestiary.fxml"));
        main_controller.loadScreen("characters",
                GUIController.class.getResource("/fxmls/characters.fxml"));


        main_controller.setInitialScreen("main");
    }

    /**
     * Mostra a tela principal da GUI
     */
    public void showGUI(){
        StagesController.getInstance().getScreenController("main").showScreen();
    }


    /**
     * Construtor privado sem argumentos
     */
    private GUIController() {

    }
}