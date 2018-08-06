package Tail;

/**
 * @author leonardoAranibarSanchez
 */
public class Tail {
    private NodoC primero;
    private NodoC ultimo;
    
    public void encola(NodoC d){
        if(primero ==null){
            primero=d;
            ultimo=d;
        }
        else{
            ultimo.setAtras(d);
            ultimo= d;
        }
    }    
    public NodoC atiende(){        
        NodoC aux= primero;
        if(primero !=null){
            primero =primero.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }    
    public String toString(){
        String s="";
        NodoC aux= primero;
        while (aux!=null) {
            s+=aux+"\n";
            aux=aux.getAtras();            
        }
        return s;
    }
    public boolean encontrar(String valor){
        NodoC aux= primero;
        while (aux!=null) {
            if(aux.toString().equals(valor)){                
                return true;                           
            }            
            aux=aux.getAtras(); 
        }
        return false;
    }
    public void extraer(String valor){
        NodoC aux= primero;
        NodoC temp;       
        while (aux!=null) {
            if(!aux.toString().equals(valor)){ 
                aux=aux.getAtras();                  
                 break;
            }
            else{
                //aux = aux.getAtras();
                aux.setAtras(null);
            }    
        }        
    }
     public NodoC atiende2(NodoC n){        
        NodoC aux = n;
        if(n!=null){
            n=n.getAtras();
            aux.setAtras(null);
        }
        return n;
    }
}
