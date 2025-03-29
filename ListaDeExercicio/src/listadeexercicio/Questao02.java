package listadeexercicio;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        int qtdLivro;
        float A, B;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Iforme a quantidade de livros que deseja compra:");
        qtdLivro = scanner.nextInt();
        
        A = (0.25f * qtdLivro)+ 7.50f;
        B = (0.50f * qtdLivro)+ 2.50f;
        
       if(A>B){
           System.out.println("O desconto B é a melhor opção");
       }else if(B>A){
           System.out.println("O desconto A é a melhor opção");
       }else{
           System.out.println("As duas opções de desconto tem o mesmo valor");
       }
    }
}
