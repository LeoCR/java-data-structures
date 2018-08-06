package List;
/**
* @author leonardoaranibar
*/
public class App {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaC theList= new ListaC();
        theList.insert(new Person(10, "Yoswell"));
        theList.insert(new Person(5, "Zaida"));
        theList.insert(new Person(15, "Carlos"));
        theList.insert(new Person(20, "Diego"));
        theList.insert(new Person(1, "Esteban"));
        theList.insert(new Person(30, "Brandon"));
        theList.insert(new Person(18, "Manuel"));
        
        System.out.println(theList);
    }
    
}
