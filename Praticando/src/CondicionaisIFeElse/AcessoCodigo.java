package CondicionaisIFeElse;

import java.util.Scanner;

public class AcessoCodigo {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            int codigo = 2023;
            double nivel;

            System.out.println("digite o codigo de acesso: ");
            codigo = scanner.nextInt();

            System.out.println("digite o nivel de permissão: ");
            nivel = scanner.nextInt();

            if (codigo == 2023) {
            }
            if (nivel <= 3) {
                System.out.println("Acesso permitido. Bem-vindo ao sistema!");
            } else {
                System.out.println("""
                         acesso negado
                        codigo ou nivel errados.
                        """);
            }


        }
    }
