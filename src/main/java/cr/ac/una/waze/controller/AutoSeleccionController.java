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
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author J Isaac CV
 */
public class AutoSeleccionController extends Controller implements Initializable {

    @FXML
    private Button btnIrMapa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @Override
    public void initialize() {
        FlowController.setCarro("car");
    }

    @FXML
    private void onActionSelectCat(ActionEvent event) {
        FlowController.setCarro("car");
    }

    @FXML
    private void onActionSelectCat2(ActionEvent event) {
        FlowController.setCarro("car2");
    }

    @FXML
    private void onActionSelectCat3(ActionEvent event) {
        FlowController.setCarro("car3");
    }

    @FXML
    private void onActionSelectCat4(ActionEvent event) {
        FlowController.setCarro("car4");
    }

    @FXML
    private void onActionIrAlMapa(ActionEvent event) {
        FlowController.getInstance().goViewInWindow("Mapa");
        ((Stage)btnIrMapa.getScene().getWindow()).close();
    }
}
