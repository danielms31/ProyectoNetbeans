package com.mycompany.holamundo;

/**
 *
 * @author Administrador
 */
public class Holamundo {
    
    public static void main(String[] args) {
        System.out.println("Hola desde el main");
        saluda();
        System.out.println("Hola desde el main 2");
        System.out.println("Hola desde el main 3");
        System.out.println("Hola desde el main 4");
        
        int a = 8;
        int b = 9; 
        int c = 11; 
        int d = 12 ;
        float z = (float) 6.5;
        float f = (float) 7.9;
        
        for (int i=0;i<10;i++){
            System.out.println("i es = "+i);
        }
        
    }
    
    public static void saluda(){
        System.out.println("Hola desde la funcion saluda");
        System.out.println("Hola desde la funcion saluda 2");
        System.out.println("Hola desde la funcion saluda 3");
    }
    
}
