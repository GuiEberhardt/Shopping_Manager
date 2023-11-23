import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Criando uma loja...");
                    System.out.print("Digite o nome da loja: ");
                    String nomeLoja = scanner.nextLine();
                    System.out.print("Digite a quantidade de funcionários: ");
                    int quantidadeFuncionarios = scanner.nextInt();
                    scanner.nextLine(); 

                    loja = new Loja(nomeLoja, quantidadeFuncionarios, quantidadeFuncionarios);
                    System.out.println("Loja criada: " + loja.toString());
                    break;

                case 2:
                    System.out.println("Criando um produto...");
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer

                    
                    produto = new Produto(nomeProduto, precoProduto, new Data(1, 1, 2023));
                    System.out.println("Produto criado: " + produto.toString());

                    Data dataValidacao = new Data(20, 10, 2023);
                    if (produto.estaVencido(dataValidacao)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        // Imprime as informações da loja criada
        if (loja != null) {
            System.out.println("\nInformações da Loja:");
            System.out.println(loja.toString());
        }

        scanner.close();
    }
}
