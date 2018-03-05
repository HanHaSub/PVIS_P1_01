/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigitalcamera;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class SigitalCamera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("How many megapixels is the camera?");
        System.out.println("1)6 Megapixeles\n2)Other");
        int opcion=entrada.nextInt();
        int amount;
        if(opcion==1){
            System.out.println("The price of the camera is $99");
            System.out.println("Enter the amount: ");
            amount=entrada.nextInt();
            System.out.println("The prize is: "+(amount*99));
        }
        if(opcion==2){
            System.out.println("The price of the camera is $129");
            System.out.println("Enter the amount: ");
            amount=entrada.nextInt();
            System.out.println("The prize is:  "+(amount*129));
        }
    }
}
    
