package transporte;

public class TransportePrivado extends Transporte {
    
    private String cor;
    private String modelo;

    public TransportePrivado(String cor, String modelo, String marca, String placa) {
        super(marca, placa);
        this.cor = cor;
        this.modelo = modelo;
    } 
    
    public String getCor(){
        return this.cor;
    }

    public String getModelo() {
        return this.modelo;
    }    
}
