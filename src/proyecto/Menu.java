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
    Lista l = new Lista();

    public void Menu() {
        while (op != 7) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenidos Fantasy Beauty Salón le saluda\n" + "Ingresa la opcion del Menu principal que desee realizar\n"
                    + "1. Lista: Agendar\n"
                    + "2. Lista: Mostrar "
                    + "3. Lista: Modificar\n"
                    + "4. Lista: Encontrar\n"
                    + "5. ---Atender--- \n"
                    + "6. Atendidos: Mostrar \n"
                    + "7. Salir\n", "Menu principal", JOptionPane.QUESTION_MESSAGE));
            switch (op) {
                case 1:
                    l.agregar();
                    break;
                case 2:
                    l.toString();
                    break;
                case 3:
                    l.modificar();
                    break;
                case 4:
                    l.encontrar();
                    break;
                case 5:
                    l.extraer();
                    break;
                case 6:
                    l.mostrarCircular();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, opción invalida");
            }

        }
    }
}
