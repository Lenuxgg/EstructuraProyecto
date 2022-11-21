/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author ricar_t6uqtj3
 */
public class Cliente {
    private String nombre,apellidos,  email, dirección,
tipoPlan;
    private byte edad, numcontacto;
    
    public Cliente(){
        this.nombre="";
         this.apellidos="";
          this.edad=0;
           this.numcontacto=0;
            
             this.dirección="";
              this.tipoPlan="";
              
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getNumcontacto() {
        return numcontacto;
    }

    public void setNumcontacto(byte numcontacto) {
        this.numcontacto = numcontacto;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }
    
}