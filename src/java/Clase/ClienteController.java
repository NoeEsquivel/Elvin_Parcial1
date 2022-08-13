/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author Elvin Esquivel
 */
public class ClienteController {
    
    String Codigo;
    String Nombre;
    String Pasta;
    String Editorial;
    String Fecha;
    
public ClienteController(String Codigo, String Nombre, String Pasta, String Editorial, String Fecha)
    {
        this.Codigo=Codigo;
        this.Nombre=Nombre;
        this.Pasta=Pasta;
        this.Editorial=Editorial;
        this.Fecha=Fecha;
  
    
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPasta() {
        return Pasta;
    }

    public void setPasta(String Pasta) {
        this.Pasta = Pasta;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
            
    
    
}
