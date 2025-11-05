package OrientacaoAoObjeto.Livro;

public class ResumoLivro {
    String titulo;
    String autor;
    int paginas;


     void exibirDadosLivro(){
        System.out.printf("\"%s\" de %s com %d páginas%n\"",titulo,autor,paginas);
    }
}
