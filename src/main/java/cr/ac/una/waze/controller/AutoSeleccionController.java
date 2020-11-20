/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.waze.controller;

import cr.ac.una.waze.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author J Isaac CV
 */
public class AutoSeleccionController extends Controller implements Initializable {

    @FXML
    private Button btnIrMapa;
    @FXML
    private ImageView imgvBtnCar;
    @FXML
    private ImageView imgvBtnCar2;
    @FXML
    private ImageView imgvBtnCar3;
    @FXML
    private ImageView imgvBtnCar4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RotateTransition rt1 = new RotateTransition(Duration.seconds(30), imgvBtnCar);
        rt1.setByAngle(360);
        rt1.setOnFinished(t -> {rt1.play();});
        rt1.play();
        RotateTransition rt2 = new RotateTransition(Duration.seconds(30), imgvBtnCar2);
        rt2.setByAngle(360);
        rt2.setOnFinished(t -> {rt2.play();});
        rt2.play();
        RotateTransition rt3 = new RotateTransition(Duration.seconds(30), imgvBtnCar3);
        rt3.setByAngle(360);
        rt3.setOnFinished(t -> {rt3.play();});
        rt3.play();
        RotateTransition rt4 = new RotateTransition(Duration.seconds(30), imgvBtnCar4);
        rt4.setByAngle(360);
        rt4.setOnFinished(t -> {rt4.play();});
        rt4.play();
        
    }
    
    @Override
    public void initialize() {
        FlowController.setCarro("car");
    }

    private void marcarAutoSelec(Button btn){
        RotateTransition rt = new RotateTransition(Duration.seconds(1), btn);
        btn.getStyleClass().add("nodo-select");
        rt.setByAngle(360);
        rt.play();
        descarmarAutosExcepto(btn);
    }
    
    private void descarmarAutosExcepto(Button btn){
        ((FlowPane)btn.getParent()).getChildren().stream().filter(t -> t.getStyleClass().contains("nodo-select") && !t.equals(btn)).forEach(t -> {t.getStyleClass().remove("nodo-select");});
    }
    
    @FXML
    private void onActionSelectCat(ActionEvent event) {
        FlowController.setCarro("car");
        marcarAutoSelec(((Button)event.getTarget()));
    }

    @FXML
    private void onActionSelectCat2(ActionEvent event) {
        FlowController.setCarro("car2");
        marcarAutoSelec(((Button)event.getTarget()));
    }

    @FXML
    private void onActionSelectCat3(ActionEvent event) {
        FlowController.setCarro("car3");
        marcarAutoSelec(((Button)event.getTarget()));
    }

    @FXML
    private void onActionSelectCat4(ActionEvent event) {
        FlowController.setCarro("car4");
        marcarAutoSelec(((Button)event.getTarget()));
    }

    @FXML
    private void onActionIrAlMapa(ActionEvent event) {
        FlowController.getInstance().goViewInWindow("Mapa");
        ((Stage)btnIrMapa.getScene().getWindow()).close();
    }
}
