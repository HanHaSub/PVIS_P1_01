/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class PAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Level/payments per hour\n1 17.00 \n2 20.00 \n3 22.00");
        System.out.println("Choose a Level: ");
        int hour;
        float prize  = 0;
        Scanner entrada = new Scanner(System.in);
        int opcion=entrada.nextInt();
        if(opcion==1){
            System.out.println("Enter the number of hours: ");
            hour=entrada.nextInt();
            prize=hour*17;
            System.out.println("The total to be paid is: "+prize);
        }
        if(opcion==2){
            System.out.println("Enter the number of hours: ");
            hour=entrada.nextInt();
            prize=hour*20;
            System.out.println("The total to be paid is: "+prize);
        }
        if(opcion==3){
            System.out.println("Enter the number of hours: ");
            hour=entrada.nextInt();
            prize=hour*22;
            System.out.println("The total to be paid is: "+prize);
        }
    }
}
