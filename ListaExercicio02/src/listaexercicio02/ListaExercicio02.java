package listaexercicio02;

import java.util.Scanner;

public class ListaExercicio02 {

    public static void main(String[] args) {
        Carro car = new Carro();
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a cor:");
        car.setCor(s.next());
        System.out.println("Informe o modelo:");
        car.setModelo(s.next());
        System.out.println("Informe a marca:");
        car.setMarca(s.next());
        System.out.println("Informe o ano:");
        car.setAno(s.nextInt());
        int opcao;
        boolean sair = false;
        
         System.out.println("----------- PAINEL DE FUNCIONALIDADES ----------");
        System.out.println("Digite 1 para ACELERAR \nDigite -1 para DESACELERAR \nDigite 5 para FREIA \nDigite 0 para SAIR");
        do{
        opcao = s.nextInt();

        switch (opcao) {
            case 0:
                sair = true;
                break;
            case 1:
                car.acelera(1);
                break;
            case -1:
                car.acelera(-1);
                break;
            case 5: 
                car.freiar();
                break;

        }
            
        } while(!sair);
        

    }

}
