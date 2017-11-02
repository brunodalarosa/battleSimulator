package GUI.Controllers;

import BS.BS;
import FXController.BaseController;
import FXController.ScreenController;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * Controlador da tela principal
 * @author Bruno Cesar
 * @since 19/10/2017
 */
public class MainController implements BaseController {
    private ScreenController controller_;
    public Label lbl_ver_;

    public VBox main_pane_;

    public void battle(){

    }

    public void party(){

    }

    public void mobs(){

    }

    public void characters(){
        controller_.setVisibleScreen("characters");

    }

    public void weapons(){
        //TODO trocar para abrir outra janela?
        controller_.setVisibleScreen("weapons");
    }

    public void equipment(){

    }

    public void items(){

    }

    public void bestiary(){
        controller_.setVisibleScreen("bestiary");

    }

    /**
     * Stop the program and close all the windows
     */
    public void close(){
        //TODO Implement a confirmDialog Pop-up
       BS.getInstance().stop();
    }

    @Override
    public void atualizar() {

    }

    @Override
    public void init() {
        lbl_ver_.setText("Alpha ver. Bruno Cesar, 2017");
    }

    @Override
    public void setMainController(ScreenController controller) {
        controller_ = controller;
    }

    @Override
    public double getWidth() {
        return main_pane_.getPrefWidth();
    }

    @Override
    public double getHeight() {
        return main_pane_.getPrefHeight();
    }
}
