package OrientacaoAoObjeto.CalculandoNotas;

public class NotasMain {
    public static void main(String[] args) {

        CalculandoNotas notas = new CalculandoNotas();
        CalculandoNotas notas1 = new CalculandoNotas();

        notas.nome = "Marcos";
        notas.nota1 = 8.0;
        notas.nota2 = 8.0;

        notas1.nome = "João";
        notas1.nota1 = 7.0;
        notas1.nota2 = 4.5;

        notas.exibirDetalhes();
        notas1.exibirDetalhes();




    }
}
