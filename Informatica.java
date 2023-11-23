public class Informatica extends Loja {
    private double seguroEletronicos;

    // Construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, double seguroEletronicos, int i) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Métodos de acesso para seguroEletronicos
    public int getSeguroEletronicos() {
        return (int) seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica{" +
                "nome='" + super.getNome() + '\'' +
                ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + super.getSalarioBaseFuncionario() +
                ", endereco=" + super.getEndereco().toString() +
                ", dataFundacao=" + super.getDataFundacao().toString() +
                ", seguroEletronicos=" + seguroEletronicos +
                '}';
    }
}
