package OrientacaoAoObjeto.Produto;

public class MainProduto {
    public static void main(String[] args) {

        RelatorioDoProduto produto = new RelatorioDoProduto();
        RelatorioDoProduto produto1 = new RelatorioDoProduto();
        RelatorioDoProduto produto2 = new RelatorioDoProduto();

        produto.nome = "Teclado";
        produto.preco = 120.00;
        produto.quantidade = 1;
        produto1.nome = "Mouse";
        produto1.preco = 60.00;
        produto1.quantidade = 2;
        produto2.nome = "Monitor";
        produto2.preco = 950.00;
        produto2.quantidade= 1;

        produto.exibirRelatorio();
        produto1.exibirRelatorio();
        produto2.exibirRelatorio();




    }
}
