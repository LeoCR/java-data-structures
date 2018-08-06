package Pile;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * @author leonardoaranibar
 */
public class Rutina {
    Pile pile;

    public Rutina() {
    }
    private void crearPila() {
        String opcion = JOptionPane.showInputDialog(null,
                "You want to Define the size of the stackS/N");
        if (opcion.toUpperCase().equals("S")) {
            int tamanno = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Define the size of the stack:"));
            pile = new Pile(tamanno);
        } 
        else {
            pile = new Pile();
        }
    }
    private void insetarPila() {
        try {
            if (pile.verificarEstadoPila(pile.getMax())) {
                mostrarMensaje("The pile is full");
                return;
            }
            int dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Type the number"));
            pile.push(dato);

        } catch (HeadlessException | NumberFormatException e) {
            mostrarMensaje("Error into pile  " + e.getMessage());
        }
    }
    private void eliminarPila() {
        try {
            if (pile.verificarEstadoPila(0)) {
                mostrarMensaje("The stack is empty.");
                return;
            }
            String opcion = JOptionPane.showInputDialog(null,
                    "You want to delete a specific value Y/N?");
            if (opcion.toUpperCase().equals("Y")) {
                int dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Enter the value"));
                pile.pop(dato);
            } else {
                pile.pop();
            }
        } catch (HeadlessException | NumberFormatException e) {
            mostrarMensaje("Error into delete Pile " + e.getMessage());
        }

    }

    private void desplegarPila() {
        try {
            String mensaje = "";
            int top = pile.getTop();
            int[] pila1 = pile.getPila();
            for (int i = top - 1; i >= 0; i--) {
                mensaje += "Pila[" + i + "]=" + pila1[i] + "\n";
            }
            mostrarMensaje(mensaje);

        } catch (Exception e) {
            mostrarMensaje("Error :" + e.getMessage());
        }

    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void menu() {
        String continuar = "";
        crearPila();
        String menuOpciones = "1.Create Stack\n 2.Remove Stack\n 3.Unfold Stack";
        do {
            String opciones = JOptionPane.showInputDialog(menuOpciones);
            switch (opciones) {
                case "1":
                    insetarPila();
                    break;
                case "2":
                    eliminarPila();
                    break;
                case "3":
                    desplegarPila();
                    break;
            }
            continuar = JOptionPane.showInputDialog("Do you wish to continue 'Y' ");
        } while (continuar.toUpperCase().equals("S"));
    }
}
