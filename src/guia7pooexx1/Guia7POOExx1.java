/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooexx1;

import Entidades.fra;
import Servicios.OperacionesService;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Guia7POOExx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        fra f1 = new fra();
        fra f2 = new fra();
        int op = 0;
        
        Scanner leer = new Scanner(System.in);
        
        OperacionesService os = new OperacionesService();
        
        System.out.println("ingrese el numerador de la primer fraccion");
        f1.setN1(leer.nextInt());
        System.out.println("ingrese el denominador de la primer fraccion");
        f1.setD1(leer.nextInt());
        System.out.println("ingrese el numerador de la segunda fraccion");
        f1.setN2(leer.nextInt());
        System.out.println("ingrese el denominador de la segunda fraccion");
        f1.setD2(leer.nextInt());
        
        do {
            
        System.out.println("MENU DE OPERACIONES");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.println("5. SALIR");
        op = leer.nextInt();
        
        
       if(op>0&&op<5){
        
        switch (op){
            case 1: os.suma(f1);
            break;
            case 2: os.resta(f1);
            break;
            case 3: os.multi(f1);
            break;
            case 4: os.div(f1);
            break;
            }
        
       }else if (op==5){
           
           System.out.println("SALIO DEL PROGRAMA");
           
       }
            
            
            
        } while (op!=5);
        
        
      
        
    }
    
}
