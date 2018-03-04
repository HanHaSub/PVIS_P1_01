/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogboarding;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class DogBoarding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double total;
        System.out.println("Enter the weight of the dog\n($0.5 per weight): ");
        int weight=entrada.nextInt();
        System.out.println("Enter the day?\n($0.5 per day): ");
        int days = entrada.nextInt();
        total=((weight*0.5)+(days*0.5));
        System.out.println("The total is: "+total);
    }
    
}
