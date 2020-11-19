/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.waze.controller;

import cr.ac.una.waze.util.Calle;
import cr.ac.una.waze.util.Dijkstra;
import cr.ac.una.waze.util.FlowController;
import cr.ac.una.waze.util.Floyd;
import cr.ac.una.waze.util.Nodo;
import cr.ac.una.waze.util.Respuesta;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import static java.time.temporal.ChronoUnit.SECONDS;

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
    @FXML
    private RadioButton rbtnF;
    @FXML
    private ToggleGroup algoritmo;
    @FXML
    private RadioButton rbtnD;
    
    SequentialTransition st;
    
    private int click;
    
    private Nodo ini;
    private Nodo fin;
    
    private Nodo iniNod;
    private Nodo finNod;
    
    private Nodo nodAct;
    private Nodo nodSig;
            
    private List<Nodo> nodos;
    
    private List<Nodo> rutaIni;
    private List<Nodo> rutaCurso;
    
    private Calle[][] calles;

    int distanciaIni;
    int distanciaReal;
    
    int algorit;
    
    int regla;
    
    int cont;
    
    LocalTime localTime;
    
    ImageView car;
    @FXML
    private Label lblDisPre;
    @FXML
    private Label lblDisRea;
    @FXML
    private Label lblCosPre;
    @FXML
    private Label lblCosRea;
    
    TranslateTransition tt;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nodos = new ArrayList<>();
        calles = new Calle[82][82];
        click=0;
        regla=0;
        distanciaReal=0;
    }    

    @Override
    public void initialize() {
        iniList();
        IniMap();
        algorit=1;
        distanciaReal=0;
    }
    
    private void iniList(){
        nodos.add(new Nodo(0,296,30));
        nodos.add(new Nodo(1,247,76));  
        nodos.add(new Nodo(2,361,155)); 
        nodos.add(new Nodo(3,312,177)); 
        nodos.add(new Nodo(4,384,191)); 
        nodos.add(new Nodo(5,361,248)); 
        nodos.add(new Nodo(6,422,250));
        nodos.add(new Nodo(7,412,270)); 
        nodos.add(new Nodo(8,452,304));
        nodos.add(new Nodo(9,439,332)); 
        nodos.add(new Nodo(10,519,418));
        nodos.add(new Nodo(11,493,459)); 
        
        nodos.add(new Nodo(12,229,159));
        nodos.add(new Nodo(13,292,135));
        nodos.add(new Nodo(14,225,189));
        nodos.add(new Nodo(15,211,263));
        nodos.add(new Nodo(16,262,199));
        nodos.add(new Nodo(17,284,273));
        nodos.add(new Nodo(18,280,325));
        nodos.add(new Nodo(19,314,284));
        nodos.add(new Nodo(20,301,330));
        //1.268  x
        //1.27 y
        nodos.add(new Nodo(21,345,296));
        nodos.add(new Nodo(22,328,340));
        nodos.add(new Nodo(23,395,316));
        nodos.add(new Nodo(24,388,337));
        nodos.add(new Nodo(25,417,323));
        nodos.add(new Nodo(26,379,361));
        
        nodos.add(new Nodo(27,425,378));
        nodos.add(new Nodo(28,185,305));
        nodos.add(new Nodo(29,246,272));
        nodos.add(new Nodo(30,166,326));
        nodos.add(new Nodo(31,235,318));
        nodos.add(new Nodo(32,131,362));
        nodos.add(new Nodo(33,221,347));
        nodos.add(new Nodo(34,201,392));
        nodos.add(new Nodo(35,272,368));
        
        nodos.add(new Nodo(36,250,414));
        nodos.add(new Nodo(37,314,385));
        nodos.add(new Nodo(38,295,433));
        nodos.add(new Nodo(39,335,396));
        nodos.add(new Nodo(40,319,442));
        nodos.add(new Nodo(41,361,403));
        nodos.add(new Nodo(42,332,448));
        
        nodos.add(new Nodo(43,406,425));
        nodos.add(new Nodo(44,388,471));
        nodos.add(new Nodo(45,451,443));
        nodos.add(new Nodo(46,431,488));
        nodos.add(new Nodo(47,473,479));
        nodos.add(new Nodo(48,462,500));
        nodos.add(new Nodo(49,476,507));
        nodos.add(new Nodo(50,106,393));
        nodos.add(new Nodo(51,167,377));
        nodos.add(new Nodo(52,153,402));
        nodos.add(new Nodo(53,214,399));
        nodos.add(new Nodo(54,152,435));
        
        nodos.add(new Nodo(55,190,453));
        nodos.add(new Nodo(56,225,468));
        nodos.add(new Nodo(57,276,488));
        nodos.add(new Nodo(58,315,500));
        nodos.add(new Nodo(59,368,518));
        nodos.add(new Nodo(60,412,535));
        nodos.add(new Nodo(61,74,429));
        nodos.add(new Nodo(62,108,452));
        nodos.add(new Nodo(63,135,473));
        nodos.add(new Nodo(64,175,492));
        nodos.add(new Nodo(65,22,494));
        nodos.add(new Nodo(66,77,491));
        
        nodos.add(new Nodo(67,190,547));
        nodos.add(new Nodo(68,254,557));
        nodos.add(new Nodo(69,290,588));
        nodos.add(new Nodo(70,275,634));
        nodos.add(new Nodo(71,302,548));
        nodos.add(new Nodo(72,333,559));
        nodos.add(new Nodo(73,338,547));
        nodos.add(new Nodo(74,353,564));
        nodos.add(new Nodo(75,394,577));
        nodos.add(new Nodo(76,390,593));
        nodos.add(new Nodo(77,432,613));
        nodos.add(new Nodo(78,323,661));
        nodos.add(new Nodo(79,383,684));
        nodos.add(new Nodo(80,406,694));

        nodos.add(new Nodo(81,510,418));
        
    }
    
    private void IniMap(){
        for(int i=0;i<82;i++){
            for(int j=0;j<82;j++){
                calles[i][j] = null;
            }
        }
        
        calles[0][1] = new Calle(145);//
        calles[0][2] = new Calle(287);//
        
        calles[1][0] = new Calle(145);//
        calles[1][13] = new Calle(140);
        calles[1][12] = new Calle(165);

        
        calles[2][3] = new Calle(103);
        calles[2][0] = new Calle(287);//
        calles[2][4] = new Calle(71);
        
        calles[3][13] = new Calle(95);
        calles[3][2] = new Calle(103);
        calles[3][16] = new Calle(105);
        calles[3][5] = new Calle(205);//
        
        calles[4][2] = new Calle(71);
        calles[4][5] = new Calle(122);
        calles[4][6] = new Calle(146);
        
        calles[5][3] = new Calle(205);//
        calles[5][7] = new Calle(102);
        calles[5][21] = new Calle(92);
        
        calles[6][4] = new Calle(146);
        calles[6][8] = new Calle(107);

        calles[7][5] = new Calle(102);
        calles[7][6] = new Calle(43);
        
        calles[8][6] = new Calle(107);
        calles[8][9] = new Calle(66);
        calles[8][10] = new Calle(264);
        
        calles[9][25] = new Calle(45);
        calles[9][27] = new Calle(97);
        
        calles[10][8] = new Calle(264);
        calles[10][81] = new Calle(25);
        
        calles[81][11] = new Calle(102);
        calles[81][27] = new Calle(180);
        //agregar 81 a list
        calles[11][81] = new Calle(89);
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
        //---
        calles[15][14] = new Calle(146);
        calles[15][28] = new Calle(97);
        calles[15][29] = new Calle(60);
        
        calles[16][14] = new Calle(75);
        calles[16][3] = new Calle(105);
        
        calles[17][16] = new Calle(148);
        calles[17][19] = new Calle(65);
     
        calles[18][17] = new Calle(106);
        calles[18][31] = new Calle(86);

        calles[19][20] = new Calle(92);
        calles[19][21] = new Calle(63);

        calles[20][19] = new Calle(92);
        calles[20][18] = new Calle(38);
        
        
        calles[21][19] = new Calle(63);
        calles[21][22] = new Calle(94);
        
        calles[22][37] = new Calle(89);
        calles[22][20] = new Calle(58);
        
        calles[23][7] = new Calle(95);
        calles[23][21] = new Calle(102);
        //
        calles[24][23] = new Calle(47);
        calles[24][25] = new Calle(92);
        
        calles[25][23] = new Calle(45);
        
        calles[26][22] = new Calle(95);
        calles[26][24] = new Calle(50);
        
        calles[27][26] = new Calle(90);
        calles[27][43] = new Calle(88);
        //
        calles[28][15] = new Calle(97);
        calles[28][30] = new Calle(60);
        
        calles[29][15] = new Calle(75);
        //
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
        //
        calles[34][51] = new Calle(70);
        calles[34][33] = new Calle(93);
        calles[34][53] = new Calle(26);
        //
        calles[35][18] = new Calle(82);
        calles[35][37] = new Calle(88);
        //
        calles[36][35] = new Calle(100);
        calles[36][53] = new Calle(89);
        calles[36][38] = new Calle(114);
        calles[36][56] = new Calle(77);
        
        calles[37][38] = new Calle(100);
        calles[37][39] = new Calle(46);
        //
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
        //
        calles[42][40] = new Calle(30);
        calles[42][44] = new Calle(113);
        
        calles[43][44] = new Calle(93);
        calles[43][45] = new Calle(97);
        //
        calles[44][42] = new Calle(113);
        calles[44][46] = new Calle(88);
        calles[44][59] = new Calle(99);
        
        calles[45][11] = new Calle(85);
        //
        calles[46][45] = new Calle(95);
        calles[46][44] = new Calle(88);
        calles[46][48] = new Calle(63);
        
        calles[47][48] = new Calle(53);
        
        calles[48][47] = new Calle(53);
        calles[48][49] = new Calle(26);
        //
        calles[49][11] = new Calle(100);
        calles[49][77] = new Calle(218);
        //
        calles[50][32] = new Calle(78);
        calles[50][61] = new Calle(99);
        calles[50][54] = new Calle(123);
        
        calles[51][32] = new Calle(74);
        calles[51][52] = new Calle(42);
        calles[51][34] = new Calle(70);
        //
        calles[52][51] = new Calle(42);
        
        calles[53][34] = new Calle(26);
        calles[53][36] = new Calle(77);
        calles[53][55] = new Calle(144);
        //
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
        //
        calles[61][50] = new Calle(99);
        calles[61][62] = new Calle(71);
        calles[61][65] = new Calle(156);
        
        calles[62][61] = new Calle(71);
        
        calles[63][54] = new Calle(83);
        
        calles[64][55] = new Calle(76);
        
        calles[65][61] = new Calle(156);
        calles[65][70] = new Calle(559);
        //
        calles[66][67] = new Calle(247);
        
        calles[67][66] = new Calle(247);
        calles[67][56] = new Calle(172);
        calles[67][69] = new Calle(202);
        
        calles[68][57] = new Calle(128);
        
        calles[69][67] = new Calle(202);
        calles[69][71] = new Calle(77);
        calles[69][70] = new Calle(97);
        
        calles[70][65] = new Calle(559);
        calles[70][69] = new Calle(97);
        calles[70][78] = new Calle(106);
        //
        calles[71][58] = new Calle(98);
        calles[71][72] = new Calle(65);
        calles[71][69] = new Calle(77);
        
        calles[72][71] = new Calle(65);
        calles[72][73] = new Calle(22);
        calles[72][74] = new Calle(37);
        
        calles[73][72] = new Calle(22);
        
        calles[74][72] = new Calle(59);
        calles[74][75] = new Calle(79);
        calles[74][78] = new Calle(180);
        //
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
                if( minimo(n,aux,x,y)){ aux=n; }
            }
            
            Circle c = new Circle(x+5, y+5, 5);
            if(click==1){
                c.setFill( Paint.valueOf("#3333ff"));
                ini = new Nodo(90,x,y);
                iniNod=aux;
                root.getChildren().add(c);
                linea(ini, iniNod,1);
                click=2;
            }else{
                c.setFill( Paint.valueOf("#1aff1a"));
                fin = new Nodo(91,x,y);
                finNod=aux;
                root.getChildren().add(c);
                linea(fin,finNod,1);
                click=0;
                
                Respuesta respuesta;
                if(algorit==1){
                    respuesta = new Floyd().getCamino(iniNod, finNod, calles, nodos);
                }else{
                    respuesta = new Dijkstra().getCamino(calles,iniNod, finNod, nodos);
                }
                
                rutaIni = respuesta.getRuta();
                distanciaIni = respuesta.getDistancia();
                lblDisPre.setText(distanciaIni + "m");
                lblCosPre.setText(Math.round(distanciaIni*1.2 )+ " Colones");
                nodAct = iniNod;
                mostrarRuta();
                
            }
        }else if(regla!=0){
            System.out.println(""+regla);
            regla=0;
        }
    }
    
    private Boolean minimo(Nodo n, Nodo nObj, Double x, Double y){
        if(nObj==null){ return true; }
        Double x1=n.getX(),x2 =nObj.getX(),y1=n.getY(),y2=nObj.getY();
        
        Double dis = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
        Double dis2 = Math.sqrt((x2-x)*(x2-x) + (y2-y)*(y2-y));
        
        if(dis<dis2){  return true; }
        return false;
    }

    private void linea(Nodo a, Nodo b, int col){
        Line l = new Line(a.getX()+5,a.getY()+5,b.getX()+5,b.getY()+5);
        l.setStrokeWidth(8);
        l.setOpacity(0.4);
        l.setOnMouseClicked((event) -> {
            if(regla==1){
                if(calles[a.getId()][b.getId()]!=null && calles[b.getId()][a.getId()]!=null){
                    calles[a.getId()][b.getId()].setEstado("M");
                    calles[b.getId()][a.getId()].setEstado("M");
                }else if(calles[a.getId()][b.getId()]==null && calles[b.getId()][a.getId()]!=null){
                    calles[b.getId()][a.getId()].setEstado("M");
                }else if(calles[a.getId()][b.getId()]!=null && calles[b.getId()][a.getId()]==null){
                    calles[a.getId()][b.getId()].setEstado("M");
                }
                l.setStroke(Paint.valueOf("#0099ff")); 
            }else if(regla==2){
                if(calles[a.getId()][b.getId()]!=null && calles[b.getId()][a.getId()]!=null){
                    calles[a.getId()][b.getId()].setEstado("A");
                    calles[b.getId()][a.getId()].setEstado("A");
                }else if(calles[a.getId()][b.getId()]==null && calles[b.getId()][a.getId()]!=null){
                    calles[b.getId()][a.getId()].setEstado("A");
                }else if(calles[a.getId()][b.getId()]!=null && calles[b.getId()][a.getId()]==null){
                    calles[a.getId()][b.getId()].setEstado("A");
                }
                l.setStroke(Paint.valueOf("#ff0000")); 
            }else if(regla==3){
                if(calles[a.getId()][b.getId()].getTrafico()<3){
                    calles[a.getId()][b.getId()].setTrafico(calles[a.getId()][b.getId()].getTrafico()+1);
                }
            }else{
                if(calles[a.getId()][b.getId()]!=null && calles[b.getId()][a.getId()]!=null){
                    calles[a.getId()][b.getId()].setEstado("N");
                    calles[b.getId()][a.getId()].setEstado("N");
                }else if(calles[a.getId()][b.getId()]==null && calles[b.getId()][a.getId()]!=null){
                    calles[b.getId()][a.getId()].setEstado("N");
                }else if(calles[a.getId()][b.getId()]!=null && calles[b.getId()][a.getId()]==null){
                    calles[a.getId()][b.getId()].setEstado("N");
                }
                if(col==1){
                    l.setStroke(Paint.valueOf("#bf00ff")); 
                }else{
                    l.setStroke(Paint.valueOf("#1aff1a"));
                }
            }
        });
        if(col==1){
            l.setStroke(Paint.valueOf("#bf00ff")); 
        }else{
            l.setStroke(Paint.valueOf("#1aff1a"));
        }
        root.getChildren().add(l);
    }
    
    private void Limpiar(){
        if(root.getChildren().size()>1){
            for(int i=root.getChildren().size()-1; i>0 ;i--){
                root.getChildren().remove(i);
            }
        }
        if(tt!=null){
            tt.stop();
            tt=null;
        }
        regla=0;
        distanciaReal=0;
        lblCosPre.setText("");
        lblDisPre.setText("");
    }
    
    private void mostrarRuta(){
        car = new ImageView();
        car.setFitHeight(15);
        car.setFitWidth(15);
        car.getStyleClass().add(FlowController.getCarro());
        
        TranslateTransition tti = getMovimiento(ini,rutaIni.get(rutaIni.size()-1));
        
        tti.setNode(car);
        tti.play();
        
        for(int i=rutaIni.size()-2; i>=0;i--){
            linea(rutaIni.get(i+1), rutaIni.get(i),1);
        }
        root.getChildren().add(car);
        car.setX(-2);
        car.setY(-2);
        
        localTime = LocalTime.now();
        calcMejorR();
    }
    
    private void calcMejorR(){
        Respuesta respuesta;
        if(algorit==1){
            respuesta = new Floyd().getCamino(nodAct, finNod, calles, nodos);
        }else{
            respuesta = new Dijkstra().getCamino(calles,nodAct, finNod, nodos);
        }
        rutaCurso = respuesta.getRuta();
        if(rutaCurso.size()>1){
            distanciaReal= distanciaReal + calles[rutaCurso.get(rutaCurso.size()-1).getId()][rutaCurso.get(rutaCurso.size()-2).getId()].getPeso();
            lblDisRea.setText(""+  distanciaReal);
        }
        if(rutaCurso.size()>1){ tt = getMovimiento(rutaCurso.get(rutaCurso.size()-1),rutaCurso.get(rutaCurso.size()-2));
        car.setRotate(getAngulo(rutaCurso.get(rutaCurso.size()-2)));
        }else{ tt = getMovimiento(rutaCurso.get(rutaCurso.size()-1),fin); }
        
        tt.setNode(car);
        tt.setRate(5);
        tt.setOnFinished((event) -> {
            if(rutaCurso.size()>1){
                nodAct = rutaCurso.get(rutaCurso.size()-2);
                linea(rutaCurso.get(rutaCurso.size()-1), rutaCurso.get(rutaCurso.size()-2),2);
                calcMejorR();
            }else{
                LocalTime lt = LocalTime.now();
                Long tiempo = SECONDS.between(localTime, lt);
                lblCosRea.setText("" + Math.round((distanciaReal*1.2) + (tiempo*0.7)));
            }
        });
        tt.play();
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
    
    private TranslateTransition getMovimiento(Nodo a, Nodo b){
        TranslateTransition tt = new TranslateTransition();
        tt.setDuration(Duration.seconds(20));
        tt.setFromX(a.getX());
        tt.setFromY(a.getY());
        tt.setToX(b.getX());
        tt.setToY(b.getY());
        return tt;
    }
    
    private double getAngulo(Nodo objetivo){
        Double angle = Math.toDegrees(Math.atan2(objetivo.getY() - nodAct.getY(), objetivo.getX() - nodAct.getX()));
        angle += 180;
        return angle;
    }

    @FXML
    private void onActionRbtnF(ActionEvent event) {
        algorit = 1;
    }

    @FXML
    private void onActionRbtnD(ActionEvent event) {
        algorit = 2;
    }

    @FXML
    private void onActionBtnMantemiento(ActionEvent event) {
        regla=1;
    }

    @FXML
    private void onActionbtnAccidente(ActionEvent event) {
        regla=2;
    }

    @FXML
    private void onActionBtnTrafico(ActionEvent event) {
        regla=3;
    }
}
