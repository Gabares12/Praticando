package lacosForEWhile;

public class SomaDePares {
    public static void main(String[] args) {
int soma = 0;

        for (int indece = 1; indece <= 100 ; indece++) {
            if (indece % 2 == 0) {
                soma += indece;
            }
            System.out.println("a soma dos pares de 1 a 100 é: " + soma);
        }
    }
}
