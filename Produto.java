import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int preco;
    private int qntEmEstoque;

    public Produto( String nome, int preco){
        this.nome=nome;
        this.preco=preco;
        qntEmEstoque=0;
    }

    public int getPreco() {
        return preco;
    }

    public int getQntEmEstoque() {
        return qntEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setQntEmEstoque(int qntEmEstoque1) {
        while (qntEmEstoque1<=0){
            System.out.println("Digite uma quantidade maior que 0!");
             qntEmEstoque1=sc.nextInt();
        }
        this.qntEmEstoque = qntEmEstoque1;
    }

    @Override
    public String toString() {
       return  "nome: " + nome + "\n" +
        "preco: " + preco  + "\n" +
        "Quantidade em estoque: " + qntEmEstoque;

    }
}
