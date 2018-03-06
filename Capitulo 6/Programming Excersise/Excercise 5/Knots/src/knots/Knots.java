/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knots;

/**
 *
 * @author acer
 */
public class Knots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double contador = 1;
        double contador2=1;
        int factorial = 1;
        for (int i = 15; i <= 30; i++) {
            contador = contador * 1.852;
            contador2 = contador2*1.151;
            System.out.println("Kilometers: "+contador);
            System.out.println("Miles: "+contador2);
        }
    }
}