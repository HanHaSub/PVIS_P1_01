/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffe;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Coffe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("choose an option ");
        System.out.println("(1) American 1.99 \n(2) Espresso 2.50 \n(3) Latte 2.15");
        int opcion = entrada.nextInt();
        float prize = 0;
        int x = 1;
        if (opcion == 1) {
            prize = (float) (prize + 1.99);
            System.out.println("The prize is: " + prize);
        }
        if (opcion == 2) {
            prize = (float) (prize + 2.50);
            System.out.println("The Prize is: " + prize);
        }
        if (opcion == 3) {
            prize = (float) (prize + 2.15);
            System.out.println("The prize is : " + prize);
        }
        if(opcion==0){
            System.out.println("Thank you for your preference");
        }
    }
}
   
