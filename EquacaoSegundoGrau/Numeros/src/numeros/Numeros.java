/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author lalan
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número : ");
            n = teclado.nextInt();
            s += n;
            System.out.println("(Quer continuar? {s/n} ");
            resp = teclado.next();
        }while (resp.equals("s"));
        System.out.println("A soma de todos os valores é " + s);
    }
    
}
