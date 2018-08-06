/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenileonardoaranibarsanchez;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab
 */
public class Rutina {

    Pila pila;
    private int tamano=0;
     
    public void sumarElementos(int tamano) {
        this.pila = new Pila(tamano); 
         
        pila.sumarEnteros(0 );
        //System.out.println("examenileonardoaranibarsanchez.Rutina.sumarElementos()"+result);
 mostrarMensaje("La suma de todos los elementos dentro de la pila es " + pila.resultado);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void desplegarPila(Pila pila){
        String pilaTxt="";
         
        for (int i = 0; i <=pila.getMax(); i++) { 
           // pilaTxt+=pila[i]+"\n";
        }
        mostrarMensaje(pilaTxt);
    }
    public void menu() {
        String continuar = "";
        String menu = "Digite un numero del 1 al 3,para realizar cualquiera de las siguientes tres opciones respectivamente";
        menu += "\n1.Sumar los elementos de un arreglo de enteros recursivamente.";
        menu += "\n2.Invertir los elementos de una pila.";
        menu += "\n3.Cargar una cola a partir de una pila.";

        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    int tamano = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero para la cantidad de elementos que desea que tenga el arreglo"));
                    sumarElementos(tamano);
                    break;
                case 2:
                    invertirPila();
                    break;
                case 3:
                    cargarAPartirDePila();
                    break;
            }
            continuar = JOptionPane.showInputDialog("Digite la Letra 'S' si desea continuar");
        } while (continuar.toUpperCase().equals("S"));

    }

    private void invertirPila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cargarAPartirDePila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
