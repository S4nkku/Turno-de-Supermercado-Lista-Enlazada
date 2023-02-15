package com.mycompany.ejercicio_4;

import javax.swing.JOptionPane;    

public class Ejercicio_4 {

    public static void main(String[] args) {
        Lista lista1 = new Lista();
        int Opciones = 0;
        String Nombre;
        do {
            try {
                Opciones = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar elemento a la lista\n "+ "2. Agregar un elemento final\n "+ "3. Mostrar la lista\n " + "4. Finalizar Programa"));
                
                switch(Opciones) {
                    case 1:
                        try {
                            Nombre = JOptionPane.showInputDialog(null, "Ingrese el Cliente:", "Cliente Cola", 3);
                            lista1.nuevoElemento(Nombre);
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                        
                        
                    case 2:
                        try {
                            Nombre = JOptionPane.showInputDialog(null, "Ingrese el Cliente: ", "Cola Cliente", 3);
                            lista1.elementoFinal(Nombre);
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                        

                    case 3:
                        lista1.obtenerLista();
                        
                        
                        
                        break;
                        
                        
                        
                    case 4:
                        break;  
                    default:
                        JOptionPane.showMessageDialog(null, "Error, Digite otra opcion");
                        break;
                }
                
                
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                
                
                
            }
        } while(Opciones != 4);
    }
    }

