/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Salary {
    
    private Integer hour;
    private Integer pay;
    public void setHour(Integer hr) {
        hour = hr;
    }
    
    public Integer getHour() {
        return hour;
    }
    
     public void setPay(Integer p) {
        pay = p;
    }
     
     public Integer getPay() {
        return pay;
    }
     
    public Integer operation() {
        Integer result = hour*pay;
        return result;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Salary x=new Salary();
        System.out.println("enter the hours of the workers: ");
        x.setHour(entrada.nextInt());
        System.out.println("enter the pay per hour: ");
        x.setPay(entrada.nextInt());
        System.out.println("the quantity belongs to: " + x.operation()+" Pesos");
    }
    
}
