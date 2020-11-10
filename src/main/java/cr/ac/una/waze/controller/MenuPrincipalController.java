/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.waze.controller;

import cr.ac.una.waze.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author crist
 */
public class MenuPrincipalController extends Controller implements Initializable {

    @FXML
    private Button btnMapa;
    @FXML
    private TextField txt;
    @FXML
    private Label lbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void initialize() {
        
    }

    @FXML
    private void onActionBtnMapa(ActionEvent event) {
        FlowController.getInstance().goViewInWindow("Mapa");
        ((Stage)btnMapa.getScene().getWindow()).close();
    }

    @FXML
    private void dividir(ActionEvent event) {
        
        String d = txt.getText();
        int num = Integer.valueOf(d);
        
        Double dd = num/1.27;
        lbl.setText(dd.toString());
    }
    
}
