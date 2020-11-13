/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.waze.util;

import java.util.List;

/**
 *
 * @author crist
 */
public class Respuesta {
    
    List<Nodo> ruta;
    int distancia;
    
    Respuesta(){
        
    }
    
    Respuesta(List<Nodo> ruta, int distancia){
        this.ruta = ruta;
        this.distancia = distancia;
    }

    public List<Nodo> getRuta() {
        return ruta;
    }

    public void setRuta(List<Nodo> ruta) {
        this.ruta = ruta;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    
    
}
