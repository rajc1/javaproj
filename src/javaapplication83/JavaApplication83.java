/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication83;

/**
 *
 * @author CrJ
 */
public class JavaApplication83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 1; i < 110; i++) {
            
            boolean printed = false;
            if(i%3==0){
            
                System.out.print("coza ");
                printed = true;
                
            }
            if(i%5==0){
                System.out.print("woza ");
                printed = true;
            
            }
            if(i%7==0){
            
                System.out.print("loza ");
                printed = true;
            }
            
            
            if(i%3==0 &&i%5==0){
                System.out.print("cozaloza");
                printed = true;
            
            }
            else if(!printed)
                System.out.print(i);
            
            if(i%11==0){
            
                System.out.println();
            }
            else
                System.out.print(" ");
            
            
            
        }
    }
    }
    

