package OrientacaoAoObjeto.CalculandoNotas;

import java.util.Locale;

public class CalculandoNotas {

    String nome;
    double nota1;
    double nota2;


    public void calculoNotas() {

        double mediaCalculada = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Media: " + mediaCalculada);
        System.out.println("Situação: ");

        if (mediaCalculada >= 7.0) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        System.out.println("=========================");


    }
}

