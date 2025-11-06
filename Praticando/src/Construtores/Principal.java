package Construtores;

public class Principal {
    public static void main(String[] args) {

        pessoa p1 = new pessoa("Pedro",40);

        pessoa p2 = new pessoa();

        pessoa p3 = new pessoa(2,"silva");

        p2.nome = "Maria";
        p2.idade = 30;


    }

}
