/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author manul
 */
public class Cola {

    private Nodo inicio;
    private Nodo fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void encolar() {
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

    public void desencolar() {
         ListaCircular l = new ListaCircular();
        if (!vacia()) {
             //aqui va el metodo de listacircular
            
             l.agregarCircular(inicio.getDato().getNombre(), inicio.getDato().getApellidos(), inicio.getDato().getEdad(), inicio.getDato().getNumcontacto());
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "El elemento fue extraido");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer, cola vacia");
        }
    }

    public void mostrar() {
        if (!vacia()) {
            String s = "";
            Nodo aux = inicio;
            while (aux != null) {
                s = s + aux.getDato().getNombre() + " "
                        + aux.getDato().getApellidos()+ " / "
                        + aux.getDato().getEdad()+ "/  ["+ aux.getDato().getNumcontacto()+"] "+ "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar");
        }
    }
}
