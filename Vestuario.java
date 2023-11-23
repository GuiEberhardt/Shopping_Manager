public class Vestuario extends Loja {
    private boolean produtosImportados;

    // Construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, boolean produtosImportados, int i) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    // Método de acesso para produtosImportados
    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Vestuario{" +
                "nome='" + super.getNome() + '\'' +
                ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + super.getSalarioBaseFuncionario() +
                ", endereco=" + super.getEndereco().toString() +
                ", dataFundacao=" + super.getDataFundacao().toString() +
                ", produtosImportados=" + produtosImportados +
                '}';
    }

    public boolean getProdutosImportados() {
        return false;
    }
}
