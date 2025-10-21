public class Eletronico extends Produto{
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int garantiaMeses){
        super(nome, preco);
        this.garantiaMeses= garantiaMeses;
    }
    public int getGarantiaMeses(){
        return garantiaMeses;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Meses de garantia: " + garantiaMeses;

    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Meses de garantia: " + garantiaMeses);


    }
}
