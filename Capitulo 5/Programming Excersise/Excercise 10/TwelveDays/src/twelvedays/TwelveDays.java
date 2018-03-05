/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelvedays;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class TwelveDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter th Day ");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("A partridge in a pear tree");
            case 2:
                System.out.println("Two turtledoves");
            case 3: 
                System.out.println("Three French hens");
            case 4:
                System.out.println("Four birds chirping");
            case 5:
                System.out.println("Five Gold Rings");
            case 6:
                System.out.println("Six geese brooding");
            case 7:
                System.out.println("Seven Swans swimming");
            case 8: 
                System.out.println("Eight Maids milking");
            case 9:
                System.out.println("Nine Ladies Dancing");
            case 10:
                System.out.println("Ten Gentlemen Jumping");
            case 11:
                System.out.println("Eleven bagpipers playing the bagpipes");
            case 12:
                System.out.println("Twelve drummers touching the drum");
        }
    }

}

