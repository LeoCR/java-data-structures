package List;
/**
* @author leonardoAranibarSanchez
*/
public class Main {    
    public static void main(String[] args) {
            Lista theList=new Lista();
            theList.insert(new Person(10,"Yosswel"));
            theList.insert(new Person(5,"Zaida"));
            theList.insert(new Person(15,"Carlos"));
            theList.insert(new Person(20,"Diego"));
            theList.insert(new Person(30,"Brandon"));
            System.out.println(theList);
    }    
}
