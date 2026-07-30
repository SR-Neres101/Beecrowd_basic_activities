/*Atividade 1010
  Problem 1010*/

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd

import java.io.IOException;
import java.util.Scanner;

public class SimpleCalculation {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int Cod1 = sc.nextInt();
        int Qnt1 = sc.nextInt();
        double Val1 = sc.nextDouble();
        int Cod2 = sc.nextInt();
        int Qnt2 = sc.nextInt();
        double Val2 = sc.nextDouble();
        double Total = (double) Val1 * Qnt1 + Val2 * Qnt2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", Total);
        sc.close();
    }
 
}