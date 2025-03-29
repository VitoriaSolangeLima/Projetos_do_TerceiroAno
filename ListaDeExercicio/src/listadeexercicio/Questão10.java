package listadeexercicio;

import java.util.Scanner;

/*5 a 7 anos Infantil A
8 a 10 anos Infantil B
11-13 anos Juvenil A
14-17 anos Juvenil B
Maiores de 18 anos (inclusive) Adulto*/
public class Questão10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        System.out.println("Insira a sua idade: ");
        idade = scanner.nextInt();
        categoriaNadador(idade);
    }

    private static void categoriaNadador(int idade) {
        if (idade < 5) {
            System.out.println("Idade Invalida!");
        } else if (idade <= 7) {
            System.out.println("Categoria Infantil A");
        } else if(idade <= 10) {
                System.out.println("Categoria Infantil B");
        }else if (idade <= 13) {
                System.out.println("Categoria Juvenil A");
        }else if (idade <= 17) {
                System.out.println("Categoria Juvenil B");
       }else{
                System.out.println("Categoria Adulto");
        }
    }
}