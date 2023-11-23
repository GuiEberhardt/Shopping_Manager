public class Alimentacao extends Loja {
    private Data dataAlvara;

    // Construtor
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, Data dataAlvara, int i) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    // Método de acesso para dataAlvara
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentacao{" +
                "nome='" + super.getNome() + '\'' +
                ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + super.getSalarioBaseFuncionario() +
                ", endereco=" + super.getEndereco().toString() +
                ", dataFundacao=" + super.getDataFundacao().toString() +
                ", dataAlvara=" + dataAlvara.toString() +
                '}';
    }
}
