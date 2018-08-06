
package Tail;

/**
 * @author leonardoAranibarSanchez
 */
public class App {

    public static void main(String[] args) {
        Tail tail = new Tail();
        tail.encola(new NodoC("Juan"));
        tail.encola(new NodoC("Pedro"));
        tail.encola(new NodoC("Sebastian"));
        tail.encola(new NodoC("Daniela"));
        tail.encola(new NodoC("Andres"));
        System.out.println("The Original tail: \n" + tail);
        System.out.println("Service 2");
        NodoC nodo= tail.atiende();
        System.out.println(nodo);
        System.out.println(tail.atiende());
        System.out.println("Glue one more");
        tail.encola(new NodoC("Andrea"));
        System.out.println("---------------------------------");
        System.out.println("The new Cola: \n" + tail);
        System.out.println("Search Andrea");
        System.out.println(tail.encontrar("Andrea"));
        System.out.println("Replace Daniela");
        tail.extraer("Daniela");
        System.out.println("The Tail : \n" + tail);  
    }
    
}
