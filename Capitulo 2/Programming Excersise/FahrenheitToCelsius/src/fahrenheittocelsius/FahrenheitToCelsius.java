/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheittocelsius;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class FahrenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("Enter Degrees Fahrenheit: ");
        double x = entrada.nextDouble();
        double total=((x-32)*5/9);
        System.out.println("Degrees Celsius are:  "+total);
    }
    
}
