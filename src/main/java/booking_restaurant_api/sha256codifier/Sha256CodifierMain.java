/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking_restaurant_api.sha256codifier;

import booking_restaurant_api.sha256codifier.Codifier.Codifier;
import java.util.Scanner;

/**
 *
 * @author Iván
 */
public class Sha256CodifierMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String pass;
        System.out.println("ingrese la contraseña");
        pass = entrada.next();
        Codifier codifier = new Codifier();
        System.out.println("La codificación es: " + codifier.conversorSha(pass).toUpperCase());
    }
    
}
