package estatistica;
public class Estatistica {
    public static int min(int... valores) {
    int min = Integer.MAX_VALUE;
    for (int valor : valores) {
        min = (valor < min ? valor : min);
        System.out.println("a");
    }
    return min;
    }

    public static double min(double... valores) {
    double min = Double.MAX_VALUE;
    for (double valor: valores) {
        min = (valor < min ? valor : min);
        System.out.println("b");
    }
    return min;
    }
} // fim da classe Estatistica {
    

