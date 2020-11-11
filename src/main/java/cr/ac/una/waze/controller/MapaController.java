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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 * FXML Controller class
 *
 * @author crist
 */
public class MapaController extends Controller implements Initializable {


   
    @FXML
    private ImageView imvMapa;
    @FXML
    private AnchorPane root;
    @FXML
    private Button btnPAB;
    @FXML
    private Button btnLimpiar;
    
    private int click;
    
    private Nodo ini;
    private Nodo fin;
    
    private Nodo iniNod;
    private Nodo finNod;
            
    private List<Nodo> nodos;
    
    private Calle[][] calles;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nodos = new ArrayList<>();
        calles = new Calle[78][78];
        click=0;
    }    

    @Override
    public void initialize() {
        iniList();
        
    }
    
    private void iniList(){
        nodos.add(new Nodo(0L,296,30));
        nodos.add(new Nodo(1L,247,76));  
        nodos.add(new Nodo(2L,361,155)); 
        nodos.add(new Nodo(3L,312,177)); 
        nodos.add(new Nodo(4L,384,191)); 
        nodos.add(new Nodo(5L,361,248)); 
        nodos.add(new Nodo(6L,422,250));
        nodos.add(new Nodo(7L,412,270)); 
        nodos.add(new Nodo(8L,452,304));
        nodos.add(new Nodo(9L,439,332)); 
        nodos.add(new Nodo(10L,519,418));
        nodos.add(new Nodo(11L,493,459)); 
        
        nodos.add(new Nodo(12L,229,159));
        nodos.add(new Nodo(13L,292,135));
        nodos.add(new Nodo(14L,225,189));
        nodos.add(new Nodo(15L,211,263));
        nodos.add(new Nodo(16L,262,199));
        nodos.add(new Nodo(17L,284,273));
        nodos.add(new Nodo(18L,280,325));
        nodos.add(new Nodo(19L,314,284));
        nodos.add(new Nodo(20L,301,330));
        //1.268  x
        //1.27 y
        nodos.add(new Nodo(21L,345,296));
        nodos.add(new Nodo(22L,328,340));
        nodos.add(new Nodo(23L,395,316));
        nodos.add(new Nodo(24L,388,337));
        nodos.add(new Nodo(25L,417,323));
        nodos.add(new Nodo(26L,379,361));
        
        nodos.add(new Nodo(27L,425,378));
        nodos.add(new Nodo(28L,185,305));
        nodos.add(new Nodo(29L,246,272));
        nodos.add(new Nodo(30L,166,326));
        nodos.add(new Nodo(31L,235,318));
        nodos.add(new Nodo(32L,131,362));
        nodos.add(new Nodo(33L,221,347));
        nodos.add(new Nodo(34L,201,392));
        nodos.add(new Nodo(35L,272,368));
        
        nodos.add(new Nodo(36L,250,414));
        nodos.add(new Nodo(37L,314,385));
        nodos.add(new Nodo(38L,295,433));
        nodos.add(new Nodo(39L,335,396));
        nodos.add(new Nodo(40L,319,442));
        nodos.add(new Nodo(41L,361,403));
        nodos.add(new Nodo(42L,332,448));
        
        nodos.add(new Nodo(43L,406,425));
        nodos.add(new Nodo(44L,388,471));
        nodos.add(new Nodo(45L,451,443));
        nodos.add(new Nodo(46L,431,488));
        nodos.add(new Nodo(47L,473,479));
        nodos.add(new Nodo(48L,462,500));
        nodos.add(new Nodo(49L,476,507));
        nodos.add(new Nodo(50L,106,393));
        nodos.add(new Nodo(51L,167,377));
        nodos.add(new Nodo(52L,153,402));
        nodos.add(new Nodo(53L,214,399));
        nodos.add(new Nodo(54L,152,435));
        
        nodos.add(new Nodo(55L,190,453));
        nodos.add(new Nodo(56L,225,468));
        nodos.add(new Nodo(57L,276,488));
        nodos.add(new Nodo(58L,315,500));
        nodos.add(new Nodo(59L,368,518));
        nodos.add(new Nodo(60L,412,535));
        nodos.add(new Nodo(61L,74,429));
        nodos.add(new Nodo(62L,108,452));
        nodos.add(new Nodo(63L,135,473));
        nodos.add(new Nodo(64L,175,492));
        nodos.add(new Nodo(65L,22,494));
        nodos.add(new Nodo(66L,77,491));
        
        nodos.add(new Nodo(67L,190,547));
        nodos.add(new Nodo(68L,254,557));
        nodos.add(new Nodo(69L,290,588));
        nodos.add(new Nodo(70L,275,634));
        nodos.add(new Nodo(71L,302,548));
        nodos.add(new Nodo(72L,333,559));
        nodos.add(new Nodo(73L,338,547));
        nodos.add(new Nodo(74L,353,564));
        nodos.add(new Nodo(75L,394,577));
        nodos.add(new Nodo(76L,390,593));
        nodos.add(new Nodo(77L,432,613));
        nodos.add(new Nodo(78L,323,661));
        nodos.add(new Nodo(79L,383,684));
        nodos.add(new Nodo(80L,406,694));

        
    }
    
    private void IniMap(){
        for(int i=0;i<78;i++){
            for(int j=0;j<78;j++){
                calles[i][j] = null;
            }
        }
        
        calles[0][1] = new Calle(145);
        calles[0][2] = new Calle(287);
        
        calles[1][0] = new Calle(145);
        calles[1][13] = new Calle(140);
        calles[1][12] = new Calle(165);

        
        calles[2][3] = new Calle(103);
        calles[2][0] = new Calle(287);
        calles[2][4] = new Calle(71);
        
        calles[3][13] = new Calle(95);
        calles[3][2] = new Calle(103);
        calles[3][16] = new Calle(105);
        calles[3][5] = new Calle(205);
        
        calles[4][2] = new Calle(71);
        calles[4][5] = new Calle(122);
        calles[4][6] = new Calle(146);
        
        calles[5][3] = new Calle(205);
        calles[5][7] = new Calle(102);
        calles[5][21] = new Calle(92);
        
        calles[6][4] = new Calle(146);
        calles[6][8] = new Calle(107);

        calles[7][5] = new Calle(102);
        calles[7][6] = new Calle(43);
        
        calles[8][6] = new Calle(107);
        calles[8][10] = new Calle(264);
        
        
        calles[10][8] = new Calle(264);
        calles[10][27] = new Calle(212);
        calles[10][11] = new Calle(102);
        
        
        calles[11][10] = new Calle(102);
        calles[11][49] = new Calle(100);
        
        calles[12][1] = new Calle(165);
        calles[12][13] = new Calle(134);
        calles[12][14] = new Calle(55);
        
        calles[13][1] = new Calle(140);
        calles[13][12] = new Calle(134);
        calles[13][3] = new Calle(95);
        
        calles[14][12] = new Calle(55);
        calles[14][15] = new Calle(146);
        calles[14][16] = new Calle(75);
        
        calles[15][14] = new Calle(146);
        calles[15][28] = new Calle(97);
        calles[15][29] = new Calle(60);
        
        calles[28][15] = new Calle(97);
        calles[29][15] = new Calle(60);
        
        calles[16][14] = new Calle(75);
        calles[16][3] = new Calle(105);
        
        calles[17][16] = new Calle(148);
        calles[17][19] = new Calle(65);
     
        calles[18][17] = new Calle(106);
        calles[18][31] = new Calle(86);
        
        //falta peso
        calles[19][20] = new Calle(0);
        calles[19][21] = new Calle(63);
        
        
        //falta peso
        calles[20][19] = new Calle(0);
        calles[20][18] = new Calle(38);
        
        
        calles[21][19] = new Calle(63);
        calles[21][22] = new Calle(94);
        
        calles[22][37] = new Calle(89);
        
        calles[23][7] = new Calle(95);
        calles[23][21] = new Calle(102);
        
        calles[24][23] = new Calle(47);
        calles[24][25] = new Calle(92);
        
        calles[25][23] = new Calle(45);
        calles[26][22] = new Calle(95);
        //falta
        calles[26][24] = new Calle(50);
        calles[27][26] = new Calle(90);
        calles[27][43] = new Calle(88);
        
        calles[28][15] = new Calle(97);
        calles[28][30] = new Calle(60);
        calles[29][15] = new Calle(60);
        
        calles[30][28] = new Calle(60);
        calles[30][32] = new Calle(98);
        calles[30][33] = new Calle(114);
        calles[31][28] = new Calle(105);
        calles[31][33] = new Calle(62);
        
        calles[32][30] = new Calle(98);
        calles[32][50] = new Calle(78);
        calles[32][51] = new Calle(74);
        
        calles[33][31] = new Calle(62);
        calles[33][34] = new Calle(93);
        calles[33][35] = new Calle(106);
        
        calles[34][51] = new Calle(70);
        calles[34][33] = new Calle(93);
        calles[34][53] = new Calle(26);
        
        calles[35][18] = new Calle(82);
        calles[35][37] = new Calle(88);
        
        calles[36][35] = new Calle(100);
        calles[36][53] = new Calle(89);
        calles[36][38] = new Calle(114);
        calles[36][56] = new Calle(77);
        
        calles[37][38] = new Calle(100);
        calles[37][39] = new Calle(46);
        
        calles[38][40] = new Calle(46);
        calles[38][36] = new Calle(89);
        calles[38][57] = new Calle(105);
        
        calles[39][37] = new Calle(46);
        calles[39][41] = new Calle(52);
        
        calles[40][38] = new Calle(46);
        calles[40][39] = new Calle(91);
        calles[40][42] = new Calle(30);
        
        calles[41][26] = new Calle(93);
        calles[41][43] = new Calle(90);
        
        calles[42][40] = new Calle(30);
        calles[42][44] = new Calle(113);
        
        calles[43][44] = new Calle(93);
        calles[43][45] = new Calle(97);
        
        calles[44][42] = new Calle(113);
        calles[44][46] = new Calle(88);
        calles[44][59] = new Calle(99);
        
        calles[45][11] = new Calle(85);
        
        calles[46][45] = new Calle(95);
        calles[46][44] = new Calle(88);
        //rev
        calles[46][48] = new Calle(40);
        
        calles[47][48] = new Calle(50);
        calles[48][47] = new Calle(50);
        //rev
        calles[48][49] = new Calle(51);
        
        calles[49][11] = new Calle(100);
        calles[49][77] = new Calle(218);
        
        calles[50][32] = new Calle(78);
        calles[50][61] = new Calle(99);
        calles[50][54] = new Calle(123);
        
        calles[51][32] = new Calle(74);
        calles[51][52] = new Calle(42);
        calles[51][34] = new Calle(70);
        
        calles[52][51] = new Calle(42);
        
        calles[53][34] = new Calle(26);
        calles[53][36] = new Calle(77);
        calles[53][55] = new Calle(144);
        
        calles[54][50] = new Calle(123);
        calles[54][55] = new Calle(78);
        calles[54][63] = new Calle(83);
        
        calles[55][53] = new Calle(114);
        calles[55][54] = new Calle(78);
        calles[55][56] = new Calle(70);
        calles[55][64] = new Calle(76);
        
        calles[56][55] = new Calle(70);
        calles[56][36] = new Calle(114);
        calles[56][57] = new Calle(101);
        calles[56][67] = new Calle(172);
        
        calles[57][56] = new Calle(101);
        calles[57][38] = new Calle(105);
        calles[57][68] = new Calle(128);
        
        calles[58][42] = new Calle(105);
        calles[58][59] = new Calle(111);
        
        calles[59][74] = new Calle(94);
        calles[59][60] = new Calle(82);
        
        calles[60][46] = new Calle(94);
        
        calles[61][50] = new Calle(99);
        calles[61][62] = new Calle(71);
        calles[61][65] = new Calle(156);
        
        calles[62][61] = new Calle(71);
        
        calles[63][54] = new Calle(83);
        
        calles[64][55] = new Calle(76);
        
        calles[65][61] = new Calle(156);
        calles[65][70] = new Calle(559);
        
        calles[66][67] = new Calle(247);
        
        calles[67][66] = new Calle(247);
        calles[67][56] = new Calle(2172);
        calles[67][69] = new Calle(202);
        
        calles[68][57] = new Calle(128);
        
        calles[69][67] = new Calle(202);
        calles[69][71] = new Calle(77);
        calles[69][70] = new Calle(97);
        
        calles[70][65] = new Calle(559);
        calles[70][69] = new Calle(97);
        calles[70][78] = new Calle(106);
        
        calles[71][58] = new Calle(98);
        //REV
        calles[71][72] = new Calle(40);
        calles[71][69] = new Calle(77);
        
        //REV
        calles[72][71] = new Calle(40);
        //FALTA
        calles[72][73] = new Calle(20);
        calles[72][74] = new Calle(59);
        
        calles[73][74] = new Calle(20);
        
        calles[74][72] = new Calle(59);
        calles[74][75] = new Calle(79);
        calles[74][78] = new Calle(180);
        
        calles[75][74] = new Calle(79);
        calles[75][60] = new Calle(92);
        
        calles[76][75] = new Calle(29);
        calles[76][77] = new Calle(94);
        
        calles[77][76] = new Calle(94);
        calles[77][49] = new Calle(218);
        calles[77][80] = new Calle(165);
        
        calles[78][70] = new Calle(106);
        calles[78][74] = new Calle(180);
        calles[78][79] = new Calle(121);
        
        calles[79][76] = new Calle(182);
        calles[79][80] = new Calle(44);
        
        calles[80][77] = new Calle(165);
        calles[80][79] = new Calle(44);
        
    }

    @FXML
    private void onMouseClickedMapa(MouseEvent event) {
        verPuntoCer(event.getX(), event.getY());
        System.out.println("x: " + event.getX()+" y:" + event.getY());
    }
    
    private void verPuntoCer(Double x, Double y){
        Nodo aux = null;
        if(click == 1 || click == 2){
            for(Nodo n : nodos){
                if( minimo(n,aux,x,y)){
                    aux=n;
                    System.out.println("pasamos por " + n.getId());
                }
            }
            System.out.println("El nodo más cercano es el " + aux.getId());
            
            Circle c = new Circle(x+5, y+5, 5);
            if(click==1){
                c.setFill( Paint.valueOf("#3333ff"));
                ini = new Nodo(90L,x,y);
                iniNod=aux;
                root.getChildren().add(c);
                linea(ini, iniNod);
                click=2;
            }else{
                c.setFill( Paint.valueOf("#ff1a1a"));
                fin = new Nodo(91L,x,y);
                finNod=aux;
                root.getChildren().add(c);
                linea(fin,finNod);
                click=0;
            }
        }
    }
    
    private Boolean minimo(Nodo n, Nodo nObj, Double x, Double y){
        Boolean result=false;
        if(nObj==null){ return true; }
        Double x1=n.getX()-x,x2 =nObj.getX()-x,y1=n.getY()-y,y2=nObj.getY()-y;
        
        if(x1 < 0){ x1*=-1; }
        if(y1 < 0){ y1*=-1; }
        if(x2 < 0){ x2*=-1; }
        if(y2 < 0){ y2*=-1; }
        System.out.println("Comparando nodo " + n.getId() + " con "+ nObj.getId());
        System.out.println("Comparando x: " + x1 + " con x:"+ x2);
        System.out.println("Comparando y: " + y1 + " con y:"+ y2);
        
        // falta arreglar esta mamada, pero se disminuyo la probabilidad de error
        if( x1 <= x2 ){
            if( y2<15 && y1 <= y2 +30D){
                result=true; 
            }else if(y1 <= y2){
                result=true;
            }
        } 
        else if( y1 <= y2 ){
            if(x2<15 && x1 <= x2+30D){
                result=true; 
            }else if(x1 <= x2){
                result=true;
            }
        }
        return result;
    }

    private void linea(Nodo a, Nodo b){
        Line l = new Line(a.getX()+5d,a.getY()+5d,b.getX()+5d,b.getY()+5d);
        l.setFill(Paint.valueOf("#ff3300"));
        l.setOpacity(0.7);
//        l.scaleXProperty().setValue(2);
//        l.scaleYProperty().setValue(4);
        root.getChildren().add(l);
    }
    
    private void Limpiar(){
        if(root.getChildren().size()>1){
            for(int i=root.getChildren().size()-1; i>0 ;i--){
                root.getChildren().remove(i);
            }
        }
    }
    
    
    private void mostrarNodos(){
        nodos.stream().forEach(n -> {
            Circle c = new Circle(n.getX()+5, n.getY()+5, 5, Paint.valueOf("#ff1a1a"));
            root.getChildren().add(c);
        });
    }
    
    @FXML
    private void onActionBtnPAB(ActionEvent event) {
        Limpiar();
        click=1;
    }
    
    @FXML
    private void onActionBtnLimpiar(ActionEvent event) {
        Limpiar();
    }

    @FXML
    private void onActionBtnMNodos(ActionEvent event) {
        mostrarNodos();
    }
}
