/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condosales2;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class CondoSales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("What type of do you want? ");
        System.out.println("1.View of the Park");
        System.out.println("2.Golf Court");
        System.out.println("3.View of the Lake");
        int elegir = entrada.nextInt();
        int elegir2;
        if(elegir==1){
            System.out.println("The Price is: $150,000");
            System.out.println("Do you want it with garage?");
            System.out.println("1)Yes/2)No");
            elegir2 = entrada.nextInt();
            if(elegir2==1){
                System.out.println("extra cost: $5000");
            }
            if(elegir2==2){
                System.out.println("Thanks for uour preference");
            }
        }
        if(elegir==2){
            System.out.println("The Price is: $170,000");
            System.out.println("Do you want it with garage?");
            System.out.println("1)Yes/2)No");
            elegir2 = entrada.nextInt();
            if(elegir2==1){
                System.out.println("extra cost: $5000");
            }
            if(elegir2==2){
                System.out.println("Thanks for your preference");
            }
        }
        if(elegir==3){
            System.out.println("The Price is: $210,000");
            System.out.println("Do you want it with garage?");
            System.out.println("1)yes/2)No");
            elegir2 = entrada.nextInt();
            if(elegir2==1){
                System.out.println("extra cost: $5000");
            }
            if(elegir2==2){
                System.out.println("Thanks for your preference");
            }
        }
    }
    
}
   
