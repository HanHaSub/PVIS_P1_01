/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inbetween;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class InBetween {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=entrada.nextInt();
        System.out.println("Enter the second number: ");
        int num2=entrada.nextInt();
        for(int i=num2;i<num1;i++){
            System.out.println(i);
        }
    }
    
}