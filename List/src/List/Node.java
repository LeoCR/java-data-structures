package List;

public class Node {
    private Person dato;
    private Node next;
    private Node back;
    /**
 * The node indicates the type of list I am using
 * The Circular Double list needs the next and back method
 * @author leonardoaranibar
 */
    public Node getBack() {
        return back;
    }
    public void setBack(Node back) {
        this.back = back;
    }    
    public Node(Person dato) {
        this.dato = dato;
    }
    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }       
    public Person getDato() {
        return dato;
    }
    public void setDato(Person dato) {
        this.dato = dato;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }    
}
