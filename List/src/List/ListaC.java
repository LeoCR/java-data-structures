package List;

public class ListaC {
    Node head;
    Node last;
/**
* @author leonardoaranibar
*/
    public void insert(Person p) {
        if (head == null) {
            head = new Node(p);
            last = head;
            last.setNext(head);
            head.setBack(last);
        } else if (p.getId() < head.getDato().getId()) {
            Node aux = new Node(p);
            aux.setNext(head);
            head = aux;
            last.setNext(head);
            head.setBack(last);//linked head al last (circular)
        } else if (last.getDato().getId() <= p.getId()) {
            last.setNext(new Node(p));
            last = last.getNext();
            last.setNext(head);
            head.setBack(last);//linked head al last (circular)
        } else {//you have to insert in the middle
            Node aux = head;
            while (aux.getNext().getDato().getId() < p.getId()) {
                aux = aux.getNext();
            }
            Node temp = new Node(p);//I think temp to create the node with p
            temp.setNext(aux.getNext());//Link temp to the next aux
            temp.setBack(aux);//Link temp al de atras...
            aux.setNext(temp);//Link the next of aux as temp
            temp.getNext().setBack(temp);//Link the next to temp
        }
        last.setNext(head);
        head.setBack(last);
    }
    @Override
    public String toString() {
        Node aux = head;
        String s = "Lista: \n";
        if (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
            while (aux != head) {
                s += aux + "\n";
                aux = aux.getNext();
            }
        }
        else{
            s+="vacia";                        
        }  
        return s;
    }

}
