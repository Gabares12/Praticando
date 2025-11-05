package OrientacaoAoObjeto.Temperatura;

public class ControleDeTemperatura {

    String local;
    double celsius;

    public void temperatura(){

        if (celsius >= 37.5){
            System.out.println("Alerta: Temperatura acima do limite!");
        }else {
            System.out.println("a temperatura está ok. ");
        }

    }
    void exibirDetalhes(){

        System.out.println("Sensor no local: " + local);
        System.out.println("Temperatura " + celsius);
        temperatura();
        System.out.println("==================");
    }

}

