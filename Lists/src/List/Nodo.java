package List;
/**
 * @author leonardoAranibarSanchez
 */
public class Nodo {
    private Person dato;
    private Nodo next;

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }  
    public Nodo(Person dato) {
        this.dato = dato;
    } 
    public Person getDato() {
        return dato;
    } 
    public void setDato(Person dato) {
        this.dato = dato;
    }
    public Nodo getNext() {
        return next;
    } 
    public void setNext(Nodo next) {
        this.next = next;
    } 
}
