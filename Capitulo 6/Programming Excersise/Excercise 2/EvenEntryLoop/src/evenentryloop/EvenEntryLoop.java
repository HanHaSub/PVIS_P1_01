/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenentryloop;

import java.io.DataInputStream;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class EvenEntryLoop {
    
    static int number;
    static Scanner scanner = new Scanner(new DataInputStream(System.in));

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hi!");
        while (true) {
        System.out.println("Please type an even number to continue or '999' to stop");
        number = scanner.nextInt();
        if (number == 999) {
        System.exit(0);
            }
        if (number % 2 != 0) {
        System.out.println("Wrong input! Try again.");
        } else {
        System.out.println("Good job!");
            }
        }
    }
}
