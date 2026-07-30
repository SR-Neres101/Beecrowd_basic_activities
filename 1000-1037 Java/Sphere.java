/*Atividade 1011
  Problem 1011*/

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd

import java.io.IOException;
import java.util.Scanner;
 
public class Sphere {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double R = Math.pow(sc.nextDouble(), 3);
        double vol = (4/3.0) * R * 3.14159;
        System.out.printf("VOLUME = %.3f\n", vol);
        sc.close();
    }
 
}