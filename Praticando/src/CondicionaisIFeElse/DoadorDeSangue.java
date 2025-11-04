package CondicionaisIFeElse;

import java.util.Scanner;

public class DoadorDeSangue {
    static void main() {
        Scanner scanner = new Scanner(System.in);

       int idade;
       int peso;

        System.out.println("digite sua idade: ");
        idade = scanner.nextInt();

        System.out.println("agora digite seu peso: ");
        peso = scanner.nextInt();

        if (idade > 18){
            System.out.println("""
                    O doador não é compativel.
                    Motivo: deve ter entre 18 e 65 anos.
                    """);
        }else {
            System.out.println("idade do Doador compativel");
        }if (peso <= 50){
            System.out.println("""
                    peso não compativel.
                    """);
        }
    }
}
