public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    // Construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario2, Endereco endereco2, Data dataFundacao2) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario2;
        this.endereco = endereco2;
        this.dataFundacao = dataFundacao2;
    }

    public Loja(String nome, int quantidadeFuncionarios, int i) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = new Endereco("", "", "", "", "", "", "");
        this.dataFundacao = new Data(1, 1, 2000);
    }

    // Construtor que recebe quantidade máxima de produtos como parâmetro
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoqueProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoqueProdutos];
    }

    public Loja(String nome2, int quantidadeFuncionarios2, Endereco e1, Data d1, int i) {
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder estoque = new StringBuilder();
        if (estoqueProdutos != null) {
            for (Produto produto : estoqueProdutos) {
                if (produto != null) {
                    estoque.append(produto.toString()).append("\n");
                }
            }
        }

        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco.toString() +
                ", dataFundacao=" + dataFundacao.toString() +
                ", estoqueProdutos:\n" + estoque.toString() +
                '}';
    }

    // Método gastosComSalario
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }

    // Método tamanhoDaLoja
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    // Método para imprimir informações de todos os produtos da loja
    public void imprimeProdutos() {
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto.toString());
            }
        }
    }

    // Método para inserir um produto no estoque da loja
    public boolean insereProduto(Produto novoProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = novoProduto;
                return true;
            }
        }
        return false;
    }

    // Método para remover um produto do estoque da loja pelo nome
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    public int getSeguroEletronicos() {
        return 0;
    }
}
