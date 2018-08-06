package Pile;
/**
 * @author Lab01 - Profesor
 */
public class Pile {

    private int top = -1;
    private int max;
    private int[] pila;

    public int getTop() {
        return top;
    }

    public int[] getPila() {
        return pila;
    }

    public int getMax() {
        return max;
    }

    public Pile() {
        top = 0;
        pila = new int[5];
        this.max = 5;
    }

    public Pile(int max) {
        top = 0;
        pila = new int[max];
        this.max = max;
    }

    public void push(int dato) {
        this.pila[top++] = dato;
    }

    public int pop() {
        int valor = this.pila[top - 1];
        top--;
        return valor;
    }

    public int pop(int dato) {
        int valor = -1;
        int[] aux = new int[max];
        for (int i = 0; i < top - 1; i++) {
            if (dato == this.pila[i]) {
                valor = this.pila[i];
                int posicion = 0;
                for (int j = 0; j < top - 1; j++) {
                    if (j != i) {
                        aux[posicion++] = this.pila[j];
                    }
                }
            }
        }
        top--;
        this.pila = (valor == -1) ? this.pila : aux;
        return valor;
    }

    public boolean verificarEstadoPila(int indice) {
        return (top == indice);
    }
}
