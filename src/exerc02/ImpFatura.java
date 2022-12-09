package exercico02;

public class ImpFatura {

    private Fatura fatura;

    public ImpFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public void imprimir() {
        System.out.println(fatura.getQuantidade() + "x " + fatura.getLivro().getNome() + " R$ " + fatura.getLivro().getPreco());
        System.out.println("Porcentagem de desconto: " + fatura.getPorcDesconto());
        System.out.println("Procentagem de imposto: " + fatura.getPorcImposto());
        System.out.println("Total: " + fatura.getTotal());
    }

}
