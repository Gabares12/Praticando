package CondicionaisIFeElse;

import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args) {

        double media = 5.8;



        if (media >= 7.0){
            System.out.println("o aluno teve média " + media + " e está aprovado" );
        } else if (media >= 5.0){
            System.out.println("o aluno teve média " + media + " e está de recuperação");
        } else {
            System.out.println("o aluno teve média " + media + " e está reprovado");

        }

    }
}
