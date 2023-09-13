package loteria;

/*
 * Loteria.java
 *
 * Classe que executa o programa e verifica o vencedor.
 */

public class Loteria {
    private static final int QTDE_DEZENAS = 6;
    private static final int MENOR_DEZENA = 1;
    private static final int MAIOR_DEZENA = 60;

    public static void main(String[] args) {

        int apostas[];

        Jogador jogador = new Jogador();
        Sorteio sorteio = new Sorteio();

        jogador.apostar(QTDE_DEZENAS, MENOR_DEZENA, MAIOR_DEZENA);
        apostas = jogador.getAposta();

        for(int i = 0; i < QTDE_DEZENAS; i++){
            int numAposta = apostas[i];
            for(int a = 0; i < QTDE_DEZENAS; i ++){
                
            }
        }

        

        //sorteio.sortear(QTDE_DEZENAS, MENOR_DEZENA, MAIOR_DEZENA);

	// Implemente este método
    } // fim do método main
    
} // fim da classe Loteria
