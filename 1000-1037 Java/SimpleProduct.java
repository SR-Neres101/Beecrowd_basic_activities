/*Atividade 1004
  Problem 1004*/

import java.io.IOException;
import java.util.Scanner;

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd
public class SimpleProduct {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int PROD = A * B;
        System.out.printf("PROD = %d\n", PROD);
        sc.close();
    }
}