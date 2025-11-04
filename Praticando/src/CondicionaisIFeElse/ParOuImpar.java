package CondicionaisIFeElse;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        int numero = 8;

        if (numero % 2 == 0){
            System.out.println("o valor " + numero + " é par");
        } else {
            System.out.println("o valor " + numero +" impar");
        }
    }
}

