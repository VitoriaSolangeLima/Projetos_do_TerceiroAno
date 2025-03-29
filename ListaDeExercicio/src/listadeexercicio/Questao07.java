package listadeexercicio;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        int  j = 0, qtd;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quatidade de contatos que deseja inserir na lista telefônica: ");
        qtd = scanner.nextInt();
       
       
        String lista[][] = new String[qtd][2];
        
         while(j < qtd){
           System.out.println("Nome:");
           lista[j][0] = scanner.next();
           System.out.println("telefone:");
           lista[j][1] = scanner.next();
           j++;
        }
        
        
       for( j=0; j < qtd; j++){
            System.out.println("nome: " + lista[j][0] + "   tel: " + lista[j][1]);
        }
        String nome;
        System.out.println("indorme o nome:");
        nome = scanner.next();
     
        for(j = 0; j < qtd; j++){
            if(nome.equalsIgnoreCase(lista[j][0])){
                 System.out.println("nome: " + lista[j][0] + "   tel: " + lista[j][1]); 
               
            }
        }if(qtd == j){
            System.out.println("Nome não encontrado na lista telefôniica");
        }
       
        
    }
 
 
}
