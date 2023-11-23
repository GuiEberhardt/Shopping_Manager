public class Cosmetico extends Loja {
    private double taxaComercializacao;

    // Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, double taxaComercializacao, int i) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Método de acesso para taxaComercializacao
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico{" +
                "nome='" + super.getNome() + '\'' +
                ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + super.getSalarioBaseFuncionario() +
                ", endereco=" + super.getEndereco().toString() +
                ", dataFundacao=" + super.getDataFundacao().toString() +
                ", taxaComercializacao=" + taxaComercializacao +
                '}';
    }
}
