package listaexercicio02;

public class Carro {
    //Atributos
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private int velocidade;
    
    //Métodos Especiais
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

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    //Métodos 
    public void acelera(int opcao){
        
        if(opcao == 1){
            
          this.velocidade+=5;
           this.setVelocidade(this.velocidade);
            System.out.println("Acelerando...");
            System.out.println("Velocidade atual: " + this.getVelocidade() + "Km/h");
       }else if(opcao== -1){
           this.velocidade-=5;
           this.setVelocidade(this.velocidade);
           System.out.println("Desacelerando...");
           System.out.println("Velocidade atual: " + this.getVelocidade() + "Km/h");
       }      
    }
    public void freiar(){
        this.velocidade = 0;
        System.out.println("Carro parado");
        System.out.println("Velocidade atual: " + this.getVelocidade() + "Km/h");
        
    }

    
        
}

