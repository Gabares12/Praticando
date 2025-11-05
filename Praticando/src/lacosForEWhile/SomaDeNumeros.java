package lacosForEWhile;

public class SomaDeNumeros {
    public static void main(String[] args) {

       int [] valores = {10,20,30,40,50};

//     indica que é para começar a contar apartir de 0
       int soma = 0;
//       indica que é para começar do 0
        int indice = 0;
//      ele vai contar até o 4 e quando chegar no 5
//      e ver que não é verdadeiro ele para
        while (indice < valores.length){
            soma +=valores[indice];

            indice++;
        }
        System.out.println("a soma é " + soma);
    }
}
