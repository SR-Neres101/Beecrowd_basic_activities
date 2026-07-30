/*Atividade 1013
  Problem 1013*/

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd

import java.util.Scanner;
import java.io.IOException;

public class TheGreatest {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int mab = (A + B + Math.abs(A - B)) / 2;
        int mabc = (C + mab + Math.abs(mab - C)) / 2;
        System.out.printf("%d eh o maior\n", mabc);
        sc.close();
    }
 
}
