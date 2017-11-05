package BS.GUI.controllers;

import BS.BS;
import BS.game.Game;
import BS.game.actions.Skill;
import BS.game.actions.actionListeners.ControlledActionListener;
import BS.game.actions.actionListeners.PlayerActionListener;
import BS.game.actions.skills.BasicAttack;
import BS.game.actions.skills.StrongAttack;
import BS.game.actions.skills.WeakAttack;
import BS.game.agents.Agent;
import FXController.BaseController;
import FXController.ScreenController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;

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
    public Agent target;


    //Teste
    private Game game;
    private List<Agent> agents;
    private Agent player;
    private Agent enemy;
    private List<Skill> player_skills = new ArrayList<>();
    private List<Skill> enemy_skills = new ArrayList<>();

    PlayerActionListener actionListener;



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

        for (Skill s: player_skills) {
            JFXButton btn_skill = new JFXButton(s.getName());
            btn_skill.setOnAction(event -> {
                s.setTarget(target);
                actionListener.setNextSkill(s);
                game.gameLoop();
            });
            btn_skill.setFont(new Font(24));
            hbox_skills.getChildren().add(btn_skill);
        }

    }

    @Override
    public void init() {
        //Teste basico

        cbox_target.getItems().addAll(enemy);
        cbox_target.setOnAction(event -> target = cbox_target.getValue());

        agents = new ArrayList<>();


        player = new Agent(10, "Paula",1, "/sprites/humans/spr_f_traveler_idle_anim.gif",
                player_skills);
        actionListener = new PlayerActionListener(player);
        player.setActionListener(actionListener);

        enemy = new Agent(5, "Beedrill",2, "/sprites/animals/spr_wasp_idle_anim.gif",
                enemy_skills);
        enemy.setActionListener(new ControlledActionListener(enemy, player));

        Image playerImage = new Image(player.getImgPath(),true);
        Image enemyImage = new Image(enemy.getImgPath(),true);

        player_skills.add(new BasicAttack(player));
        enemy_skills.add(new WeakAttack(enemy));
        enemy_skills.add(new StrongAttack(enemy));

        enemies_grid.getChildren().add(new ImageView(enemyImage));
        allies_grid.getChildren().add(new ImageView(playerImage));

        agents.add(player);
        agents.add(enemy);
        game = new Game(agents);

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
