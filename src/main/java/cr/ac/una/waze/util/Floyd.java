/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.waze.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class Floyd {
    
    int peso[][];
    int recorrido[][];

    
    public Floyd() {
       this.peso = new int[82][82];
       this.recorrido = new int[82][82];
    }
    
    private void pasarPesos(Calle[][] m){
        for(int i=0;i<82;i++){
            for(int j=0;j<82;j++){
                if(m[i][j]!=null && m[i][j].getEstado().equals("N")){
                    peso[i][j] = m[i][j].getPeso();
                } else if(i==j){
                    peso[i][j]=0;
                }else{
                    peso[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        for(int i=0;i<82;i++){
            for(int j=0;j<82;j++){
                if(i==j){
                    recorrido[j][i] = 0;
                }else{
                    recorrido[j][i] = j;
                }
            }
        }
    }
    
    public Respuesta getCamino(Nodo a, Nodo b, Calle[][] ca,List<Nodo> n){
        List<Nodo> camino = new ArrayList<>();
        int sum=0;
        pasarPesos(ca);
	for(int c=0; c<82; c++){
            for(int i=0; i<82; i++){
                if(i!=c){
                    for(int j=0; j<82; j++){
                        if(j!=c && peso[i][c]!=Integer.MAX_VALUE && peso[c][j]!=Integer.MAX_VALUE){ //j!=c 
                            sum = peso[i][c] + peso[c][j];
                            if(sum <= peso[i][j]){
                                peso[i][j] = sum;
                                recorrido[i][j] = recorrido[c][j];
                            }
                        }
                    }
                }
            }
	}
        
        Boolean eva=true;
	int aux2 = b.getId();
	int aux=0;
	camino.add(n.get(aux2));
	while(eva){
            if(peso[a.getId()][aux2] != 0 && peso[a.getId()][aux2] != Integer.MAX_VALUE){
                aux=aux2;
                aux2 = recorrido[a.getId()][aux2];
                if(aux2 == aux){
                    camino.add(n.get(a.getId()));
                    eva=false;
                }else{
                    camino.add(n.get(aux2));
                }
            }else{
                eva=false;
                if(peso[a.getId()][aux2] == Integer.MAX_VALUE){
                    return new Respuesta(null, -1);
                }
            }
	}
        return new Respuesta(camino, peso[a.getId()][b.getId()]);
    }
    
}
