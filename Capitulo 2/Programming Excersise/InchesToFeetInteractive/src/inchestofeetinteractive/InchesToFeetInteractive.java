/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchestofeetinteractive;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class InchesToFeetInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Enter inches:  ");
        int inche=entrada.nextInt();
         double total=0.0833333*inche;
         System.out.println("Inche: "+ inche + "\nfeet: "+ total);
        
    }
    
}
