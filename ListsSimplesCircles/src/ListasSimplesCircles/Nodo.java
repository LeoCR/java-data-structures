package ListasSimplesCircles;

public class Nodo {
    private Person datos;//Object that stores the information of the person
    private Nodo next;//Refers to the next Node object that contains a person

    public Nodo(Person dataOfThePerson) {/**
     * The constructor only receives a Person object which stores the data of the Person     **/
        this.datos = dataOfThePerson;
    } 
    @Override
    public String toString() {
     /** 
     * It is used to print the Node object which contains the Person Object
     **/
        return "Nodo{" + "dataOfThePerson=" + datos + '}';
    }    
    public Person getDato() {
        return datos;
    } 
    public void setDatos(Person datos) {
        this.datos = datos;
    } 
    public Nodo getNext() {
        return next;
    } 
    public void setNext(Nodo nextPersona) {
        this.next = nextPersona;
    }  
}
