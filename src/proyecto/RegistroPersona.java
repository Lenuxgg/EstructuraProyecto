//Esta clase es para registrar los clientes 
package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar_t6uqtj3
 */
public class RegistroPersona {
    Lista m=new Lista();
     int op=0;
   
    
    public void MenuClientes(){
        while(op!=6){
            op=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu principal\n"
            +"1. Agregar cliente\n"
            +"2. Extraer Cliente\n"
            +"3. Mostar Clientes\n"
            +"4.Modificar clientes"
            + "5. Encontrar un cliente"
            +"6. Salir\n","Menu principal", JOptionPane.QUESTION_MESSAGE));
            
            switch(op){
                case 1:
                    
                   
            }
            
        }}
}



