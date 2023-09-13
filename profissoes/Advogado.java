public class Advogado extends Pessoa {

    private int oab;

    public Advogado(String nome, String sobrenome, int oab) {
        super(nome, sobrenome);
        this.oab = oab;
    }

    public int getOab() {
        return this.oab;
    }

    public void setOab(int oab) {
        this.oab = oab;
    }

}
