package VariaveisETipos;

import java.util.Locale;

public class CadastroDeLivros {
    public static void main(String[] args) {

        String titulo = "O Pequeno Príncipe";
        String autor = "de Antoine de Saint-Exupéry";
        int numeroPaginas = 96;
        double valor = 39.90;
        char categoria = 'F';


        String categoriaDescricao;

        if (categoria == 'F') {
            categoriaDescricao = "Ficção ";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não Ficção ";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia ";
        } else if (categoria == 'H') {
            categoriaDescricao = "História ";
        }else {
            categoriaDescricao = "Categoria inválida ";
        }

        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + numeroPaginas + " páginas, custa R$" + valor + " e pertence à categoria " + categoriaDescricao + 'H');


    }
}
