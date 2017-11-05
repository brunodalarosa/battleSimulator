package BS.GUI.controllers;

import FXController.BaseController;
import FXController.ScreenController;
import com.jfoenix.controls.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


/**
 * Controlador da tela de inimgos
 * @author Bruno Cesar
 * @since 2/11/2017
 */
public class BestiaryController implements BaseController {
    private ScreenController controller_;

    public JFXComboBox cbox_classes_; //TODO add type
    public JFXTreeTableView ttv_family;
    public JFXTreeTableView ttv_enemies;
    public ImageView img_enemy_;     //Enemy image
    public JFXTextField txt_name_;   //Enemy's name
    public JFXComboBox cbox_rarity_; //Enemy's rarity
    public JFXTextField lvl_min_;    //Minimum level of enemy
    public JFXTextField lvl_max_;    //Maximum level of enemy
    public JFXComboBox cbox_type_;   //Type of the enemy (Boss/Pacific/Common)
    public JFXComboBox cbox_sk_;     //Skill Tree of the enemy

    /* Enemy Combat Attributes */

    public JFXTextField txt_att_HP;
    public JFXTextField txt_att_MP;
    public JFXTextField txt_att_WP;
    public JFXTextField txt_att_SPD;
    public JFXTextField txt_att_ATK;
    public JFXTextField txt_att_MATK;
    public JFXTextField txt_att_DEF;
    public JFXTextField txt_att_MDEF;
    public JFXTextField txt_att_ACC;
    public JFXTextField txt_att_EVA;
    public JFXTextField txt_att_NOT;
    public JFXTextField txt_att_CRIT;

    public JFXTextField txt_att_fireBonus;
    public JFXTextField txt_att_iceBonus;
    public JFXTextField txt_att_eletricBonus;
    public JFXTextField txt_att_windBonus;
    public JFXTextField txt_att_poisonBonus;
    public JFXTextField txt_att_acidBonus;
    public JFXTextField txt_att_darkBonus;
    public JFXTextField txt_att_healBonus;
    public JFXTextField txt_att_heal_absorbBonus;
    public JFXTextField txt_att_pierceBonus;
    public JFXTextField txt_att_bashBonus;
    public JFXTextField txt_att_slashBonus;
    public JFXTextField txt_att_mp_regenBonus;
    public JFXTextField txt_att_hp_regenBonus;

    public JFXTextField txt_att_fireRes;
    public JFXTextField txt_att_iceRes;
    public JFXTextField txt_att_eletricRes;
    public JFXTextField txt_att_windRes;
    public JFXTextField txt_att_poisonRes;
    public JFXTextField txt_att_acidRes;
    public JFXTextField txt_att_darkRes;
    public JFXTextField txt_att_sleepRes;
    public JFXTextField txt_att_muteRes;
    public JFXTextField txt_att_blockChance;

    public JFXTextArea txt_desc_;

    public GridPane main_pane_;

    /**
     * Opens the editing of enemy
     */
    public void edit(){

    }

    /**
     * Delete the selected enemie
     */
    public void delete(){

    }

    /**
     * Create a new enemy in the selected family
     */
    public void create(){

    }


    @Override
    public void atualizar() {
        //TODO Garantir que toda vez que abrir a tela não terá nenhuma familia nem inimigo selecionados

    }

    @Override
    public void init() {
        //TODO definir as tree table views

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
