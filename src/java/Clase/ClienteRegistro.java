/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author Elvin Esquivel
 */
public class ClienteRegistro {
    
    
ClienteController[] tabla;
    int indicearay;
    
    
    public ClienteRegistro ()
    {
        this.tabla=new ClienteController[100];
        
        this.indicearay=0;
    
    
    
    
    
    }
    
    
    public void guardarregistro (ClienteController Registro){
    
    this.tabla[this.indicearay]=Registro;
    
    this.indicearay=this.indicearay+1;
    
    
    
    
    }
    
    public ClienteController []getClienteController(){
    
    return this.tabla;
    
    
    
    
    }
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
