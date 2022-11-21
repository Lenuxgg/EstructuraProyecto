/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author ricar_t6uqtj3
 */
public class Nodo {
    private Cliente dato;
    private Nodo siguiente;
    
    public Nodo(){
        this.siguiente=null;
        
    }

    /**
     * @return the dato
     */
    public Cliente getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
