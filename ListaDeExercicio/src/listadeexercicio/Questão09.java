package listadeexercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Questão09 {

    public static void main(String[] args) {
        int vet[] = new int[10];
        double media = 0, soma = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite a " + (1 + i) + "° idade:");
            vet[i] = scanner.nextInt();
            soma += vet[i];
        }
        //Calcula a média
        media = soma/vet.length;
        
        //Coloca o vetor em ordem
        Arrays.sort(vet);
        System.out.println("Ordem crescente das idades:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + ", ");
        }
        System.out.println("");
        System.out.println("A pessoa mais velha tem : " + vet[vet.length-1]  + " anos");
        System.out.println("A pessoa mais nova tem : " + vet[0] + " anos");
        System.out.println("A média das idades é de " + media + " anos");
        
        

    }
}
