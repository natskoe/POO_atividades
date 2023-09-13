
public class Carteira {
    
    private String tipo;
    private String dataCriacao;
    private int idadeMotorista;
    private String paisNascimento;
    private int registro;


    public Carteira(String tipo, String dataCriacao, int idadeMotorista, String paisNascimento, int registro) {
        this.tipo = tipo;
        this.dataCriacao = dataCriacao;
        this.idadeMotorista = idadeMotorista;
        this.paisNascimento = paisNascimento;
        this.registro = registro;
    }


    public String getTipo() {
        return this.tipo;
    }

    public String getDataCriacao() {
        return this.dataCriacao;
    }

    public int getIdadeMotorista() {
        return this.idadeMotorista;
    }

    public String getPaisNascimento() {
        return this.paisNascimento;
    }

    public int getRegistro() {
        return this.registro;
    }

    @Override
    public String toString() {
        return "Tipo de CNH: '" + getTipo() + "'\n" +
            "Data de criação CNH: '" + getDataCriacao() + "'\n" +
            "Idade do motorista: '" + getIdadeMotorista() + "'\n" +
            "País de nascimento: " + getPaisNascimento() + "'\n" +
            "Registro CNH: '" + getRegistro() + "'";
    }





}
