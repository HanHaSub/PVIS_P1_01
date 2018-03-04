/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlyseventpricewithmethods;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class CarlysEventPriceWithMethods {

    private Integer guests;
    public void setGuests(Integer g) {
        guests = g;
    }
    public Integer getGuests() {
        return guests;
    }
    public Integer operation() {
        Integer result =guests*35;
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CarlysEventPriceWithMethods x=new CarlysEventPriceWithMethods();
        System.out.println("    ****************************************************");
        System.out.println("    *\t ¡Carly’s makes the food that makes it a party!.  *");
        System.out.println("    ****************************************************");
        System.out.println("Ingrese la cantidad de invitados: ");
        x.setGuests(entrada.nextInt());
        if (x.getGuests()>=50){
            System.out.println("¡¡¡BIG PARTY!!!");
            System.out.println("It costs: " + x.operation()+" Pesos");
        }else{
            System.out.println("¡¡¡SMALL PARTY!!!");
            System.out.println("It costs: " + x.operation()+" Pesos");
        }
        
    }
    
}
