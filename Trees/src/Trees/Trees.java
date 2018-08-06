package Trees;

public class Trees {
    Nodo raiz;
    
    public void insert(int x){
        if(raiz==null){
            raiz=new  Nodo(x);
        }
        else{
            insertRecursive(raiz, x);
        }
    }
    public void insertRecursive(Nodo n,int x){
        if(x<=n.getId()){//si el valor a insertar x debe ir a la izquierda
            if(n.getChildLeft()==null){
                n.setChildLeft(new Nodo(x));
            }
            else{
                insertRecursive(n.getChildLeft(), x);
            }
        }
        else{
            if(n.getChildRight()==null){
                n.setChildRight(new Nodo(x));
            }
            else{
                insertRecursive(n.getChildRight(),x);//si existe bajo recursivamente a el
            }
        }
    }
    public void inOrden(){
        if(raiz!=null){
            inOrdenR(raiz);
        }
        else{
            System.out.println("Empty tree...");
        }
    }
    public void preOrden(){
        if(raiz!=null){
            preOrdenR(raiz);
        }
        else{
            System.out.println("Empty tree...");
        }
    }
    public void postOrden(){
        if(raiz!=null){
            postOrdenR(raiz);
        }
        else{
            System.out.println("Empty tree...");
        }
    }

    private void inOrdenR(Nodo n) {
        if(n!=null){
            inOrdenR(n.getChildLeft());
            System.out.print(n.getId()+", ");
            inOrdenR(n.getChildRight());
        }
    }
    private void postOrdenR(Nodo n) {
        if(n!=null){
            inOrdenR(n.getChildLeft()); 
            inOrdenR(n.getChildRight());
            System.out.print(n.getId()+", ");
        }
    }
    private void preOrdenR(Nodo n) {
        if(n!=null){
            System.out.print(n.getId()+", ");
            inOrdenR(n.getChildLeft()); 
            inOrdenR(n.getChildRight());
        }
    }
}
