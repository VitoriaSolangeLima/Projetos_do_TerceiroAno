package listadeexercicio;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        String aluno;
        float notas = 0;
        float media;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        aluno = teclado.nextLine();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Insira a nota da prova " + i + ":");
            notas += teclado.nextFloat();
        }
        media = notas / 3;

        System.out.println("A média do aluno " + aluno + " é " + media);

        if (media >= 7.0) {
            System.out.println("O aluno " + aluno + " foi aprovado");
        } else {
            System.out.println("O aluno " + aluno + " foi reprovado");
            System.out.println("Insira a nota de recuperação");
            float rec = teclado.nextFloat();
            float notaf = (media + rec) / 2;

            if (notaf >= 5.0) {
                System.out.println("O aluno " + aluno + " foi aprovado após recuperação");
            } else {
                System.out.println("O aluno " + aluno + " foi reprovado após recuperação");
            }
        }

    }

}
