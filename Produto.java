import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private double preco;
    private int qntEmEstoque;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        qntEmEstoque = 0;
    }

    public double getPreco() {
        return preco;
    }

    public int getQntEmEstoque() {
        return qntEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setQntEmEstoque(int qntEmEstoque1) {
        while (qntEmEstoque1 < 0) {
            System.out.println("Digite uma quantidade válida!");
            qntEmEstoque1 = sc.nextInt();
        }
        this.qntEmEstoque = qntEmEstoque1;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\n" +
                "preco: $" + String.format("%.2f\n",preco) +
                "Quantidade em estoque: " + qntEmEstoque;

    }
    public void exibirDetalhes(){
        System.out.printf("nome: %s\n" , nome);
        System.out.println("preco: " + preco);

    }
}
