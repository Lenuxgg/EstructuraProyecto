/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author manul
 */
public class ListaCircular {

    private Nodo inicioCircular;
    private Nodo finCircular;

    public ListaCircular() {
        this.inicioCircular = null;
        this.finCircular = null;

    }

    public boolean vacia() {
        if (inicioCircular == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarCircular(String n, String a, int e, String nu) {
        Cliente lc = new Cliente();
        lc.setNombre(n);
        lc.setApellidos(a);
        lc.setEdad(e);
        lc.setNumcontacto(nu);

        Nodo nuevo = new Nodo();
        nuevo.setDato(lc);

        if (vacia()) {
            inicioCircular = nuevo;
            finCircular = nuevo;
        }else{
            nuevo.setSiguiente(inicioCircular);
            inicioCircular = nuevo;
            finCircular.setSiguiente(inicioCircular);
        }
//        } else if (lc.getEdad() < inicioCircular.getDato().getEdad()) {
//            nuevo.setSiguiente(inicioCircular);
//            inicioCircular = nuevo;
//            finCircular.setSiguiente(inicioCircular);
//        } else if (lc.getEdad() > finCircular.getDato().getEdad()) {
//            finCircular.setSiguiente(nuevo);
//            finCircular = nuevo;
//            finCircular.setSiguiente(inicioCircular);
//        } else {
//            Nodo aux = inicioCircular;
//            while (aux.getSiguiente()!= null && aux.getSiguiente().getDato().getEdad() < lc.getEdad()) {
//                aux = aux.getSiguiente();
//            }
//            nuevo.setSiguiente(aux.getSiguiente());
//            aux.setSiguiente(nuevo);
//        }

    }

    public void mostrarCircular() {
        if (!vacia()) {
            String s = "";
            Nodo aux = inicioCircular;
            while (aux != null) {
                s += aux.getDato().getNombre() + " "
                        + aux.getDato().getApellidos() + " /"
                        + aux.getDato().getEdad() + "/  [" + aux.getDato().getNumcontacto() + "] " + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista circular tiene: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar");
        }
    }
       public String toString(){
       String s="";
       if(!vacia()){
           Nodo aux=inicioCircular;
           while(aux!=null){
               s+=aux.getDato().getNombre() + " "
                        + aux.getDato().getApellidos() + " /"
                        + aux.getDato().getEdad() + "/  [" + aux.getDato().getNumcontacto() + "] " + "\n";
               aux=aux.getSiguiente();
           }
           JOptionPane.showMessageDialog(null, "La lista contiene: \n"+s,
                   "contenido de la lista",JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "No se puede mostrar, lista vacia \n" + s,
                   "Lista Vacia", JOptionPane.ERROR_MESSAGE);
       }
       return s;
   }
}
