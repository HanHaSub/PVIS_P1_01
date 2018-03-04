/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathtest;

/**
 *
 * @author acer
 */
public class MathTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double a = Math.sqrt(37.0);
        Double b = Math.sin(300.0);
        Double b1 = Math.cos(300.0);
        Long c = Math.round(22.8);
        Double c2 = Math.floor(22.8);
        double d = Math.random();
        System.out.println("The square root of 37 is: "+a);
        System.out.println("The sine of 300 is: "+b);
        System.out.println("The cosine of 300 is: "+b1);
        System.out.println("22.8 rounded is: "+c);
        System.out.println("22.8 rounded is:: "+c2);
        System.out.println("Random number: "+d);
    }
    
}
