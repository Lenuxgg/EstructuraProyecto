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
public class Menu {

    int op = 0;
    Cola l = new Cola();
    ListaCircular lc = new ListaCircular();

    public void Menu() {
        while (op != 6) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenidos Fantasy Beauty Salón les saluda\n" + "Ingresa la opcion del Menu principal que desee realizar\n"
                    + "1. Lista: Agendar\n"
                    + "2. Lista: Mostrar \n"
                    + "3. ---Atender--- \n"
                    + "4. Atendidos: Mostrar \n"
                    + "5. Numero de clientes atendidos \n "
                    + "6. Salir\n", "Menu principal", JOptionPane.QUESTION_MESSAGE));
            switch (op) {
                case 1:
                    l.encolar();
                    Menu();
                    break;
                case 2:
                    l.mostrar();
                    Menu();
                    break;
                case 3:
                    l.desencolar();
                    Menu();
                    break;
                case 4:
                    lc.mostrarCircular();
                    Menu();
                    break;
                case 5:
                    Menu();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, opción invalida");
            }

        }
    }
}
