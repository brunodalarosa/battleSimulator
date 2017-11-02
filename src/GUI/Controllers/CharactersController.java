package GUI.Controllers;

import FXController.BaseController;
import FXController.ScreenController;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
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

    public JFXComboBox cbox_classes_; //TODO add type
    public JFXTreeTableView ttv_characters;
    public ImageView img_enemy_;     //Enemy image
    public JFXTextField txt_name_;   //Enemy's name
    public JFXComboBox cbox_sex_; //Enemy's rarity
    public JFXComboBox cbox_accessory_;
    public JFXComboBox cbox_head_;
    public JFXComboBox cbox_ring_;
    public JFXComboBox cbox_feet_;
    public JFXComboBox cbox_body_;
    public JFXComboBox cbox_back_;
    public JFXComboBox cbox_mainW_;
    public JFXComboBox cbox_subW_;
    public JFXTextField txt_lvl_;    //Character Level
    public JFXTextField txt_STR_;
    public JFXTextField txt_AGI_;
    public JFXTextField txt_VIT_;
    public JFXTextField txt_INT_;
    public JFXTextField txt_WIS_;
    public JFXTextField txt_LCK_;

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
