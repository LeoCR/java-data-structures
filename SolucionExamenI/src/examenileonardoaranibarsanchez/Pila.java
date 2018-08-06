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
public class Pila {
    private int max;
    private int[] pila;
    private int top=-1;
    int resultado=0;

    public Pila() {
        this.max=5;
        this.top=0;
        this.pila=new int[5];
        for (int i = 0; i < 5; i++) {
            pila[i] = returnRamdonNumber(); 
        }
    }

    public Pila(int max) {
        this.max=max;
        this.top=0;
        this.pila=new int[max];
        for (int i = 0; i < pila.length; i++) {
            pila[i] = returnRamdonNumber(); 
        }
    } 
    public int getMax() {
        return max;
    } 
    public int[] getPila() {
        return pila;
    }

    public int getTop() {
        return top;
    }
    public int returnRamdonNumber(){
        return (int) Math.random()+2;
    }

    public void setPila(int[] pila) {
        this.pila = pila;
    }
    public void push(int num1){
        this.pila[top++]=num1;
    }
    public int pop(){
        int valor=this.pila[top--];
        return valor;
    }
    public boolean verificarEstado(int indice){
        return (top==indice);
    }
    public int sumarEnteros(int l){ 
        
        if(max>l){
             resultado+=this.pila[l]; 
             l++;
             sumarEnteros(l);
        }
        return resultado;
    }
}
