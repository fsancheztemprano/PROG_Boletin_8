/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_8_9;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_8_9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int suma=0;
        
        while(suma<100){
            suma += scan.nextInt();
        System.out.println("suma: " + suma);
        }
        
    }
    
}
