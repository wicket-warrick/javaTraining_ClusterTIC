/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showparam;

/**
 *
 * @author hugo.suarez
 */
public class ShowParam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length > 1) {
            if (args[0].length ()> args[1].length()) {
                System.out.println("La palabra " + args[0] + " tiene más letras que " + args[1]);
            } else {
                System.out.println(args[1] + " tiene más letras que " + args[0]);
            }
        } else {
            System.out.println("no hay elementos para mostras");
        }
    }
}
