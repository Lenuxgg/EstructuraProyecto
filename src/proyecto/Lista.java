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

    public Lista() {
        this.inicio = null;
    }
    // esta es la prueba de que si sirve el github
    // esta es la segunda prueba 8=D
    // Este es un comentario xd h
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
        c.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Digite su edad")));
        c.setDirección(JOptionPane.showInputDialog("Ingrese su ubicacion"));
        c.setNumcontacto(Byte.parseByte(JOptionPane.showInputDialog("Ingrese su numero de contacto ")));
        c.setEmail(JOptionPane.showInputDialog("Ingrese su direccion de correo electronico"));
        c.setTipoPlan(JOptionPane.showInputDialog("Los tipos de plan disponibles son: Premiun,regular, simple" + "Ingrese su plan favorito:"));

        Nodo nuevo = new Nodo();
        nuevo.setDato(c);
        if (vacia()) {
            inicio = nuevo;

        } else if (c.getEdad() < inicio.getDato().getEdad()) {
            nuevo.setSiguiente(nuevo);
            inicio = nuevo;
        } else if (inicio.getSiguiente() == null) {
            inicio.setSiguiente(nuevo);

        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null
                    && aux.getSiguiente().getDato().getEdad() < c.getEdad()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public void extraer() {
        if (!vacia()) {
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "Elemento extraído");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacía");
        }
    }

    public String toString() {
        String s = "";
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                s += aux.getDato().getNombre() + " - " + aux.getDato().getApellidos() + " - " + aux.getDato().getEdad() + aux.getDato().getNumcontacto()
                        + aux.getDato().getEmail() + aux.getDato().getDirección() + aux.getDato().getTipoPlan();
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
        int nodoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato del nodo a modificar: "));
        if (actual != null) {
            while (actual != null && encontrado != true) {
                if (actual.getDato().getEdad() == nodoIngresado) {

                    JOptionPane.showMessageDialog(null, "\n Nodo con el dato " + actual.getDato().getNombre() + "encontrado \n");
                    JOptionPane.showMessageDialog(null, "Ingrese un nuevo dato para este nodo");
                    actual.getDato().setTipoPlan(JOptionPane.showInputDialog("Digite el  nuevo plan de servicio"));
                    JOptionPane.showMessageDialog(null, "\n Nodo modificado\n");
                    encontrado = true;
                    return;
                } else {
                    actual = actual.getSiguiente();
                }

            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
                return;
            }
        }
    }

    public void encontrar() {

        Nodo encon = new Nodo();
        encon = inicio;
        boolean encontrado = false;
        int nodoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que quiere encontrar "));
        if (encon != null) {
            while (encon != null && encontrado != true) {
                if (encon.getDato().getEdad() == nodoIngresado) {
                    JOptionPane.showInputDialog(null, "\n Nodo con el dato " + encon.getDato().getNombre() + "encontrado \n");
                    encontrado = true;
                    return;
                } else {
                    JOptionPane.showInputDialog(null, "La lista se encuentra vacia");
                    return;
                }
            }
        }
    }
}
