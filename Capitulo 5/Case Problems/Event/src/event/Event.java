/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Event {

    /**
     * @param args the command line arguments
     */
    private Integer invitados;
    public void setInvitados(Integer e) {
        invitados = e;
    }
    public Integer getInvitados() {
        return invitados;
    }
    public Integer operacion() {
        Integer resul = invitados*35;
        return resul;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Event x=new Event();
        System.out.println("    ****************************************************");
        System.out.println("    * \t¡Carly’s makes the food that makes it a party! *");
        System.out.println("    ****************************************************");
        System.out.println("Enter the number of guests: ");
        x.setInvitados(entrada.nextInt());
        if (x.getInvitados()>=50){
            System.out.println("¡¡¡Big PArty!!!");
            System.out.println("The Price is: " + x.operacion()+" Pesos");
        }else{
            System.out.println("¡¡¡Small Party!!!");
            System.out.println("The Price is: " + x.operacion()+" Pesos");
        }
    }
}
