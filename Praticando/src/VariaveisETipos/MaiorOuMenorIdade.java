package VariaveisETipos;

import java.util.Scanner;

public class MaiorOuMenorIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("digite sua idade : ");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Voce é maior de idade. ");
        } else {
            System.out.println("voce é menor de idade. ");
        }
    }
}