package ProjetoVeículo;

public class Carro {
    
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private int velocidade;
    
    public Carro(String modelo, String cor, int ano, String marca) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.velocidade = 0;
    }
    
    // Getters e Setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
  
    
    public void acelera(int comando) {
        if (comando == 1) {
            this.velocidade += 5;
        } else if (comando == -1) {
            this.velocidade = Math.max(0, this.velocidade - 5);
        }
    }
    
    public void freia() {
        this.velocidade = 0;
    }
    
    public String exibirInfo() {
    return 
    "Carro: " + marca + " " + modelo + "\nAno: " + ano + "\nCor: " + cor + "\nVelocidade atual: " + velocidade + " km/h";
    }
}
