/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbyfive;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class CountByFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner( System.in ); 
    int val =5; 
    final int LIMIT = 200; 

    for(int count =1; val <= LIMIT; count++) 
            { 
    System.out.println(val); 
        if(val % 50== 0) 
        System.out.println("\n"); 

        val+=5; 
            } 
    }//main 
}//class
    

