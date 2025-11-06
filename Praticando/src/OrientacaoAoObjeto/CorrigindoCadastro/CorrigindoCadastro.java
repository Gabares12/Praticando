package OrientacaoAoObjeto.CorrigindoCadastro;

public class CorrigindoCadastro {

    String nome;
    String cargo;
    int nivel;


    public void exibirDetalhes(String novoCargo, int novoNivel){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel: " + nivel);

        cargo = novoCargo;
        nivel = novoNivel;

        System.out.println("-------- Atualização  --------");

        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel: " + nivel);






    }
}
