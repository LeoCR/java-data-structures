package RevisionTarea04Listas;

public class Main {

    public static void main(String[] args) {
        Lista lalista = new Lista(); 
        lalista.insertar(new Persona(10, "Yoswell"));
        lalista.insertar(new Persona(5, "Zaida"));
        Persona carlos = new Persona(15, "Carlos");
        lalista.insertar(carlos);
        lalista.insertar(new Persona(20, "Diego"));
        lalista.insertar(new Persona(30, "Brandon"));
        lalista.insertar(new Persona(18, "Manuel")); 
        System.out.println("La lista inicial es:\n" + lalista);
        lalista.insertar(new Persona(25, "Olman"));
        lalista.insertar(new Persona(3, "Oscar"));
        lalista.modificar(carlos); 
        System.out.println("¿Existe el id 15 adentro de la Lista de Personas? \nR:/" + lalista.existe(15) + "\n");
        System.out.println("¿Existe el id 999 adentro de la Lista de Personas? \nR:/ " + lalista.existe(999)+ "\n");
        System.out.println("He remplazado el id 15 de Carlos por mi nombre.Ahora la nueva lista haora es:\n" + lalista);
        lalista.elimina(25);
        System.out.println("He eliminado el id 25 de Olman .Haora la lista inicial es:\n" + lalista);
    } 
}
