/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estrucdecision;

/**
 *
 * @author hugo.suarez
 */
public class EstrucDecision {
    enum Intensidad{CEGADOR,BRILLANTE,VISIBLE,APAGADO,INVISIBLE}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Intensidad Luna=Intensidad.CEGADOR;

        switch(Luna){
            case CEGADOR:
                System.out.println("Astro moi importante");
                break;
            case BRILLANTE:
                System.out.println("Astro importante");
                break;
            case VISIBLE:
                System.out.println("Astro visible");
        }
    }
    
}
