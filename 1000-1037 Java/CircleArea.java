/*Atividade 1002
  Problem 1002*/

import java.io.IOException;
import java.util.Scanner;

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd
public class CircleArea {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.pow(r, 2) * 3.14159;
        System.out.printf("A=%.4f\n", area);
        sc.close();
    }
 
}