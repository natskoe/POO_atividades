
public class Motorista extends Pessoa{
    

    private int anosCompletos;
    private Carteira carteira;



    public Motorista(String nome, String sobrenome, int anosCompletos, Carteira carteira) {
        super(nome, sobrenome);
        this.anosCompletos = (anosCompletos > 18 && anosCompletos < 100 ? anosCompletos : 0);
        this.carteira = carteira;
    }

    public int getAnosCompletos() {
        return this.anosCompletos;
    }

    public void setAnosCompletos(int anosCompletos) {
        this.anosCompletos = anosCompletos;
    }

    public Carteira getCarteira() {
        return this.carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    @Override
    public String toString() {
        return "\t\tMOTORISTA\n" +
        "Nome completo do motorista: '" + getNome() +" " 
        + getSobrenome() + "'\n" +
        "Idade completa: '" + getAnosCompletos() + "'\n" +
        "Dados carteira:\n--------------------\n" + 
        getCarteira();
    }
}
