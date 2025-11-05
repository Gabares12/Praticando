package CondicionaisIFeElse;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalo;

        System.out.println("digite o valor do emprestimo: ");
        intervalo = scanner.nextInt();

        if (intervalo >= 1000){
            System.out.println("o valor " + intervalo + "," + "está dentro do intervalo permitido para emprestimo.");
        } else {
            System.out.println("o valor " + intervalo + "," + "não está dentro do intervalo permitido para emprestimo.");
        }




    }
}
