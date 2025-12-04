package CadastroVeiculos;

public class CadastroPrincipal {
    public static void main(String[] args) {

        CadastroVeiculos gol = new CadastroVeiculos("GOL", "ABC-1234",2020);

        System.out.println("Veículo Cadastrado: ");
        System.out.println("MODELO: " + gol.getModelo());
        System.out.println("PLACA: " + gol.getPlaca());
        System.out.println("ANO: " + gol.getAno());
    }
}
