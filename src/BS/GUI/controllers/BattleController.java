package BS.GUI.controllers;

import BS.BS;
import BS.game.actions.actionListeners.ControlledActionListener;
import BS.game.actions.actionListeners.PlayerActionListener;
import BS.game.agents.Agent;
import FXController.BaseController;
import FXController.ScreenController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BattleController implements BaseController {
    private ScreenController controller_;

    public VBox main_pane;
    public HBox hbox_skills;
    public HBox hbox_fila;
    public HBox enemies_grid;
    public HBox allies_grid;
    public JFXButton start;
    public JFXButton cancel;
    public JFXComboBox<Agent> cbox_target;


    //Teste
    private Agent player;
    private Agent enemy;

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
        //Teste basico

        player = new Agent(10, "Paula",1, "/sprites/humans/spr_f_traveler_idle_anim.gif", new PlayerActionListener());
        enemy = new Agent(5, "Beedrill",2, "/sprites/animals/spr_wasp_idle_anim.gif", new ControlledActionListener());

        Image playerImage = new Image(player.getImg_path(),true);
        Image enemyImage = new Image(enemy.getImg_path(),true);

        enemies_grid.getChildren().add(new ImageView(enemyImage));
        allies_grid.getChildren().add(new ImageView(playerImage));

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
