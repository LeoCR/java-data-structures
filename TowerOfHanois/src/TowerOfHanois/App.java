
package TowerOfHanois;

import java.util.Scanner;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        //System.out.println("Enter number of discs: ");
        //int n = sc.nextInt();
        Hannoi h  = new Hannoi();
        //h.resolveHanoi(n,1,2,3); 
        //1:origen  2:auxiliar 3:destino
        int cantidad=h.SubtractionDivision(21,5,0);
        System.out.println("La cantidad de veces es:"+cantidad);
    }
    
}
