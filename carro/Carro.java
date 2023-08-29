import java.util.Scanner;
// Criar dois carros, acelerar os dois e descobrir a velocidade deles.
public class Carro {

    private String cor;
    private String marca;
    private double velocidade;
    private int ano; 
    Scanner s = new Scanner(System.in);

    public Carro(String cor, String marca, int ano){
        this.velocidade = 0;
        setCor(cor);
        setMarca(marca);
        setAno(ano);
    }

    public void acelerar(double aceleracao, int tempo){
        double velocidadeCarro = getVelocidade() + (aceleracao*tempo);
        this.velocidade = velocidadeCarro;  
    }

    public void setCor(String cor){
        this.cor = cor.toLowerCase();
    }

    public String getCor(){
        return this.cor;
    }

    public void setMarca(String marca){
        this.marca = marca.toLowerCase();
    }

    public String getMarca(){
        return this.marca;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

    public double getVelocidade(){
        return this.velocidade;
    }

    public String toString() {
        return String.format("Cor: %s\nMarca: %s\nAno: %d\nVelocidade: %.2fm/s",
                                    getCor(),
                                    getMarca(),
                                    getAno(),
                                    getVelocidade());
    }
    
}
