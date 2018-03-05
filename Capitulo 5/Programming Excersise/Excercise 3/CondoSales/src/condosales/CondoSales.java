/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condosales;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class CondoSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("What type of house do you want? ");
        System.out.println("1.View of the Park");
        System.out.println("2)Golf Court");
        System.out.println("3)View of the Lake");
        int elegir = entrada.nextInt();
        if(elegir==1){
            System.out.println("The Price is: $150,000");
        }
        if(elegir==2){
            System.out.println("The Price is: $170,000");
        }
        if(elegir==3){
            System.out.println("The Price is: $210,000");
        }
    }
    
}
