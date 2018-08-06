package Trees;

public class Nodo {
    private int id;//la informacion del arbol
    private Nodo childLeft;///referencia al sub-arbol izquierdo
    private Nodo childRight;//referencia al sub-arbol derecho

    public Nodo(int id) {
        this.id = id;
    }    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Nodo getChildLeft() {
        return childLeft;
    }
    public void setChildLeft(Nodo childLeft) {
        this.childLeft = childLeft;
    }
    public Nodo getChildRight() {
        return childRight;
    }
    public void setChildRight(Nodo childRight) {
        this.childRight = childRight;
    }
}
