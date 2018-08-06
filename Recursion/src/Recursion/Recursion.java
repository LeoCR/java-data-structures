package Recursion;

import java.util.Scanner;

public class Recursion {
    Scanner capture= new Scanner(System.in);
    int [] v;
        
    void print(int x) {        
        if(x >0){
            System.out.printf("The number is :%d\n",x);
            print(x-1);
        }
    }
    
    public int fac(int n){
        if(n==0){
            return 1;
        }        
        return n*fac(n-1);
    }
    public void loadVector()  {        
        System.out.println("Enter the length of the vector");    
        v= new int[capture.nextInt()];
        for(int i=0; i< v.length;i++){
            v[i]=numerosAlatorios(10, 0);
        }
    }
    private int numerosAlatorios(int max, int min){
        return (min + (int)(Math.random() * max)); 
    }
    
    public int rotornaMayor(){        
        int mayor = 0;
        for(int i =0;i<v.length;i++){
            if(mayor<v[i]){
                mayor=v[i];
            }
        }
        return mayor;
    }
    
    public int rotornaMayorRecu(int position, int higher){        
        if(position< v.length){
            if(higher<v[position]){
                higher=v[position]; 
            }                 
            higher=rotornaMayorRecu(++position,higher);
        }
        return higher;
    }
    
    private boolean buscarR(int position, int number){        
        boolean found= false;
        if(position<v.length){
           if(v[position]==number){
               found = true;
           }
           else{
               found=buscarR(++position, number);
            }
        }
        return found;        
    }
    public void buscar(){
        System.out.println("What number do you want to search:");
        int numeroBuscar= capture.nextInt();
        boolean encontrado = this.buscarR(0, numeroBuscar);
        String mensaje= "The number was not found";
        if(encontrado){
            mensaje= "The number was found.";
        }
        System.out.println(mensaje);
    }
    public void ReverseNumber(){
        System.out.println("Enter the number you want to know in reverse.");
        String valor= capture.next();
        String result= inversaR(valor.length(),valor);
        System.out.println("The inverse number is:"+result);
    }
    public String inversaR(int posicion, String valor){
        String Result ="";
        if(posicion >0){
            Result+=valor.charAt(posicion-1);
            Result+=inversaR(--posicion,valor);
        }
        return Result;
    } 
    
}
