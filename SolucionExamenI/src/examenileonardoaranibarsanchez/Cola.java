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
public class Cola {
    private NodoC primero;
    private NodoC ultimo;
    public void encola(NodoC d){
        if(primero==null){
            primero=d;
            ultimo=d;
        }
        else{
            ultimo.setAtras(d);
            ultimo=d;
        }
    }
    public NodoC atiende(){
        NodoC aux=primero;
        if(primero!=null){
            primero=primero.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
    public String toString(){
        String rsul="";
        NodoC aux=primero;
        while(aux!=null){
            rsul+=aux+"\n";
            aux=aux.getAtras();
        }
        return rsul;
    }
}
