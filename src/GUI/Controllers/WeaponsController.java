package GUI.Controllers;

import BS.BS;
import FXController.BaseController;
import FXController.ScreenController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import javax.swing.text.html.ImageView;

/**
 * Controlador da tela principal
 * @author Bruno Cesar
 * @since 19/10/2017
 */
public class WeaponsController implements BaseController {
    private ScreenController controller_;

    public JFXComboBox cbox_classes_; //TODO add type
    public JFXButton btn_st_;
    public JFXTreeTableView ttview_list_;
    public ImageView img_weapon_;
    public Label lbl_name_;
    public Label lbl_rarity_;
    public Label lbl_lvl_;
    public Label lbl_durability_;
    public Label lbl_STR_;
    public Label lbl_AGI_;
    public Label lbl_INT_;
    public Label lbl_WIS_;
    public JFXTextArea txt_desc_;
    public JFXTextArea txt_atributes_;

    public GridPane main_pane_;

    /**
     * Opens the window for editing a weapon
     */
    public void edit(){

    }

    /**
     * Delete the selected weapon
     */
    public void delete(){

    }

    /**
     * Opens the windows for creating a weapon
     */
    public void create(){

    }

    /**
     * Opens the skill tree of selected weapon class
     */
    public void skillTree(){

    }


    @Override
    public void atualizar() {
        //TODO Garantir que toda vez que abrir a tela não terá nenhuma classe selecionada e a lista estará limpa

    }

    @Override
    public void init() {
        //TODO atribuir a cbox para as classes de armas existentes.

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
