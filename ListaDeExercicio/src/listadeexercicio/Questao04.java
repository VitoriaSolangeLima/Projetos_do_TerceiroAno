package listadeexercicio;

import java.util.Scanner;

public class Questao04 {
 
    public static int contDigitos(int n) {
        int c = 0;
        while (n != 0) {
            if (n == 0) {
                return 1;
            } else {
                n = n / 10;
                c++;
            }

        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        int a = 0;
        while (num < 0) {
            System.out.println("Informe um número: ");
            num = scanner.nextInt();
            a = contDigitos(num);
        }
        System.out.println("O número " + num + " tem " + a + "digitos");
    }
  
}
