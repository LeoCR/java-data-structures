package Trees;

public class App {

    public static void main(String[] args) {
        Trees a = new Trees();
        a.insert(50);
        a.insert(20);
        a.insert(80);
        a.insert(15);
        a.insert(30);
        a.insert(60);
        a.insert(40);
        a.insert(90);
        a.insert(75);
        a.insert(33);
        a.insert(82);
        a.insert(91);
        a.insert(53);
        System.out.println("In orden");
        a.inOrden();
        System.out.println("Pre Orden");
        a.preOrden();
    }
    
}
