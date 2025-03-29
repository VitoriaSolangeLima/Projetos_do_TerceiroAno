package listadeexercicio;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {
        float num[] = new float[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (1 + i) + "° número:");
            num[i] = scanner.nextFloat();
        }

        System.out.println("Invertendo a ordem.....");

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }

}
