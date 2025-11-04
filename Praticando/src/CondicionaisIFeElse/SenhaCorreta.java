package CondicionaisIFeElse;

import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long SENHA = 4815162342l;

        System.out.println("digite ");
        SENHA = scanner.nextLong();

        if (4815162342l == SENHA){
            System.out.println("senha correta! - acesso permitido.");
        } else {
            System.out.println("Senha incorreta! - acesso negado.");
        }

    }
}
