/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectedsales;

/**
 *
 * @author acer
 */
public class ProjectedSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ventanor=4000*0.1;
        double tnorte=ventanor+4000;
        double ventasur=5500*0.1;
        double tsur=ventasur+5500;
        System.out.println("The value of the North Division will increase by 10% from 4000 to= " + tnorte);
        System.out.println("The value of the South Division will increase by 10% from 5500 to= " + tsur);
    }
    
}
