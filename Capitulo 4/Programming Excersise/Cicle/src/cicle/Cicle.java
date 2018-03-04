/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicle;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Cicle {

    Double radio;
   public Double getRadio(){
       return radio;
   }
   public void setRadio(Double r){
       radio=r;
   }
   public Double operation1(){
       Double diameter = radio*2;
       return diameter;
   }
   public Double operation2(){
       Double area = (Math.PI*Math.pow(radio,2));
       return area;
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Cicle x = new Cicle();
       System.out.println("Enter the radio: ");
       x.setRadio(entrada.nextDouble());
       System.out.println("The diameter is: "+x.operation1());
       System.out.println("The area is: "+x.operation2());
    }
    
}
