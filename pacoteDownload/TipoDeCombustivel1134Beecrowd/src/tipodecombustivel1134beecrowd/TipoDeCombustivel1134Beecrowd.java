/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipodecombustivel1134beecrowd;

import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class TipoDeCombustivel1134Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int comb = 0;
        int A = 0;
        int G = 0;
        int D = 0;
        
        do {
            comb = teclado.nextInt();
            if (comb > 4) {
                comb = teclado.nextInt();
            }
            if (comb == 1) {
                A++;
            }
            if (comb == 2) {
                G++;
            }
            if (comb == 3) {
                D++;
            }
            
        } while (comb != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + A);
        System.out.println("Gasolina: " + G); 
        System.out.println("Diesel: " + D);
    }
    
}
