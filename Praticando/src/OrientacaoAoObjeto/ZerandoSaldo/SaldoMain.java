package OrientacaoAoObjeto.ZerandoSaldo;

public class SaldoMain {
    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.saldo = 1579.42;

        conta.exibirSaldo();
        conta.reajusteSaldo();
        conta.exibirSaldo();
    }
}
