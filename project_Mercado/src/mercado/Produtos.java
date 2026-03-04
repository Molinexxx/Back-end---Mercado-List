package mercado;
/**
 * Classe que representa um produto no sistema
 *
 * <p>
 * Código original digitado por: Kauã Molina...
 * Comentários e organização adicionados por: ChatGPT
 * </p>
 */
public class Produtos {

    // Contador estático para gerar códigos automáticos
    private static int contador = 1;

    // Atributos do produto
    private int codigo;
    private String nome;
    private double preco;

    // ===========================
    // Construtor
    // ===========================

    /**
     * Construtor que recebe o nome e preço do produto
     * @param nome Nome do produto
     * @param preco Preço do produto
     */
    public Produtos(String nome, double preco) {
        this.codigo = contador++; // Atribui código automático
        this.nome = nome;
        this.preco = preco;
    }

    // ===========================
    // Getters e Setters
    // ===========================

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // ===========================
    // Métodos auxiliares
    // ===========================

    /**
     * Retorna uma String representando o produto, formatada
     */
    @Override
    public String toString() {
        return "codigo: " + getCodigo() +
                "\nNome: " + getNome() +
                "\nPreco: " + Utilitarios.doubleParaString(getPreco());
    }
}