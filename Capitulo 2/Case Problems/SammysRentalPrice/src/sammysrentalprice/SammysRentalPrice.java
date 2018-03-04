/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammysrentalprice;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class SammysRentalPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS");
        System.out.println("    S  \tSAMMY’S MAKES IT IN THE SUN.  S");
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS");
        System.out.println("enter the rent hours: ($40 per hour)");
        int hours = entrada.nextInt();
        int total=(hours*40);
        System.out.println("it cost: "+hours+" hours. The Price is: "+total);
        
    }
    
}
