/*Atividade 1009
  Problem 1009*/

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd

import java.io.IOException;
import java.util.Scanner;

public class SalaryWBonus {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String Nome = sc.nextLine();
        double Salario = sc.nextDouble();
        double Vendas = sc.nextDouble();
        double Total = Salario + (Vendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", Total);
        sc.close();
    }
 
}