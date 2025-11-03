package VariaveisETipos;

import java.util.Scanner;

public class ConverterMoeda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorReais;
        final double valorDollar = 5.36;

        System.out.println("digite um valor para ser convertido: ");
        valorReais = scanner.nextInt();

        double conversao = valorReais / valorDollar;

        System.out.printf( "U$%.2f : ",conversao);

    }
}
