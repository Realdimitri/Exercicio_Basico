//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto1= new Produto("Geladeira",1900);

produto1.setQntEmEstoque(10);

        System.out.println(produto1.toString());

    }
}