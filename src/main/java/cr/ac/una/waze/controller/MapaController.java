/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.waze.controller;

import cr.ac.una.waze.util.Calle;
import cr.ac.una.waze.util.Nodo;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author crist
 */
public class MapaController extends Controller implements Initializable {


    private List<Nodo> nodos;
    
    private Calle[][] calles;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calles = new Calle[78][78];
    }    

    @Override
    public void initialize() {
        
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
}
