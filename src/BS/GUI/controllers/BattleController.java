package BS.GUI.controllers;

import BS.BS;
import BS.old.Agents.Agent;
import FXController.BaseController;
import FXController.ScreenController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BattleController implements BaseController {
    private ScreenController controller_;

    public VBox main_pane;
    public HBox hbox_skills;
    public HBox hbox_fila;
    public GridPane battle_grid;
    public JFXButton start;
    public JFXButton cancel;
    public JFXComboBox<Agent> cbox_target;


    public void close(){
        BS.getInstance().stop();
    }

    /**
     * Start a battle
     */
    public void start(){

    }

    /**
     * Cancel the ongoing battle
     */
    public void cancel(){

    }

    @Override
    public void atualizar() {

    }

    @Override
    public void init() {

    }

    @Override
    public void setMainController(ScreenController controller) {
        this.controller_ = controller;
    }

    @Override
    public double getWidth() {
        return main_pane.getPrefWidth();
    }

    @Override
    public double getHeight() {
        return main_pane.getPrefHeight();
    }
}
