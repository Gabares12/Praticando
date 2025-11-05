package OrientacaoAoObjeto.ZerandoSaldo;

public class Conta {

    double saldo;

   public void exibirSaldo(){

        System.out.println("Saldo = " + saldo );


    }

    public void reajusteSaldo(){

       saldo = 0.0;
        System.out.println("seu novo saldo é de " + " R$ " + saldo );



    }

}
