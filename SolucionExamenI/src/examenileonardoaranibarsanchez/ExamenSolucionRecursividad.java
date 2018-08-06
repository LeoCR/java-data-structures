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
public class ExamenSolucionRecursividad {
    
    public static void main(String[] args){
        
        Recursividad s= new Recursividad(3);
        s.cargaVector(5, 90);
        int suma= s.sumaRecursiva(0,2);
        System.out.println("La suma de manera recursiva: " +suma);
    }
}
