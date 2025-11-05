package OrientacaoAoObjeto.Produto;

public class RelatorioDoProduto {
    String nome;
    double preco;
    int quantidade;

    public void exibirRelatorio(){

        System.out.println("Nome = " + nome);
        System.out.println("Preço = " + " R$ " + preco);
        System.out.println("Quantidade = " + quantidade);
        System.out.println("==============================");

    }
}
