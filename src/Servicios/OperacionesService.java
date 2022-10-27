/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.fra;

/**
 *
 * @author A288808
 */
public class OperacionesService {
    
    public void suma(fra n1){
        
        int num1 = n1.getN1()*n1.getD2();
        int num2 = n1.getN2()*n1.getD1();
        int num3 = n1.getD1()*n1.getD2();
        double resultado=(num1+num2)/num3;
        
        if(n1.getD1()!=n1.getD2()){
         
            
        System.out.println("EL resultado es " + (num1+num2) + "/" + num3);
        
        }else {
         
        System.out.println("EL resultado es " + (n1.getN1()+n1.getN2()) + "/" + n1.getD1());
        }
        
        
    }
    public void resta(fra n1){
        
        int num1 = n1.getN1()*n1.getD2();
        int num2 = n1.getN2()*n1.getD1();
        int num3 = n1.getD1()*n1.getD2();
        double resultado=(num1+num2)/num3;
        
        if(n1.getD1()!=n1.getD2()){
         
            
        System.out.println("EL resultado es " + (num1-num2) + "/" + num3);
        
        }else {
         
        System.out.println("EL resultado es " + (n1.getN1()-n1.getN2()) + "/" + n1.getD1());
        }
        
        
    }
    public void multi(fra n1){
        
        int num1 = n1.getN1()*n1.getN2();
        int num2 = n1.getD1()*n1.getD2();
        
        System.out.println("La multiplicacion de las fraciones es " + num1 + "/" + num2);
        
        
    }
    public void div(fra n1){
        
        int num2 = n1.getN1()*n1.getD2();
        int num1 = n1.getD1()*n1.getN2();
        
        System.out.println("La division de las fracciones es " + num2 + "/" + num1);
        
    }
    
    
    
    
}
