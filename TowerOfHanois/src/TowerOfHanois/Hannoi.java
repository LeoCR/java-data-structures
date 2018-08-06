package TowerOfHanois;

/**
 * @author leonardoaranibar
 */
public class Hannoi {
      //Método Torres de Hanoi Recursivo
public void resolveHanoi(int disco, int origen,  int auxiliar, int destino){
  if(disco==1)System.out.println("Moving disc "+disco+" of the tower " + origen + " to tower " + destino);
  else{
     resolveHanoi(disco-1, origen, destino, auxiliar);
     System.out.println("Moving disc "+disco+" of the tower "+ origen + " to tower " + destino);
     resolveHanoi(disco-1, auxiliar, origen, destino);
   }
 }
public int SubtractionDivision(int num1, int num2,int ocurrences){        
        if(num1>=num2){
            num1-=num2;       
            ocurrences=SubtractionDivision(num1, num2,ocurrences)+1;
        }
        return ocurrences;
    }
}
