import java.util.Arrays;;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor de Shopping
    public Shopping(String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas]; 
    }

    // Métodos de acesso para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // Método toString para exibir informações do Shopping
    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco.toString() +
                ", quantidadeLojas=" + lojas.length +
                '}';
    }

    // Método para inserir uma loja no array de lojas do shopping
    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true; 
            }
        }
        return false; 
    }

    // Método para remover uma loja do array de lojas do shopping pelo nome
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; 
    }

    // Método para contar a quantidade de lojas de um tipo específico no shopping
    public int quantidadeLojasPorTipo(String tipo) {
        long count = Arrays.stream(lojas)
                .filter(loja -> loja != null && loja.getClass().getSimpleName().equals(tipo))
                .count();

        if (count > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) count;
    }

    // Método para encontrar a loja do tipo Informatica com o maior valor de seguro de eletrônicos
    public Loja lojaSeguroMaisCaro() {
        double maxSeguro = -1;
        Loja lojaSeguroMaisCaro = null;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maxSeguro) {
                    maxSeguro = informatica.getSeguroEletronicos();
                    lojaSeguroMaisCaro = informatica;
                }
            }
        }

        return lojaSeguroMaisCaro;
    }
}
