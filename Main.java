
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Geladeira", 1900);
        Produto produto2 = new Produto("Smartphone", 3200);

        produto1.setQntEmEstoque(2);
        System.out.println(produto1.toString());
        System.out.println("------------------------------------------------------------------");

        Eletronico eletronico = new Eletronico("TV", 2299.0, 18);
        eletronico.setQntEmEstoque(2);
        System.out.println(eletronico.toString());
        System.out.println("-------------------------------------");

        Produto produto3 = new Eletronico("Cama", 1399.99, 12);
        produto3.exibirDetalhes();
    }
}