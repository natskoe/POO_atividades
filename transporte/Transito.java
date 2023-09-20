package transporte;

public class Transito {
    public static void main(String[] args) {
        Carro sandero = new Carro(4, "SUV", "Renault", "ABC1234", "Prata");
        sandero.acelerar();
        System.out.println(sandero);

        Carro uno = new Carro(2, "quadrado", "Fiat", "DEF5678", "Branco");
        uno.acelerar();
        System.out.println(uno);

        Moto harley = new Moto("harley","duas rodona","GHI9012","Preta");
        harley.acelerar();
        System.out.println(harley);

        Moto yamaha = new Moto("yamaha","duas roda","JKL3456","Vermelha");
        yamaha.acelerar();
        System.out.println(yamaha);
    }
}
