package List;
/**
* @author leonardoAranibarSanchez
*/
public class Lista {
    Nodo head;       
    public void insert(Person p){
        if(head==null){
            head=new Nodo(p);
        }
        else if(p.getId()<head.getDato().getId()){
             Nodo aux=new Nodo(p);
             aux.setNext(head);
             head=aux;
        }
        else if(head.getNext()==null){
            head.setNext(new Nodo(p));
        }
        else{
            Nodo aux =head;
            while(aux.getNext()!=null && aux.getNext().getDato().getId()<p.getId()){
                aux =aux.getNext();
            }
            //ya ubicado se procede a realizar los enlaces
            Nodo temp=new Nodo(p);//creo temp para crear el nodo con p
            temp.setNext(aux.getNext());//enlazo temp al siguiente de aux
            aux.setNext(temp);//el aux es nada mas para extraer el valor de la lista
        }        
    } 
    @Override
    public String toString() {
        Nodo aux = head;
        String s ="List: \n";
        while(aux!= null){
            s+=aux+"\n";
            aux=aux.getNext();
        }
        return  s;
    }    
}
