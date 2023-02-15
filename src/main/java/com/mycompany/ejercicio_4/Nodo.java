package com.mycompany.ejercicio_4;

public class Nodo {
    public String Nombre;
    public Nodo Siguiente;
    
    
    
    
    
   
    public Nodo(String Nombre) {
        this.Nombre = Nombre;
        this.Siguiente = null;
       
    }
 
    
    
    
    
    
    public Nodo(String Nombre, Nodo nodo) {
        this.Nombre = Nombre;
        this.Siguiente = nodo;
    }
    
}
    
    
    

