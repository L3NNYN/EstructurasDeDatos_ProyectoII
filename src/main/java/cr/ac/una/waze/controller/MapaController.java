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
        nodos.add(new Nodo(377,39)); // ini
        nodos.add(new Nodo(312,98));  // izq 1
        nodos.add(new Nodo(459,198)); // der 
        nodos.add(new Nodo(398,225)); // izq 2
        nodos.add(new Nodo(491,245)); // der
        nodos.add(new Nodo(460,318)); // izq 3
        nodos.add(new Nodo(535,316));
        nodos.add(new Nodo(523,342)); // izq 4
        nodos.add(new Nodo(578,386));
        nodos.add(new Nodo(558,423)); // izq 5
        nodos.add(new Nodo(664,530));
        nodos.add(new Nodo(628,584)); // izq 6
        
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
        nodos.add(new Nodo());
    }
    
    private void IniMap(){
        for(int i=0;i<78;i++){
            for(int j=0;j<78;j++){
                calles[i][j] = null;
            }
        }
        
    }
        calles[][] = new Calle(145);
        calles[][] = new Calle(287);
        calles[][] = new Calle(140);
        calles[][] = new Calle(165);
        calles[][] = new Calle(134);
        calles[][] = new Calle(95);
        
        calles[][] = new Calle(55);
        calles[][] = new Calle(75);
        calles[][] = new Calle(105);
        calles[][] = new Calle(103);
        calles[][] = new Calle(71);
        
        calles[][] = new Calle(146);
        calles[][] = new Calle(148);
        calles[][] = new Calle(205);
        calles[][] = new Calle(122);
        calles[][] = new Calle(146);
        
        calles[][] = new Calle(60);
        calles[][] = new Calle(97);
        calles[][] = new Calle(106);
        calles[][] = new Calle(65);
        calles[][] = new Calle(63);
        calles[][] = new Calle(92);
        calles[][] = new Calle(94);
        calles[][] = new Calle(102);
        calles[][] = new Calle(102);
        calles[][] = new Calle(43);
        calles[][] = new Calle(95);
        calles[][] = new Calle(47);
}
