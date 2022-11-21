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
    int op=0;
    Lista l=new Lista();
   
    public void Menu(){
        while(op!=4){
            op=Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenidos Fantasy Beauty Salón le saluda\n"+"Ingresa la opcion del Menu principal que desee realizar\n"
            +"1. Registrarse como cliente\n"
            +"2. Agendar una cita \n"
            +"3. Mostar sucursales\n"
            +"4. Mostar servicios\n"       
            +"5. Mas informacion\n"
            +"6. Salir\n","Menu principal", JOptionPane.QUESTION_MESSAGE));
             switch (op) {
                case 1:
                 l.agregar();
                   break;
                case 2:
                    l.extraer();
                    break;
                case 3:
                    l.toString();
                    break;
                case 4:
                   break;
                case 5:
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

            
    

