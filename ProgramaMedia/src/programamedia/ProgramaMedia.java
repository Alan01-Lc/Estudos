/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author lalan
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.println("Primeira Nota:");
        float n1 = tec.nextFloat();
        System.out.println("Segunda Nota:");
        float n2 = tec.nextFloat();
        float m = (n1+n2) / 2;
        System.out.println("sua media é " + m);
        if (m>9) {
            System.out.println("Parabéns, foi muito bem!");
        } else{
            System.out.println("Que pena, sua nota foi muito pouco!");
        }
    }
    
}
