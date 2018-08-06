/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenileonardoaranibarsanchez;

/**
 *
 * @author Lab
 */
public class Recursividad {
    public int[] vector;
    public int tamanno;
    
    public Recursividad(int tamanno){
        this.tamanno=tamanno;
        this.vector= new int[tamanno];
    }
    public void cargaVector(int s,int g){
        for (int i = 0; i <this.tamanno; i++) {
            this.vector[i]=valorAleatorio(s,g);
        }
    }
    public int valorAleatorio(int me,int ma){
        return (int)(Math.random()*(ma-me)+me);
    }
    public int sumaRecursiva(int posicion,int largo){
        int suma=0;
        if(posicion<largo){
            suma+=this.vector[posicion];
            sumaRecursiva(++posicion, largo);
        }
        return suma;
    }
}
