/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Eggs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        float dozen;
        float total;
        System.out.println("¿How many eggs do you want?: ");
        int egg = entrada.nextInt();
        if (egg >= 12) {
            if (egg % 12 == 0) {
                dozen = egg / 12;
                System.out.println("Number of dozens:: " + dozen + " a $3.25 per dozen");
                total = (float) (dozen * 3.25);
                System.out.println("The Total Price is: " + total);
            }else{
                int dozen2=Math.abs(egg/12);
                float x =(float)egg/2;
                float y =x-12;
                float z=y*2;
                System.out.println("Number of dozens: "+dozen2+" a 3.25 per dozen"+
                        "Quantity of eggs loose:  "+z +" to $0.45");
                float total2=(float) ((dozen2*3.25)+(z*0.45));
                System.out.println("Total is: "+total2);
            }
        }else{
            int dozen2=Math.abs(egg/12);
                float x =(float)egg/2;
                float y =x-12;
                float z=y*2;
                System.out.println("How Many Dozens: "+dozen2+" a 3.25 per dozen"+
                        "Quantity of eggs loose:  "+z +" a $0.45");
                float total2=(float) ((dozen2*3.25)+(z*0.45));
                System.out.println("The Total is:  "+total2);
        }else{
        System.out.println("Quantity of eggs: " + egg + " a $0.45 per piece");
            total = (float) (egg * 0.45);
            System.out.println("The Total Price is: " + total);
        }
    }
}