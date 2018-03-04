/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Insurance {
    
    private Integer age;
    public void setAge(Integer a) {
        age = a;
    }
    public Integer getAge() {
        return age;
    }
    
    public Integer operation() {
        Integer result = ((Math.abs(age/10)+15)*20);
        return result;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Insurance x=new Insurance();
        System.out.println("Enter the age of the worker: ");
        x.setAge(entrada.nextInt());
        System.out.println("The mount belongs of: " + x.operation()+" Pesos556");
    }
    
}
