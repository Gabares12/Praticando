package VariaveisETipos;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("digite um numero ");

        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("o Numero é par");
        } else {

            System.out.println("o numero é impar");
        }
    }
}