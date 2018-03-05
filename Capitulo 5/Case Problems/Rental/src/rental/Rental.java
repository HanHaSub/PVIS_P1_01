/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Rental {
   
    private Integer hora;

    public void setHora(Integer e) {
        hora = e;
    }

    public Integer getHora() {
        return hora;
    }

    public Integer operacion() {
        Integer resul = hora * 40;
        return resul;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Rental x = new  Rental();
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("    S\tSAMMY’S MAKES IT IN THE SUN. S");
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Enter the Hours: ");
        x.setHora(entrada.nextInt());
        
        int contador=0;System.out.println("The Prize is: "+x.operacion()+" Pesos");
        for(int i=0;i<x.getHora();i++){
            System.out.println("Coupon valid for 10% discount on your next visit");
            contador=contador+1;
        }
        System.out.println("Total Coupons: "+contador);
    }
}

