/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammysrentalpricewithmethods;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class SammysRentalPriceWithMethods {

    private Integer hour;

    public void setHour(Integer e) {
        hour = e;
    }

    public Integer getGuests() {
        return hour;
    }

    public Integer operation() {
        Integer result = hour * 40;
        return result;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SammysRentalPriceWithMethods x = new  SammysRentalPriceWithMethods();
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS");
        System.out.println("    S \t¡SAMMY’S MAKES IT IN THE SUN! S");
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS");
        System.out.println("Hours: ");
        x.setHour(entrada.nextInt());
        System.out.println("The price is: "+x.operation()+" Pesos");
    }
    
}
