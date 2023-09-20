package transporte;

public class Onibus extends Transporte {
    
    private String empresa;
    private int numAssentos;


    public Onibus(String marca, String placa) {
        super(marca, placa);
        this.empresa = empresa;
        this.numAssentos = numAssentos;
    }

    public String acelerar(){
        String acelerar = String.format("O ônibus está acelerando 10km/h...");
        return acelerar;
    }
}
