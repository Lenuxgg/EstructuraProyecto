/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar_t6uqtj3
 */
public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private Nodo inicioCicular;
    private Nodo finCircular;
      private int contador=0;

    public Lista() {
        this.inicio = null;
        this.fin = null;
        this.inicioCicular = null;
        this.finCircular = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        Cliente c = new Cliente();
        c.setNombre(JOptionPane.showInputDialog("Digite su nombre "));
        c.setApellidos(JOptionPane.showInputDialog("Digite sus 2 apellidos"));
        c.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite su edad")));
        c.setNumcontacto((JOptionPane.showInputDialog("Ingrese su numero de contacto ")));
        
        Nodo nuevo = new Nodo();
        nuevo.setDato(c);

        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;

        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void extraer() {
        if (!vacia()) {
            Nodo nuevoCircular = new Nodo();
            nuevoCircular = inicio;
             contador = contador + 1;

            if (vacia()) {
                inicioCicular = nuevoCircular;
                finCircular = nuevoCircular;
            } else {
                nuevoCircular.setSiguiente(inicioCicular);
                inicioCicular = nuevoCircular;
                fin.setSiguiente(inicioCicular);
            }

            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "Cliente atendido");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede atender, lista vacía");
        }
    }

    public String toString() {
        String s = "";
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                s += aux.getDato().getNombre() + " - " + aux.getDato().getApellidos() + " - " + aux.getDato().getEdad() + aux.getDato().getNumcontacto();
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene: \n" + s,
                    "Contenido de la lista", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar, lista vacía \n" + s,
                    "Lista Vacía", JOptionPane.ERROR_MESSAGE);
        }
        return s;
    }

    public void modificar() {
        Nodo actual = new Nodo();
        actual = inicio;
        boolean encontrado = false;
        int nodoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad  del cliente a modificar: "));
        if (actual != null) {
            while (actual != null && encontrado != true) {
                if (actual.getDato().getEdad() == nodoIngresado) {

                    JOptionPane.showMessageDialog(null, "Cliente con el dato\n " + actual.getDato().getNombre() + "encontrado \n");
                    JOptionPane.showMessageDialog(null, "Ingrese un nuevo dato para este cliente");
                    JOptionPane.showMessageDialog(null, "\n Nodo modificado\n");
                    encontrado = true;
                    return;
                } else {
                    actual = actual.getSiguiente();
                }

            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
                return;
            }
        }
    }
//revisar el dato a encontrar  especificar que es la edad
    public void encontrar() {

        Nodo encon = new Nodo();
        encon = inicio;
        boolean encontrado = false;
        int nodoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente  que quiere encontrar "));
        if (encon != null) {
            while (encon != null && encontrado != true) {
                if (encon.getDato().getEdad() == nodoIngresado) {
                    JOptionPane.showMessageDialog(null, "cliente con  con el dato \n" + encon.getDato().getNombre() + "encontrado \n");
                    encontrado = true;
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
                    return;
                }
            }
        }
    }

    public String mostrarCircular() {
        String s = "";
        if (!vacia()) {
            Nodo aux =inicioCicular ;
            while (aux != null) {
                s += aux.getDato().getNombre() + " - " + aux.getDato().getApellidos() + " - " + aux.getDato().getEdad() + aux.getDato().getNumcontacto();
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene: \n" + s,
                    "Contenido de la lista", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar, lista vacía \n" + s,
                    "Lista Vacía", JOptionPane.ERROR_MESSAGE);
        }
        return s;
    }
 public void totalClientes(){
     JOptionPane.showMessageDialog(null, "El total de clientes atendidos es de :"+ contador);
 }
}
