package Q2;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Carne");
        produto1.setPreco(100);

        Produto produto2 = new Produto();
        produto2.setNome("Agua");
        produto2.setPreco(4);

        Produto produto3 = new Produto();
        produto3.setNome("Bala");
        produto3.setPreco(0.25);

        produto1.repor(10);
        produto2.repor(20);
        produto3.repor(100);

        System.out.println("Nome : " + produto1.getNome() + ", Preço: " + produto1.getPreco() + ", Quantidade em estoque: " + produto1.getEstoque());
        System.out.println("Nome : " + produto2.getNome() + ", Preço: " + produto2.getPreco() + ", Quantidade em estoque: " + produto2.getEstoque());
        System.out.println("Nome : " + produto3.getNome() + ", Preço: " + produto3.getPreco() + ", Quantidade em estoque: " + produto3.getEstoque());

        System.out.println("----------------------------------------------------------------------------------");

        produto1.vender(1);
        produto2.vender(5);
        produto3.vender(50);

        System.out.println("Nome : " + produto1.getNome() + ", Preço: " + produto1.getPreco() + ", Quantidade em estoque: " + produto1.getEstoque());
        System.out.println("Nome : " + produto2.getNome() + ", Preço: " + produto2.getPreco() + ", Quantidade em estoque: " + produto2.getEstoque());
        System.out.println("Nome : " + produto3.getNome() + ", Preço: " + produto3.getPreco() + ", Quantidade em estoque: " + produto3.getEstoque());

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Teste de erros: ");
        produto1.vender(10);
        produto2.setPreco(-20);
        produto3.repor(-5);

    }
}
