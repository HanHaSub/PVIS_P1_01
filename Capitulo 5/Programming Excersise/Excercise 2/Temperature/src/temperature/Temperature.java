/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temp = entrada.nextInt();
        if(temp>=90){
            System.out.println("Dangerous heat");
        }
        if(temp<=32){
            System.out.println("Dangerous cold");
        } 
        if(temp>32&&temp<90){
            System.out.println("normal Temperature");
        }
    }
    
}
