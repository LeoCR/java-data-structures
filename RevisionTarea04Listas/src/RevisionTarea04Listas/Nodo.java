package RevisionTarea04Listas;

public class Nodo {
    private Persona datosDeLaPersona;//Objeto que almacena la informacion de la persona
    private Nodo nextPersona;//Se refiere al siguiente objeto de tipo Nodo que contiene una persona

    public Nodo(Persona datosDeLaPersona) {/**
     * El constructor solo recibe un objeto Persona el cual almacena los datos de la Persona
     **/
        this.datosDeLaPersona = datosDeLaPersona;
    } 
    @Override
    public String toString() {/** 
     * Se utiliza para poder imprimir el objeto Nodo el cual contiene al Objeto Persona**/
        return "Nodo{" + "datosDeLaPersona=" + datosDeLaPersona + '}';
    }    
    public Persona getDato() {
        return datosDeLaPersona;
    } 
    public void setDatosDeLaPersona(Persona datosDeLaPersona) {
        this.datosDeLaPersona = datosDeLaPersona;
    } 
    public Nodo getNext() {
        return nextPersona;
    } 
    public void setNext(Nodo nextPersona) {
        this.nextPersona = nextPersona;
    }  
}
