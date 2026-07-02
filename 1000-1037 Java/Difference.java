/*Atividade 1007
  Problem 1007 */

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd

import java.io.IOException;
import java.util.Scanner;

public class Difference {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int DIF = (A * B - C * D);
        System.out.printf("DIFERENCA = %d\n", DIF);
        sc.close();
    }
 
}