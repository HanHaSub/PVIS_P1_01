/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formletterwritter;

/**
 *
 * @author acer
 */
public class FormLetterWritter {

   public class FormLetterWritter {
    
   public String displaySalutation(){
       String firstn = "Ortiz";
       return firstn;
   }
   public String displaySalutation2(){
       String firstn = "Ortiz";
       String secondn= "del Carmen";
       return firstn + " " + secondn;
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FormLetterWritter x = new FormLetterWritter();
       System.out.println("Dear: "+ x.displaySalutation());
       System.out.println("Dear: "+x.displaySalutation2());
       System.out.println("Thanks for your shopping");
    
        }
    
    }
    
}
