package BS.GUI.components;

import BS.game.agents.Agent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

/**
 * A GUI component for showing Agents on the battle
 * @author Bruno Cesar
 * @since 9/11/17
 */
public class AgentModel extends GridPane {
    Agent agent;

    ImageView agent_sprite;
    ImageView icon_burn;
    ImageView icon_freeze;
    ImageView icon_elec;
    ImageView icon_poisoned;
    ImageView icon_broke;
    ImageView icon_acid;
    ImageView icon_confused;
    ImageView icon_sleep;

    Label lbl_HP;
    Label lbl_name;

    VBox status1;
    VBox status2;
    ProgressBar HP_bar;

    ColumnConstraints v1;
    ColumnConstraints v2;
    ColumnConstraints v3;
    RowConstraints h1;
    RowConstraints h2;
    RowConstraints h3;

    public AgentModel(Agent agent) {
        this.agent = agent;
        agent_sprite = new ImageView(agent.getImg_path());
        lbl_name = new Label(agent.getName());
        lbl_HP = new Label(agent.getHp() + "/" + agent.getMax_hp() +" HP");
        HP_bar = new ProgressBar(1); //Full Bar
        config();

    }

    public void config(){
        this.maxHeight(100);
        this.maxWidth(125);
        this.setAlignment(Pos.CENTER);

        v1 = new ColumnConstraints();
        v1.setHalignment(HPos.CENTER);
        v1.setHgrow(Priority.SOMETIMES);
        v1.setMinWidth(10);
        v1.setPrefWidth(100);

        v2 = new ColumnConstraints();
        v2.setHalignment(HPos.CENTER);
        v2.setHgrow(Priority.SOMETIMES);
        v2.setMinWidth(10);
        v2.setPercentWidth(60);
        v2.setPrefWidth(100);

        v3 = new ColumnConstraints();
        v3.setHalignment(HPos.CENTER);
        v3.setHgrow(Priority.SOMETIMES);
        v3.setMinWidth(10);
        v3.setPrefWidth(100);
        this.getColumnConstraints().addAll(v1,v2,v3);

        h1 = new RowConstraints();
        h1.setValignment(VPos.CENTER);
        h1.setVgrow(Priority.SOMETIMES);
        h1.setMinHeight(10);
        h1.setPrefHeight(30);

        h2 = new RowConstraints();
        h2.setValignment(VPos.CENTER);
        h2.setVgrow(Priority.SOMETIMES);
        h2.setMinHeight(10);
        h2.setPercentHeight(70);
        h2.setPrefHeight(30);

        h3 = new RowConstraints();
        h3.setValignment(VPos.CENTER);
        h3.setVgrow(Priority.SOMETIMES);
        h3.setMinHeight(10);
        h3.setPrefHeight(30);
        this.getRowConstraints().addAll(h1,h2,h3);

        //Agent Sprite
        agent_sprite.setFitHeight(150); //Height
        agent_sprite.setFitWidth(100); //Width
        agent_sprite.preserveRatioProperty().setValue(true);
        add(agent_sprite,1,1);

        //Agent Name
        setMargin(lbl_name,new Insets(5,0,0,0));
        lbl_name.setFont(new Font(18));
        setMargin(lbl_name,new Insets(5,0,0,0));
        add(lbl_name,1,2);

        //Status 1
        status1 = new VBox();
        icon_burn = new ImageView("icons/fire.png");
        icon_burn.setFitHeight(30);
        icon_burn.setPreserveRatio(true);
        icon_burn.setVisible(false);
        setMargin(icon_burn,new Insets(5,0,5,0));
        status1.getChildren().add(icon_burn);

        icon_freeze = new ImageView("icons/snowflake-2.png");
        icon_freeze.setFitHeight(30);
        icon_freeze.setPreserveRatio(true);
        icon_freeze.setVisible(false);
        setMargin(icon_freeze,new Insets(5,0,5,0));
        status1.getChildren().add(icon_freeze);

        icon_elec = new ImageView("icons/electric.png");
        icon_elec.setFitHeight(30);
        icon_elec.setPreserveRatio(true);
        icon_elec.setVisible(false);
        setMargin(icon_elec,new Insets(5,0,5,0));
        status1.getChildren().add(icon_elec);

        icon_poisoned = new ImageView("icons/poison-gas.png");
        icon_poisoned.setFitHeight(30);
        icon_poisoned.setPreserveRatio(true);
        icon_poisoned.setVisible(false);
        setMargin(icon_poisoned,new Insets(5,0,5,0));
        status1.getChildren().add(icon_poisoned);

        status1.setAlignment(Pos.TOP_CENTER);
        status1.setPrefHeight(200);
        status1.setPrefWidth(100);

        add(status1,2,1);

        //Status 2
        status2 = new VBox();

        icon_broke = new ImageView("icons/broken-shield.png");
        icon_broke.setFitHeight(30);
        icon_broke.setPreserveRatio(true);
        icon_broke.setVisible(false);
        setMargin(icon_broke,new Insets(5,0,5,0));
        status2.getChildren().add(icon_broke);

        icon_acid = new ImageView("icons/chemical-bolt.png");
        icon_acid.setFitHeight(30);
        icon_acid.setPreserveRatio(true);
        icon_acid.setVisible(false);
        setMargin(icon_acid,new Insets(5,0,5,0));
        status2.getChildren().add(icon_acid);

        icon_confused = new ImageView("icons/star-swirl.png");
        icon_confused.setFitHeight(30);
        icon_confused.setPreserveRatio(true);
        icon_confused.setVisible(false);
        setMargin(icon_confused,new Insets(5,0,5,0));
        status2.getChildren().add(icon_confused);

        icon_sleep = new ImageView("icons/pillow.png");
        icon_sleep.setFitHeight(30);
        icon_sleep.setPreserveRatio(true);
        icon_sleep.setVisible(false);
        setMargin(icon_sleep,new Insets(5,0,5,0));
        status2.getChildren().add(icon_sleep);

        status2.setAlignment(Pos.TOP_CENTER);
        status2.setPrefHeight(200);
        status2.setPrefWidth(100);

        add(status2,0,1);

        //HP Bar
        HP_bar.setPrefHeight(20);
        HP_bar.setPrefWidth(120);
        setMargin(HP_bar, new Insets(50,0,0,0));
        add(HP_bar,1,0);

        //label HP
        add(lbl_HP,1,0);
    }

    /**
     * Refresh the Agent info on the GUI
     */
    public void refresh(){
        Double percent = (double) ((agent.getHp() * 100) / agent.getMax_hp() / 100); //Get HP %
        System.out.println(percent);
        HP_bar.setProgress(percent);
        lbl_HP.setText(agent.getHp() + "/" + agent.getMax_hp() +" HP"); //todo arredondar para uma casa decimal.
    }
}
