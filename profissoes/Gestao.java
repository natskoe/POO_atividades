
public class Gestao {
    public static void main(String[] args) {
        Carteira cnh = new Carteira("B","27/02/2004", 22, "Brasil", 1234 );
        Motorista motorista = new Motorista("Julio", "Silva", 22,cnh);
        
        System.out.println(motorista);
    }   
}
