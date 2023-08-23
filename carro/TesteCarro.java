public class TesteCarro {
    public static void main(String[] args){
        Carro carro1 = new Carro("Vermelho","Chevrolet",2004);
        Carro carro2 = new Carro("Azul","Volkswagen", 1999);

        System.out.printf("---Carro 1---\n %s%n",carro1);
        System.out.printf("---Carro 2---\n %s%n",carro2);

        carro1.acelerar(100, 5);
        System.out.printf("---Carro 1---\n %s%n",carro1);

        carro1.acelerar(-20, 5);
        System.out.printf("---Carro 1---\n %s%n",carro1);        
    }
}
