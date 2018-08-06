package RevisionTarea04Listas;
 
public class Lista { 
    Nodo cabeza;
    Nodo ultimo;
    public void insertar(Persona persn) {
        /**
         * Inserta un objeto persona en la lista.El orden lo determina el atributo id de la Persona
         * @param Persona objecto 
         */
        if (cabeza == null) { /**
             * si el primer Elemento De La Lista no existe */
            cabeza = new Nodo(persn); /**
             * entonces el primer Elemento De La Lista es igual al objeto Persona recibido por parametro  */
        } 
        else if (persn.getId() < cabeza.getDato().getId()) { /** 
         * Si el objeto Persona recibido por parametro posee un id menor al id del primer Elemento De La Lista
             */
            Nodo nodoAuxiliarDeLaLista = new Nodo(persn);/** 
             * Se crea un nuevo Objeto de Tipo NodoDeLaLista llamado listaAuxiliar el cual llevara por parametro el actual objeto recibido de tipo Persona  
             */
            nodoAuxiliarDeLaLista.setNext(cabeza);/**
             * Coloco la lista Auxiliar De Personas a la izquierda del primer Elemento De La lista De Personas  /**
             * Coloco la lista Auxiliar De Personas a la izquierda del primer Elemento De La lista De Personas  /**
             * Coloco la lista Auxiliar De Personas a la izquierda del primer Elemento De La lista De Personas  /**
             * Coloco la lista Auxiliar De Personas a la izquierda del primer Elemento De La lista De Personas  
             */
            cabeza = nodoAuxiliarDeLaLista;/**
             * Finalmente el primer Elemento De La Lista haora referencia al nuevo elemento  
             */
        } 
        else if (cabeza.getNext() == null) {/**
         * De lo contrario si se debe insertar un elemento a la derecha del primer Elemento De La Lista 
         * y no hay nada en el segundo elemento
         */
            cabeza.setNext(new Nodo(persn));/** Referencio el siguiente objeto Persona Directamente
             * Creando un  objeto Nodo adentro de lista De Personas con el objeto Persona como parametro
             */
        } 
        else { /**
             * De lo contrario 
             */
            Nodo nodoAuxiliarDeLaListaPersonas = cabeza;/**
             * Creamos la variable nodoAuxiliarDeLaListaPersonas para poder reccorer el objeto listaDePersonas
             */
            while (nodoAuxiliarDeLaListaPersonas.getNext() != null 
                    && nodoAuxiliarDeLaListaPersonas.getNext().getDato().getId() < persn.getId()) {/**
                    *Empezamos a recorrer el objeto nodoAuxiliarDeLaListaPersonas el cual contiene la listaDePersonas 
                    *siempre y cuando el objeto perzona recibido por parametro posee un id mayor 
                    *al atributo id del siguiente objeto de tipo Persona contenido en el objeto nodoAuxiliarDeLaListaPersonas 
                    */
                    nodoAuxiliarDeLaListaPersonas = nodoAuxiliarDeLaListaPersonas.getNext();
            }
            /**
             * El bucle while finaliza cuando se ubica donde debe ir el objeto Persona que se desea insertar
             */
            Nodo nodoTemporalDeLaListaPersonas =new Nodo(persn);/**
             * Creo el objeto nodoTemporalDeLaListaPersonas para insertar el objeto perzona recibido por parametro
             */
            nodoTemporalDeLaListaPersonas.setNext(nodoAuxiliarDeLaListaPersonas.getNext());/**
             * Enlazo nodoTemporalDeLaListaPersonas al siguiente objeto de nodoAuxiliarDeLaListaPersonas
             */
            nodoAuxiliarDeLaListaPersonas.setNext(nodoTemporalDeLaListaPersonas);/**
             * Enlazo el siguiente objeto de tipo nodoAuxiliarDeLaListaPersonas como nodoTemporalDeLaListaPersonas
             */
        }
    } 
    @Override
    public String toString() {
        Nodo nodoAuxiliarDeLaListaPersonas= cabeza;
        String s="   \n";
        while (nodoAuxiliarDeLaListaPersonas!= null){
            s+=nodoAuxiliarDeLaListaPersonas+"\n";
            nodoAuxiliarDeLaListaPersonas = nodoAuxiliarDeLaListaPersonas.getNext();
        }
        return s;
    } 
    public boolean existe(int id){
        /**
         * Busca en la listaDePersonas y retorna true si una persona tiene el id en la lista
         **/
         boolean esta=false;   
         if(cabeza!=null){
             if(id>=cabeza.getDato().getId() && id<=ultimo.getDato().getId()){
                 Nodo aux = cabeza;
                 while(aux!= ultimo && aux.getDato().getId()<id){
                        aux= aux.getNext();
                 }
                 esta =( aux.getDato().getId()==id);
             }
         } 
        return esta;
    }
    public void modificar(Persona p){ 
        /**
         * Busca a si existe alguien con el id , y le actualiza el nombre
         **/ 
         if(cabeza!=null){
             if(p.getId()>=cabeza.getDato().getId() &&
                     p.getId()<=ultimo.getDato().getId()){
                 Nodo aux=cabeza;
                 while(aux !=ultimo && aux.getDato().getId()<p.getId()){
                     aux=aux.getNext();
                 }
                 if(aux.getDato().getId()==p.getId()){
                     aux.getDato().setNombre(p.getNombre());
                 }
             }
         }   
    }
    public void elimina(int id){ 
        /**
         * Si una persona tiene el id lo elimina 
         **/ 
        if(cabeza!=null){
            if(cabeza.getDato().getId()<=id
                    && id<=ultimo.getDato().getId()){
                if(cabeza.getDato().getId()==id){
                    cabeza=cabeza.getNext();
                    ultimo.setNext(cabeza);
                }
                else{
                    Nodo aux = cabeza;
                    while(aux.getNext()!=cabeza
                            && aux.getNext().getDato().getId()<id){
                        aux=aux.getNext();
                    }
                    if(aux.getNext().getDato().getId()==id){
                        if(aux.getNext()==ultimo){
                            ultimo=aux;
                        }
                        aux.setNext(aux.getNext().getNext());
                    }
                }
            }
        }
    }
    public Persona extraer(int id){
        Persona p =null;
        /**
         * Si una persona tiene el id lo extrae eliminando y retornando 
         */  
        if(cabeza!=null){
            //Si esta dentro del rango
            if(cabeza.getDato().getId()<=id
                    && id<=ultimo.getDato().getId()){
                if(cabeza.getDato().getId()==id){
                    p=cabeza.getDato();
                    cabeza=cabeza.getNext();//actualizo cabeza
                    ultimo.setNext(cabeza);//actualizo el ultimo.next
                }
                else{
                    Nodo aux = cabeza;//utilizo aux como in
                    while(aux.getNext()!=cabeza
                            && aux.getNext().getDato().getId()<id){
                        aux=aux.getNext();
                    }
                    if(aux.getNext().getDato().getId()==id){
                        p=aux.getNext().getDato();
                        if(aux.getNext()==ultimo){
                            ultimo=aux;
                        }
                        aux.setNext(aux.getNext().getNext());
                    }
                }
            }
        }//END IF;
        return p;
    }
}
