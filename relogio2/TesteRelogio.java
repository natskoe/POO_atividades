public class TesteRelogio {
    public static void main(String[] args) {
		Relogio relogio1 = new Relogio(17,23,45);
		Relogio relogio2 = new Relogio(18,46,35);

		System.out.printf("Relógio 1: %s%n", relogio1);
		System.out.printf("Relógio 2: %s%n", relogio2);

		relogio1.setHora(13);
		relogio1.setMinuto(27);
		relogio1.setSegundo(6);

		System.out.printf("%nRelógio 1 alterado para: %s%n", relogio1);
		System.out.printf("Relógio 2 alterado para: %s%n", relogio2);

		relogio2.setHora(23);
		relogio2.setMinuto(14);
		relogio2.setSegundo(0);
		
		System.out.printf("%nRelógio 1 alterado para: %s%n", relogio1);
		System.out.printf("Relógio 2 alterado para: %s%n", relogio2);

    }
}