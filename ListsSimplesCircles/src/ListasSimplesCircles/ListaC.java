package ListasSimplesCircles;

public class ListaC {
    Nodo head;//first item in the list
    Nodo last;//reference to the last item in the list
    @Override
    public String toString() {
        Nodo aux = head;
        String s = "List: \n";
        if (aux != null) {
            s += aux + ", \n";
            aux = aux.getNext();
            while (aux != head) {//como es circular debe detenerse cuando
                s += aux + ", \n";//come back to be head
                aux = aux.getNext();
            }
        } 
        else {
            s += "empty";
        }
        return s;
    }

    public void insert(Person p) {
        /**
         *Insert a person object in the list. The order is determined by the attribute id of the Person.
         * @param Person objecto
         */
        if (head == null) {
            head = new Nodo(p);
            /**
             * if the first Element of the List does not exist then the first
             * Element of the List is equal to the object Person received by parameter
             */
            last = head;
            last.setNext(head);
        }
        else if (p.getId() < head.getDato().getId()) {
            /**
             * If the object Person received by parameter has an id less than the id of the first Element in the List
             */
            Nodo aux = new Nodo(p);
            /**
             * A new Object of Type List Node called Auxiliary list is created, which
             * will take as parameter the current object received from Person type
             */
            aux.setNext(head);
            /**
             * It placed the list of People Assistant to the left of the first Element of the list of people 
             */
            head = aux;
            /**
             * Finally the first Element of the List now refers to the new element
             */
            last.setNext(head);//I link the last one to the head (circular)
        } 
        else if (last.getDato().getId() <= p.getId()) {
            last.setNext(new Nodo(p));

            last = last.getNext();
            last.setNext(head);
        } 
        else {
            Nodo aux = head;
            /**
             * Otherwise, we create the node variable Auxiliary The People List to be able 
             * to go through the People list object We create the nodeAuxiliary 
             * node of the PeopleList to be able to reccorer the object list of People            
             */
            while (aux.getNext().getDato().getId() < p.getId()) {
                /**
                 * We started to go through the Object nodeAuxiliary of the PeopleList which 
                 * contains the list of people as long as the perzona object received per
                 * parameter has a id greater than id attribute of the next object 
                 * of type Person contained in the objectAuxiliary node of the PeopleList
                 */
                aux = aux.getNext();
            }
            /**
             * The while loop ends when it is located where the object should go
            * Person who wishes to insert
             */
            Nodo temp = new Nodo(p);
            /**
             * I create the object TemporalNodeLaListaPersonas to insert the perzona object received per parameter
             */
            temp.setNext(aux.getNext());
            /**
             * Linking TemporalNumber from TheListPersons to the next node objectAuxiliaryNumber
             */
            aux.setNext(temp);
            /**
             * I link the following node-typeAuxiliary object of the PersonList as a TimeNode of the PersonList
             */
        }
        last.setNext(head);
    }

    public boolean exist(int id) {
        /**
         * Search the People list and return true if a person has the id in the list
         */
        boolean esta = false;
        if (head != null) {
            if (id >= head.getDato().getId() && id <= last.getDato().getId()) {
                Nodo aux = head;
                while (aux != last && aux.getDato().getId() < id) {
                    aux = aux.getNext();
                }
                esta = (aux.getDato().getId() == id);
            }
        }
        return esta;
    }

    public void modify(Person p) {
        /**
         * Search if there is someone with the id, and update the name
         */
        if (head != null) {
            if (p.getId() >= head.getDato().getId()
                    && p.getId() <= last.getDato().getId()) {
                Nodo aux = head;
                while (aux != last && aux.getDato().getId() < p.getId()) {
                    aux = aux.getNext();
                }
                if (aux.getDato().getId() == p.getId()) {
                    aux.getDato().setName(p.getName());
                }
            }
        }
    }

    public void delete(int id) {
        /**
         * If a person has the id it eliminates it
         */
        if (head != null) {
            if (head.getDato().getId() <= id
                    && id <= last.getDato().getId()) {
                if (head.getDato().getId() == id) {
                    head = head.getNext();
                    last.setNext(head);
                } else {
                    Nodo aux = head;
                    while (aux.getNext() != head
                            && aux.getNext().getDato().getId() < id) {
                        aux = aux.getNext();
                    }
                    if (aux.getNext().getDato().getId() == id) {
                        if (aux.getNext() == last) {
                            last = aux;
                        }
                        aux.setNext(aux.getNext().getNext());
                    }
                }
            }
        }
    }

    public Person extraer(int id) {
        Person p = null;
        /**
         * If a person has the id, he extracts it eliminating and returning
         */
        if (head != null) {
            //If it is within the range
            if (head.getDato().getId() <= id
                    && id <= last.getDato().getId()) {
                if (head.getDato().getId() == id) {
                    p = head.getDato();
                    head = head.getNext();//actualizo head
                    last.setNext(head);//actualizo el last.next
                } else {
                    Nodo aux = head;//utilizo aux como in
                    while (aux.getNext() != head
                            && aux.getNext().getDato().getId() < id) {
                        aux = aux.getNext();
                    }
                    if (aux.getNext().getDato().getId() == id) {
                        p = aux.getNext().getDato();
                        if (aux.getNext() == last) {
                            last = aux;
                        }
                        aux.setNext(aux.getNext().getNext());
                    }
                }
            }
        }//END IF;
        return p;
    }
}
