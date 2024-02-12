/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraprestamo;

import java.util.Scanner;

/**
 *
 * @author hugo.suarez
 */
public class CalculadoraPrestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double cost, tipo, limit;
        int period;

        System.out.print("Introdude importe do prestamos: ");
        cost = scanner.nextDouble();
        System.out.print("Introduce el tipo de interes: ");
        tipo = scanner.nextDouble();
        System.out.print("Introduce el perido en años para amortizar el prestamos: ");

        period = scanner.nextInt();
        System.out.print("Introduce el limite de las cuotas: ");
        limit = scanner.nextDouble();
        /*Pasar a meses os anos do periodo de amortización*/
        period *= 12;

        /*
        tipo de interese mensual
         */
        tipo /= 1200;
    



    }

}
