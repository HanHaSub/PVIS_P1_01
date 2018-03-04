/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasprices;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class GasPrices {

    private Double gallon;
    private Double barrel;
    
    
public void setGallon(Double g) {

    gallon=g;

    }

public Double getGallon() {
        return gallon;
    }

public void setBarrel(Double b) {
        barrel = b;
    }

public Double getBarrel() {
        return barrel;
    }

public Double pricePerGallon() {
        Double result = gallon * 4;
        return result;
    }

public Double pricePerBarrel() {
        Double result = barrel * 100;
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GasPrices x=new GasPrices();
        System.out.println("Enter The numeber of gallons: ");
        x.setGallon(entrada.nextDouble());
        System.out.println("The prize is: "+x.pricePerGallon());
        System.out.println("The number of barreles: ");
        x.setBarrel(entrada.nextDouble());
        System.out.println("The Price is: "+x.pricePerBarrel());
    }
    
}
