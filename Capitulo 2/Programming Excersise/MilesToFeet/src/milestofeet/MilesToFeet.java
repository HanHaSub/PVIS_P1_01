/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestofeet;

/**
 *
 * @author acer
 */
public class MilesToFeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Vmillas=5280;
        int millas=8500;
        long pies =Vmillas*millas;
        System.out.println("La distancia a la casa de mi tío es de " + millas + " millas = "+ pies + " pies.");
    }
    
}
