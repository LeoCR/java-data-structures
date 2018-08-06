package ListasSimplesCircles;

/**
 * @author Lab
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaC theList=new ListaC();
        theList.insert(new Person(10, "Juan"));
        theList.insert(new Person(5, "Pedro"));
        theList.insert(new Person(15, "Alberto"));
        theList.insert(new Person(20, "Daniela"));
        theList.insert(new Person(30, "Sebastian"));
        
        System.out.println(theList);
    }
    
}
