package listadeexercicio;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //Primeiro intervalo de tempo
    System.out.println("Informe o primeiro intervalo de tempo");
    System.out.println("Horas:");
    int h1 = scanner.nextInt();
    System.out.println("Minutos:");
    int m1 = scanner.nextInt();
    System.out.println("Segundos:");
    int s1 = scanner.nextInt();
    
    //Segundo intervalo de tempo
    System.out.println("Informe o segundo intervalo de tempo");
    System.out.println("Horas:");
    int h2 = scanner.nextInt();
    System.out.println("Minutos:");
    int m2 = scanner.nextInt();
    System.out.println("Segundos:");
    int s2 = scanner.nextInt();
    
    // Soma entre os intervalos de tempo
    int somaS = s1 + s2;
    int somaM = m1 + m2; 
    int somaH = h1 + h2;
    
    somaM += somaS/60; 
    somaS %= 60;
    somaH += somaM/60;
    somaM %= 60;
    
    //Subtração ente os intervalos de tempo
    //Primeiro, converte tudo para segundos para evitar problemas com subtração direta
            int totalS1 = h1 * 3600 + m1 * 60 + s1;
            int totalS2 = h2 * 3600 + m2 * 60 + s2;
            int difSegundos = Math.abs(totalS1 - totalS2);
            //Convertendo a diferença de segundos de volta para horas, minutos e segundos
            int dh = difSegundos / 3600; 
            difSegundos %= 3600; //Resto da divisão (minutos e segundos)
            int dm = difSegundos / 60;   
            int ds = difSegundos % 60;
            
        System.out.println("Soma dos intervalos de tempo é de " + somaH + ":" + somaM + ":" + somaS);         
        System.out.println("A diferença entre os intervalos de tempo é de " + dh + ":" + dm + ":" + ds);
    
   
    
    }
   
}
