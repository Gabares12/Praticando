package OrientacaoAoObjeto.Livro;

public class MainLivro {
    public static void main(String[] args) {

        ResumoLivro livro = new ResumoLivro();
        ResumoLivro livro1 = new ResumoLivro();

        livro.autor = "joao";
        livro.titulo = "joao e o pé de feijao";
        livro.paginas = 100;

        livro1.autor = "obama";
        livro1.titulo = "obama e os EUA";
        livro1.paginas = 350;

        livro.exibirDadosLivro();
        livro1.exibirDadosLivro();



    }
}
