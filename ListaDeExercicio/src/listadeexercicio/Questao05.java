package listadeexercicio;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        double salario[] =  new double[5];
        float reajuste = 0;
        
        for(int i = 0; i < salario.length; i++){
            System.out.println("Informe o salário " + (1+i));
            salario[i] = scanner.nextDouble();
        }
        
        System.out.println("Informe o valor do reajuste (em porcentagem):");
        reajuste = scanner.nextFloat();
        
        for(int i = 0; i < salario.length; i++){
            salario[i] = salario[1] * (1 + reajuste/100);
            System.out.printf("Salário %d reajustado: R$ %.2f\n", (i+1), salario[i]);
        }
    }
}
