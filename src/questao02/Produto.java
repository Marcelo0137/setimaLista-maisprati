package questao02;

class DescontoInvalidoExeception extends IllegalArgumentException {
    public DescontoInvalidoExeception(String message) {
        super(message);
    }
}

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    public void printDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }

    public void aplicarDesconto(double porcentagem) {
        if(porcentagem < 0 || porcentagem > 50) {
            throw new DescontoInvalidoExeception("A porcentagem do desconto é inválida!");
        }

        double valorDesconto = preco * (porcentagem / 100);
        this.preco -= valorDesconto;
    }

    public static void main(String[] args) {
        try {
            Produto produto = new Produto("Macbook air m3", 6000);
            System.out.println("Antes do desconto: ");
            produto.printDados();

            produto.aplicarDesconto(50);
            System.out.println("Quantidade do desconto:  ");
            produto.printDados();
        } catch (DescontoInvalidoExeception e ) {
            System.out.println(e.getMessage());
        }
    }
}
