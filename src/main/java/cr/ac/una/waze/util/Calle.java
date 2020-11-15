/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.waze.util;

import java.util.Random;

/**
 *
 * @author crist
 */
public class Calle {
    
    private int peso;
    private int trafico;
    
    private String estado; // CC=calle cerrada,A=Accidente 

    public Calle() {
    }
    
    public Calle(int peso) {
        this.peso = peso;
        this.estado = "N";
        this.trafico = new Random().nextInt(3)+1;
    }

    public int getPeso() {
        return peso*trafico;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTrafico() {
        return trafico;
    }

    public void setTrafico(int trafico) {
        this.trafico = trafico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
