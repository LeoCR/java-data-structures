package Tail;

/**
 * @author leonardoAranibarSanchez
 */
public class NodoC {
    private String dato;
    private NodoC atras;
    public String getDato() {
        return dato;
    }
    public void setDato(String dato) {
        this.dato = dato;
    }
    public NodoC getAtras() {
        return atras;
    }
    public void setAtras(NodoC atras) {
        this.atras = atras;
    }
    public NodoC() {
    }
    public NodoC(String dato) {
        this.dato = dato;
    }
    @Override
    public String toString() {
        return  dato;
    }    
}
