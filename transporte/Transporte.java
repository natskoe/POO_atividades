package transporte;

public class Transporte {
    
    private String marca;
    private String placa;
    

    public Transporte(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
    } 

    public String getMarca() {
        return this.marca;
    }

    public String getPlaca(){
        return this.placa;
    }

}
