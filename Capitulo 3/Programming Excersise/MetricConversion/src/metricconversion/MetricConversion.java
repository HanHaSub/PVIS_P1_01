/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricconversion;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class MetricConversion {
    
    private Double inches;
    private Double gallones;
    public void setInches(Double i) {
        inches = i;
    }
    public Double getinches() {
        return inches;
    }
    public void setGallones(Double g) {
        gallones = g;
    }
    public Double getGallones() {
        return gallones;
    }
    public Double pricePerGallon() {
        Double result = gallones * 3.7854 ;
        return result;
    }
    public Double pricePerInche() {
        Double result = inches * 2.54;
        return result;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MetricConversion x =new MetricConversion();
        System.out.println("Enter the number of gallones: ");
        x.setGallones(entrada.nextDouble());
        System.out.println("The liters are: "+x.pricePerGallon());
        System.out.println("Enter the number in centimeters: ");
        x.setInches(entrada.nextDouble());
        System.out.println("The price is: "+x.pricePerInche());
    }
    
}
