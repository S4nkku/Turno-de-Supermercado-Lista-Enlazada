
package com.mycompany.ejercicio_4;

/**
 *
 * @author david
 */
public class Lista {
    
     protected Nodo Inicial;
    protected Nodo Final;
    
    public Lista() {
        
        this.Inicial = null;
        this.Final = null;
        
    }
    
  
    public boolean isEmpty() {
        if(this.Inicial == null) {
            return true;
         } else {
            System.out.println(isEmpty());
            return false;
                 }
     }
    

    
    
    
    public void elementoFinal(String item) {
        if(!isEmpty()) {
            this.Final.Siguiente = new Nodo(item);
            this.Final = this.Final.Siguiente;
            
            
        } else {
            
            
            this.Inicial  = new Nodo(item);
            this.Final = new Nodo(item);
            
            
                }
         }
    
  
    
    
    
    
    public void nuevoElemento(String item) {
       
        this.Inicial = new Nodo(item, this.Inicial);
        
       
        if(this.Final == null) {
            this.Final = this.Inicial;
             }
        
        
        
            }


    public void obtenerLista() {
        Nodo iteracion = this.Inicial;
        while(iteracion != null) {
            System.out.print("[" + iteracion.Nombre + "]==>");
            iteracion = iteracion.Siguiente;
          }
        
        
        
         }
        
    
}
