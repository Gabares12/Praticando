package CondicionaisIFeElse;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("digite o primeiro numero: ");

        numero1 = scanner.nextInt();

        System.out.println("digite o segundo numero: ");

        numero2 = scanner.nextInt();

        if (numero1 > numero2 ){
            System.out.println("maior é o" + numero1);
        } else if (numero2 > numero1) {
            System.out.println("o maior é o " + numero2);
        }else {
            System.out.println("os numeros são iguais");
        }


    }
}
