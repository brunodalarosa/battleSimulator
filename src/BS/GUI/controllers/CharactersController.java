package BS.GUI.controllers;

import FXController.BaseController;
import FXController.ScreenController;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


/**
 * Controlador da tela de personagens
 * @author Bruno Cesar
 * @since 2/11/2017
 */
public class CharactersController implements BaseController {
    private ScreenController controller_;

    public JFXTreeTableView ttv_characters;

    public ImageView img_character_;
    public JFXTextField txt_name_;
    public JFXComboBox cbox_sex_;
    public JFXTextField txt_lvl_;

    /* Equipments */

    public JFXComboBox cbox_accessory_;
    public JFXComboBox cbox_head_;
    public JFXComboBox cbox_ring_;
    public JFXComboBox cbox_feet_;
    public JFXComboBox cbox_body_;
    public JFXComboBox cbox_back_;
    public JFXComboBox cbox_mainW_;
    public JFXComboBox cbox_subW_;

    /* Primary Attributes */

    public JFXTextField txt_STR_;
    public JFXTextField txt_AGI_;
    public JFXTextField txt_VIT_;
    public JFXTextField txt_INT_;
    public JFXTextField txt_WIS_;
    public JFXTextField txt_LCK_;

    /* Combat Attributes */

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


    public GridPane main_pane_;

    /**
     * Opens the editing of the selected character
     */
    public void edit(){

    }

    /**
     * Delete the selected character
     */
    public void delete(){

    }

    /**
     * Create a new blank character
     */
    public void create(){

    }


    @Override
    public void atualizar() {
        //TODO Garantir que toda vez que abrir a tela não terá nenhum personagem selecionado

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
