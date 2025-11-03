package VariaveisETipos;

public class Viagem {
    public static void main(String[] args) {
        double consumoMedio = 12.5;
        double capacidadeDoTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 650;

        double autonomiaMaxima = consumoMedio * capacidadeDoTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("autonomia Maxima " + autonomiaMaxima);
        System.out.println( "autonomia atual " + autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem){
            System.out.println("vai conseguir terminar a viagem ");
        }else {
            System.out.println("vai ter que abastecer ");
        }



    }
}
