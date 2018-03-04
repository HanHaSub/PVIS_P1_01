/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestofeetinteractive;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class MilesToFeetInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int millas;
        System.out.println("Ingrese el total de millas");
        millas=entrada.nextInt();
        long pies=5820*millas;
        System.out.println("La distancia a la casa de mi tío es de " + millas + " millas = "+ pies + " pies.");
    }
    
}
