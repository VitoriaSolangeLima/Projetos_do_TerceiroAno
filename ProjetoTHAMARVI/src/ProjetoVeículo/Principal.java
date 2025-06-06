package ProjetoVeículo;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        // Solicitar dados do carro ao usuário
        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        String cor = JOptionPane.showInputDialog("Digite a cor do carro:");
        String marca = JOptionPane.showInputDialog("Digite a marca do carro:");

        int ano = 0;
        boolean anoValido = false;
        while (!anoValido) {
            try {
                String inputAno = JOptionPane.showInputDialog("Digite o ano do carro (4 dígitos):");

                // Verifica se tem exatamente 4 caracteres e são todos dígitos
                if (inputAno == null || inputAno.length() != 4 || !inputAno.matches("\\d{4}")) {
                    JOptionPane.showMessageDialog(null, "Ano inválido! Deve conter exatamente 4 dígitos.");
                    continue; // Volta para o início do loop
                }

                ano = Integer.parseInt(inputAno);
                int anoAtual = java.time.Year.now().getValue();

                if (ano >= 1886 && ano <= anoAtual) { // 1886 é considerado o primeiro ano do carro moderno
                    anoValido = true;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Ano inválido! Digite um ano entre 1886 e " + anoAtual);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ano inválido! Digite apenas números.");
            }
        }

        // Criar objeto Carro
        Carro carroc = new Carro(modelo, cor, ano, marca);

        int opcao;
        do {
            String menu = carroc.exibirInfo()
                    + "\n\nEscolha uma opção:"
                    + "\n1 - Acelerar (+5 km/h)"
                    + "\n2 - Reduzir velocidade (-5 km/h)"
                    + "\n3 - Frear (velocidade = 0)"
                    + "\n0 - Sair";
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            } catch (NumberFormatException e) {
                opcao = -1; // Opção inválida
            }

            switch (opcao) {
                case 1:
                    carroc.acelera(1);
                    JOptionPane.showMessageDialog(null, "Carro acelerado!");
                    break;
                case 2:
                    carroc.acelera(-1);
                    JOptionPane.showMessageDialog(null, "Velocidade reduzida!");
                    break;
                case 3:
                    carroc.freia();
                    JOptionPane.showMessageDialog(null, "Carro freado completamente!");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa encerrado!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Digite 1, 2, 3 ou 0.");
            }
        } while (opcao != 0);
    }
}
