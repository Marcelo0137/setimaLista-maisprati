package questao01;

public class Produto {
    private String nome;
    private double preco;
    private int quant;

    public Produto(String nome, double preco, int quant) {
        setNome(nome);
        setPreco(preco);
        setQuant(quant);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio!");
        }

        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior ou igual a zero!");
        }
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        if( quant <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero!");
        }
        this.quant = quant;
    }

    public void printDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quant);
    }

    public static void main(String [] args) {
        try {
            Produto produto = new Produto("Macbook air m3", 6.000, 1);
            produto.printDados();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

        try {
            Produto produtoInvalido = new Produto("", 50, 1);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Produto produInvalido = new Produto("Camisa", -10, 1);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Produto protudoInvalido = new Produto("Livro", 20, 0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
