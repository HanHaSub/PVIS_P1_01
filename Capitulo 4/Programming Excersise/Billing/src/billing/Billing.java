/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

/**
 *
 * @author acer
 */
public class Billing {

    public Double computeBill(){
        Double price = 50*0.08;
        return price;
    }
    public Double computeBill2(){
        Double price = (50*2)*0.08;
        return price;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Billing x = new Billing();
        System.out.println("The price is $50");
        System.out.println("The price with the 8% is: "+"$"+x.computeBill());
        System.out.println("The price is $50");
        System.out.println("are two pictures and the price with 8% is: "+"$"+x.computeBill2());
    }
    
}
