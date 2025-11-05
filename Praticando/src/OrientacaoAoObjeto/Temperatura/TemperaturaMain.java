package OrientacaoAoObjeto.Temperatura;

public class TemperaturaMain {
    public static void main(String[] args) {

        ControleDeTemperatura temperatura = new ControleDeTemperatura();
        ControleDeTemperatura temperatura1 = new ControleDeTemperatura();

        temperatura.local = "Jardim - A";
        temperatura.celsius = 39.3;

        temperatura1.local = "Jardim - B";
        temperatura1.celsius = 35.5;

        temperatura.exibirDetalhes();
        temperatura1.exibirDetalhes();



    }
}
