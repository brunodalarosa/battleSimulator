package GUI.Controllers;

import BS.Items.Weapon;
import FXController.BaseController;
import FXController.ScreenController;
import com.jfoenix.controls.*;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import javax.swing.text.html.ImageView;

/**
 * Controlador da tela principal
 * @author Bruno Cesar
 * @since 19/10/2017
 */
public class CreateWeaponController implements BaseController {
    private ScreenController controller_;
    private boolean editing;

    public JFXComboBox cbox_class; //TODO add type

    public ImageView img_weapon_;
    public JFXTextField txtf_STR;
    public JFXTextField txtf_AGI;
    public JFXTextField txtf_INT;
    public JFXTextField txtf_WIS;
    public JFXTextField txtf_name;
    public JFXTextField txtf_min_lvl;
    public JFXTextField txtf_durability;

    public JFXTextArea txt_desc_;
    public JFXTreeView treeview_atributes;

    public GridPane main_pane_;

    /**
     * Open a select image screen to save as the weapon picture
     */
    public void changeImage(){

    }

    /**
     * Auxiliary method to load the data of a weapon into the screen. Used in the EDIT weapon button.
     * @param w The weapon to be edited
     */
    public void loadWeapon(Weapon w){
        txtf_name.setText(w.getName());
        txt_desc_.setText(w.getDesc());
        txtf_min_lvl.setText(Integer.toString(w.getRequirements().getLvl()));
        txtf_durability.setText(Integer.toString(w.getDurability()));
        txtf_STR.setText(Integer.toString(w.getRequirements().getSTR()));
        txtf_AGI.setText(Integer.toString(w.getRequirements().getAGI()));
        txtf_INT.setText(Integer.toString(w.getRequirements().getINT()));
        txtf_WIS.setText(Integer.toString(w.getRequirements().getWIS()));

        //TODO Load atributes into atribute treeView
        //TODO Load rarity into rarity comboBox
        //TODO Load weapon class into class comboBox
    }

    private void clean(){
        txtf_name.clear();
        txt_desc_.clear();
        txtf_min_lvl.clear();
        txtf_durability.clear();
        txtf_STR.clear();
        txtf_AGI.clear();
        txtf_INT.clear();
        txtf_WIS.clear();

        //TODO clear treeView, rarity comboBox and weapon class comboBox
    }

    /**
     * Discard the editing or creation of weapon
     */
    public void cancel(){

    }

    /**
     * Save the editing in a weapon or create a new one
     */
    public void save(){
        if(editing){
            //TODO save edit in the weapon
        } else{
            //TODO save a new weapon
        }
    }

    @Override
    public void atualizar() {
        //TODO Garantir que toda vez que abrir a tela não terá nenhuma classe selecionada e a lista estará limpa

    }

    @Override
    public void init() {
        //TODO atribuir a cbox para as classes de armas existentes.
        //TODO atribuir a comboBox de raridade para as raridades existentes

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
