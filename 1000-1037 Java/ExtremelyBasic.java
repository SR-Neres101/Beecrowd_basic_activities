/*Atividade 1001
  Problem 1001*/

import java.io.IOException;
import java.util.Scanner;

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd
public class ExtremelyBasic {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = A + B;
        System.out.printf("X = %d\n", x);
        sc.close();
    }
}