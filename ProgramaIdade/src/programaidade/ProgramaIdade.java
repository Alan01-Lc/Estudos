/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;
import java.util.Scanner;
/**
 *
 * @author lalan
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner t = new Scanner(System.in);
        System.out.println("Digite o ano em que nasceu: ");
      int nasc = t.nextInt();
      int idade = 2025 - nasc;
        System.out.println("Sua idade é " + idade);
      if (idade>=18) {
          System.out.println("Maior de idade");  
      } else{  
          System.out.println("Menor de idade");
      }
    }
    
}
