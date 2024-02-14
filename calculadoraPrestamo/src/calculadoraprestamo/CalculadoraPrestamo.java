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
        double cost, tipo, limit, monthlyShare, totalCost, distribution;
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

        totalCost = cost * tipo;
        distribution = 1 - Math.pow(1 + tipo, -period);
        monthlyShare = totalCost / distribution;
        System.out.println(monthlyShare);
        if (monthlyShare > limit) {
            System.out.println("La cuantía mensal excede el límite mensual: " + monthlyShare);
            System.out.println("Procederemos a calcular el número de meses , teniendo como couta el límite impuesto");

            double limitA = Math.log(1 - (cost * tipo / limit));
            double limitB = Math.log(1 + tipo);

            double yearsShare = -limitA / limitB;

            System.out.println("Para devolver la iintegridad del prestamo más los intereses, necesitará: " + yearsShare  + " meses");

        } else {
            System.out.println("La cuantía mensual a pagar por el préstamos es de: " + monthlyShare);
            System.out.println("La cuantía mensual a pagar por el préstamos es de: " + monthlyShare);
            System.out.println("La cuantía mensual a pagar por el préstamos es de: " + monthlyShare);
            System.out.println("La cuantía mensual a pagar por el préstamos es de: " + monthlyShare);

            
            
        }

    }

}
