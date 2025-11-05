package OrientacaoAoObjeto.CalculandoNotas;

public class CalculandoNotas {

    String nome;
    double nota1;
    double nota2;

    double media = nota1 + nota2;
    double resultado = media / 2;

    public void calculoNotas(){

        if (media >= 7.0){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
    }
    void exibirDetalhes(){

        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2 );
        System.out.println("Media: " + resultado);
        System.out.println("Situação: ");
        calculoNotas();
        System.out.println("=========================");

    }

}
