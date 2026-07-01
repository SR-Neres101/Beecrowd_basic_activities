/*Atividade 1003
  Problem 1003*/

import java.io.IOException;
import java.util.Scanner;

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd
public class SimpleSum {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int S = A + B;
        System.out.printf("SOMA = %d\n", S);
        sc.close();
    }
 
}