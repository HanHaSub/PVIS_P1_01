/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlyseventprice;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class CarlysEventPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int total;
        System.out.println("    ****************************************************");
        System.out.println("    *\t¡Carly’s makes the food that makes it a party.!  *");
        System.out.println("    ****************************************************");
        System.out.println("Enter the number of guests: \n($35 per each guest) ");
        int guest=entrada.nextInt();
        if (guest>=50){
            System.out.println("BIG EVENT");
            total=guest*35;
            System.out.println("The total price is about: "+total);
        }
        else {
            System.out.println("SMALL EVENT");
            total=guest*35;
            System.out.println("The total prince is about: "+total);
        }
    }
    
}
