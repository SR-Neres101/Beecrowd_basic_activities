/*Atividade 1012
  Problem 1012*/

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd

import java.io.IOException;
import java.util.Scanner;

public class Area {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double tri = (A * C) / 2;
        double cir = (Math.pow(C, 2)) * 3.14159;
        double tra = ((A + B) * C) / 2;
        double qua = Math.pow(B, 2);
        double ret = A * B;
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\n", tri, cir, tra);
        System.out.printf("QUADRADO: %.3f\nRETANGULO: %.3f\n", qua, ret);
        sc.close();
    }
 
}