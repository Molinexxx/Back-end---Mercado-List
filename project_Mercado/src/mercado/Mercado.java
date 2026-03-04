package mercado;

import java.util.*;

public class Mercado {

    // Scanner global para entrada do usuário
    static Scanner sc = new Scanner(System.in);

    // Lista de produtos cadastrados
    static ArrayList<Produtos> produtos;

    // Lista de produtos adicionados ao carrinho
    static ArrayList<Produtos> carrinho = new ArrayList<>();

    public static void main(String[] args) {
        // Inicializa a lista de produtos
        produtos = new ArrayList<Produtos>();

        // Chama o menu principal
        Mercado.Menu();
    }

    // Menu principal do sistema
    public static void Menu() {
        while (true) { // Loop infinito até o usuário escolher sair
            System.out.println("=============================");
            System.out.println("========= Bem vindo =========");
            System.out.println("======== Molina Shop ========");
            System.out.println("=============================");

            System.out.println("\nSelecione uma opcao abaixo: ");
            System.out.println("1 - Cadastrar um Produto ");
            System.out.println("2 - Listar Produtos ");
            System.out.println("3 - Comprar Produtos ");
            System.out.println("4 - Visualizar carrinho ");
            System.out.println("5 - Sair do codigo ");

            int opcao = 0;

            // Leitura da opção do usuário, tratando entradas inválidas
            try {
                opcao = Integer.parseInt(Mercado.sc.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número.");
                continue; // Volta para o início do loop
            }

            // Ações de acordo com a opção escolhida
            switch (opcao) {
                case 1:
                    Mercado.cadastrarProduto();
                    break;
                case 2:
                    Mercado.listarProdutos();
                    break;
                case 3:
                    Mercado.comprarProduto();
                    break;
                case 4:
                    Mercado.visualizarCarrinho();
                    break;
                case 5:
                    System.out.println("Volte sempre!");
                    Utilitarios.pausar(2);
                    System.exit(0); // Encerra o programa
                    break;
                default:
                    System.out.println("Opção inválida!");
                    Utilitarios.pausar(2);
                    break;
            }
        }
    }

    // Método para cadastrar produtos
    public static void cadastrarProduto() {
        System.out.println("Cadastrando produto...");

        System.out.print("Digite o nome do produto que deseja cadastrar: ");
        String nome = sc.nextLine();

        double valor;
        try {
            System.out.print("Digite o valor do produto: ");
            valor = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido! Produto não cadastrado.");
            return; // Sai do método sem adicionar produto
        }

        Produtos p = new Produtos(nome, valor);
        produtos.add(p);

        System.out.println("Produto cadastrado com sucesso!");
    }

    // Método para listar todos os produtos cadastrados
    public static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\n=== Produtos Cadastrados ===");
            for (Produtos p : produtos) {
                System.out.println(p);
                System.out.println("------------------");
            }
        }
    }

    // Método para comprar produtos pelo código
    public static void comprarProduto() {
        System.out.print("Digite o código do produto que deseja comprar: ");
        int codigo;

        try {
            codigo = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Código inválido!");
            return; // Sai do método
        }

        boolean encontrado = false;
        for (Produtos p : produtos) {
            if (p.getCodigo() == codigo) {
                carrinho.add(p);
                System.out.println("Produto adicionado ao carrinho!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    // Método para visualizar os produtos no carrinho e calcular total
    public static void visualizarCarrinho() {
        System.out.println("\n==== Carrinho ====");
        double total = 0;

        if (carrinho.isEmpty()) {
            System.out.println("Carrinho vazio!");
        } else {
            for (Produtos p : carrinho) {
                System.out.println(p);
                total += p.getPreco();
                System.out.println("------------------");
            }
            System.out.println("\nTotal: " + Utilitarios.doubleParaString(total));
        }
    }
}