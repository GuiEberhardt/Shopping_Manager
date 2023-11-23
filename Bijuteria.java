public class Bijuteria extends Loja {
    private double metaVendas;

    // Construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, double metaVendas, int i) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    // Método de acesso para metaVendas
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Bijuteria{" +
                "nome='" + super.getNome() + '\'' +
                ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + super.getSalarioBaseFuncionario() +
                ", endereco=" + super.getEndereco().toString() +
                ", dataFundacao=" + super.getDataFundacao().toString() +
                ", metaVendas=" + metaVendas +
                '}';
    }
}
