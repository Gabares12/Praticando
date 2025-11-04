package CondicionaisIFeElse;

import java.util.Scanner;

public class DiaUtil {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String dia;

        System.out.println("digite o dia da semana: ");

        dia = scanner.nextLine();

        if (dia.equals("sabado") || dia.equals("domingo")){

        }else {
            System.out.println("é dia util");
        }



    }
}
