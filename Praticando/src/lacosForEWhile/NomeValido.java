package lacosForEWhile;

import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String nome = "";
        while (!nome.equalsIgnoreCase("ana")) {
            System.out.println("digite seu nome: ");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("ana")){
                System.out.println("nome certo, voce acertou");
            }else {
                System.out.println("tente novamente");
            }
        }
        System.out.println("fim do loop");






    }
}
