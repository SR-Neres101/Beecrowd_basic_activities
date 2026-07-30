/*Atividade 1008
  Problem 1008*/

//Troque a classe por Main para aplicar no Beecrowd
//Change the class name to Main to submit to Beecrowd

import java.io.IOException;
import java.util.Scanner;

public class Salary {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int Funcionario = sc.nextInt();
        int Horas = sc.nextInt();
        double Valor = sc.nextDouble();
        double Salario = (double) Horas * Valor;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", Funcionario, Salario);
        sc.close();
    }
 
}