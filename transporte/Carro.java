package transporte;

public class Carro extends TransportePrivado {

    int quantidadePortas;

    public Carro(int quantidadePortas, String modelo, String marca, String placa, String cor) {
        super(modelo, marca, placa, cor);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas(){
        return this.quantidadePortas;
    }

    public String acelerar(){
        System.out.println("----------------------------------");
        String acelerar = String.format("O carro está acelerando 20km/h...");
        System.out.println(acelerar);
        return acelerar;
    }
    //a.equals(b)
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o==null){
            return false;
        }
        if(o.getClass().equals(Carro.class)){
            Carro outro = (Carro) o;
            if(getPlaca().equals(outro.getPlaca()))
            return true;
        }

        return false;
    }


    public String toString() {
        return "----------------------------------\n"+
            "Marca do carro: '" + getMarca() + "'\n" +
            "Modelo do carro: '" + getModelo() + "'\n" +
            "Placa do carro: '" + getPlaca() + "'\n" +
            "Cor do carro: '" + getCor() + "'\n" +
            "Quantidade de portas: '" + getQuantidadePortas() + "'";
    }

}
