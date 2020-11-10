/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.waze.controller;

import cr.ac.una.waze.util.Calle;
import cr.ac.una.waze.util.Nodo;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author crist
 */
public class MapaController extends Controller implements Initializable {


    private List<Nodo> nodos;
    
    private Calle[][] calles;
    @FXML
    private ImageView imvMapa;
    @FXML
    private AnchorPane root;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nodos = new ArrayList<>();
        calles = new Calle[78][78];
    }    

    @Override
    public void initialize() {
        iniList();
    }
    
    private void iniList(){
        nodos.add(new Nodo(0L,377,39));
        nodos.add(new Nodo(1L,312,98));  
        nodos.add(new Nodo(2L,459,198)); 
        nodos.add(new Nodo(3L,398,225)); 
        nodos.add(new Nodo(4L,491,245)); 
        nodos.add(new Nodo(5L,460,318)); 
        nodos.add(new Nodo(6L,535,316));
        nodos.add(new Nodo(7L,523,342)); 
        nodos.add(new Nodo(8L,578,386));
        nodos.add(new Nodo(9L,558,423)); 
        nodos.add(new Nodo(10L,664,530));
        nodos.add(new Nodo(11L,628,584)); 
        
        nodos.add(new Nodo(12L,292,201));
        nodos.add(new Nodo(13L,370,169));
        nodos.add(new Nodo(14L,286,241));
        nodos.add(new Nodo(15L,268,334));
        nodos.add(new Nodo(16L,334,252));
        nodos.add(new Nodo(17L,360,346));
        nodos.add(new Nodo(18L,355,415));
        nodos.add(new Nodo(19L,400,360));
        nodos.add(new Nodo(20L,381,419));
        nodos.add(new Nodo(21L,438,375));
        nodos.add(new Nodo(22L,417,433));
        nodos.add(new Nodo(23L,502,400));
        nodos.add(new Nodo(24L,492,430));
        nodos.add(new Nodo(25L,530,411));
        nodos.add(new Nodo(26L,481,459));
        nodos.add(new Nodo(27L,539,481));
        nodos.add(new Nodo(28L,235,388));
        nodos.add(new Nodo(29L,312,346));
        nodos.add(new Nodo(30L,211,415));
        nodos.add(new Nodo(31L,299,404));
        nodos.add(new Nodo(32L,167,460));
        nodos.add(new Nodo(33L,281,441));
        nodos.add(new Nodo(34L,255,498));
        nodos.add(new Nodo(35L,345,468));
        nodos.add(new Nodo(36L,318,527));
        nodos.add(new Nodo(37L,399,490));
        nodos.add(new Nodo(38L,375,550));
        nodos.add(new Nodo(39L,426,503));
        nodos.add(new Nodo(40L,405,562));
        nodos.add(new Nodo(41L,459,513));
        nodos.add(new Nodo(42L,422,569));
        nodos.add(new Nodo(43L,515,540));
        nodos.add(new Nodo(44L,492,599));
        nodos.add(new Nodo(45L,573,563));
        nodos.add(new Nodo(46L,547,621));
        nodos.add(new Nodo(47L,600,609));
        nodos.add(new Nodo(48L,587,636));
        nodos.add(new Nodo(49L,604,645));
        nodos.add(new Nodo(50L,135,500));
        nodos.add(new Nodo(51L,212,479));
        nodos.add(new Nodo(52L,195,511));
        nodos.add(new Nodo(53L,272,507));
        nodos.add(new Nodo(54L,194,553));
        nodos.add(new Nodo(55L,242,576));
        nodos.add(new Nodo(56L,286,595));
        nodos.add(new Nodo(57L,350,620));
        nodos.add(new Nodo(58L,400,635));
        nodos.add(new Nodo(59L,467,659));
        nodos.add(new Nodo(60L,523,680));
        nodos.add(new Nodo(61L,94,545));
        nodos.add(new Nodo(62L,137,575));
        nodos.add(new Nodo(63L,172,601));
        nodos.add(new Nodo(64L,222,625));
        nodos.add(new Nodo(65L,28,628));
        nodos.add(new Nodo(66L,98,624));
        nodos.add(new Nodo(67L,242,695));
        nodos.add(new Nodo(68L,323,708));
        nodos.add(new Nodo(69L,368,748));
        nodos.add(new Nodo(70L,349,806));
        nodos.add(new Nodo(71L,383,697));
        nodos.add(new Nodo(72L,423,711));
        nodos.add(new Nodo(73L,429,695));
        nodos.add(new Nodo(74L,448,717));
        nodos.add(new Nodo(75L,500,734));
        nodos.add(new Nodo(76L,495,754));
        nodos.add(new Nodo(77L,549,779));
        nodos.add(new Nodo(78L,410,840));
        nodos.add(new Nodo(79L,486,869));
        nodos.add(new Nodo(80L,515,882));

        
    }
    
    private void IniMap(){
        for(int i=0;i<78;i++){
            for(int j=0;j<78;j++){
                calles[i][j] = null;
            }
        }
        
    }

    @FXML
    private void onMouseClickedMapa(MouseEvent event) {
        Circle c = new Circle(event.getX()+5, event.getY()+5, 5, Paint.valueOf("#000000"));
        root.getChildren().add(c);
        verPuntoCer(event.getX(), event.getY());
        System.out.println("x: " + event.getX()+" y:" + event.getY());
    }
    
    private void verPuntoCer(Double x, Double y){
        Nodo aux = null;
        Double auxX=0d,auxY=0d;
        Double auxX2=999d,auxY2=999d;
        for(Nodo n : nodos){
            auxX = x - n.getX();
            auxY = y - n.getY();
            if(auxX < 0){ auxX=auxX*-1;}
            if(auxY < 0){auxY=auxY*-1;}
            if(auxX<auxX2 && auxY<auxY2){
                auxX2=auxX;
                auxY2=auxY;
                aux=n;
            }
        }
        System.out.println("El nodo más cercano es el " + aux.getId());
    }
}
