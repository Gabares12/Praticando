package lacosForEWhile;

public class EXEMPLO {
    public static void main(String[] args) {

        int teste = 0;
        while (teste < 10) {
            System.out.println("teste " + ++teste);

        }
        System.out.println("==========================");
        int teste1 = 0;
        do {
            System.out.println("testes do do-while " + ++teste1);
        } while (teste1 < 10);
        System.out.println("==========================");

        for (int i = 0; i < 10; i++) {


        }
    }
}