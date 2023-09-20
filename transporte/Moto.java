package transporte;

public class Moto extends TransportePrivado {
    
    public Moto(String marca, String modelo, String placa, String cor) {
        super(marca, modelo, placa, cor);
    } 

    public String acelerar(){
        System.out.println("----------------------------------");
        String acelerar = String.format("A motocicleta está acelerando à 30km/h...");
        System.out.println(acelerar);
        return acelerar;
    }  
    
    public String toString() {
        return "----------------------------------\n"+
            "Marca da moto: '" + getMarca() + "'\n" +
            "Modelo da moto: '" + getModelo() + "'\n" +
            "Placa da moto: '" + getPlaca() + "'\n" +
            "Cor da moto: '" + getCor() + "'";
    }    
}


