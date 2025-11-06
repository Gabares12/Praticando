package Construtores;

public class pessoa {

    String nome;
    int idade;
    String sobrenome;
    int altura;

    pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    // não pode ser a mesma ordem do primeiro metodo!
    pessoa(int altura, String sobrenome){
        this.sobrenome = sobrenome;
        this.altura = altura;
    }



    pessoa(){

    }
}
