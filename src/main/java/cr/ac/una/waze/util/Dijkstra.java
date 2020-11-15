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
public class Dijkstra {
    
    public Dijkstra(){}
    
    private int minDistance(int peso[], Boolean nodosVisit[]) 
    { 
	int min = Integer.MAX_VALUE, min_index=0; 
	
	for (int v = 0; v < 82; v++){
            if (nodosVisit[v] == false && peso[v] <= min) {
                min = peso[v];
                min_index = v; 
            }
	}
	
	return min_index; 
    } 

    public Respuesta getCamino(Calle[][] grafo, Nodo ini, Nodo fin, List<Nodo> nodos){ 
        int peso[] = new int[82];
        int ruta[] = new int[82];
        
        Boolean nodosVisit[] = new Boolean[82]; 

        for (int i = 0; i < 82; i++) {
            peso[i] = Integer.MAX_VALUE;
            nodosVisit[i] = false;
            ruta[i]=-1; 
        }

        peso[ini.getId()] = 0; 
        ruta[ini.getId()] = ini.getId(); 
        
        for (int count = 0; count < 82 - 1; count++) { 
            int u = minDistance(peso, nodosVisit); 
            nodosVisit[u] = true; 
            for (int v = 0; v < 82; v++) {
                if (!nodosVisit[v] && grafo[u][v]!=null && peso[u] != Integer.MAX_VALUE 
                    && peso[u] + grafo[u][v].getPeso() < peso[v] && grafo[u][v].getEstado().equals("N")) {
                    peso[v] = peso[u] + grafo[u][v].getPeso(); 
                    ruta[v] = u; 
                }
            }
        }
        
        List<Nodo> camino = new ArrayList<>();
        Boolean mien=true;
        int aux2=fin.getId();
        camino.add(fin);
        while(mien){
            if(ruta[aux2]!=-1){
                camino.add(nodos.get(ruta[aux2]));
                if( ruta[aux2] == ini.getId()){
                    mien=false;
                }
                aux2 = ruta[aux2];
            }
        }
        return new Respuesta(camino,peso[fin.getId()]);
    } 
}
