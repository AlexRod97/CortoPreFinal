/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortofinal;
import cortofinal.Cifrado; 
import java.util.Scanner;
/**
 *
 * @author Alexander Rodríguez 1053016
 */
public class CortoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cifrado cesar = new Cifrado(); 
        String frase; 
        int distancia; 
        
        System.out.println("Ingrese la frase"); 
        frase = sc.nextLine(); 
        System.out.println("Ingrese la distancia");
        distancia = sc.nextInt(); 
        
        System.out.println(cesar.cifrar(frase, distancia)); 
        
        
    }
    
}
