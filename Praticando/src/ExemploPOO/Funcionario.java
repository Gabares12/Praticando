package ExemploPOO;
public class Funcionario {

    String nome;
    String cargo;
    double salario;

    public void exibirInfo(){
        System.out.printf("Funcionario %s - Cargo: %s - Salário %.2f ", nome,cargo,salario);

    }

    public void reajustarSalario(double percentual ){

        salario += salario * (percentual / 100);
        System.out.println("\no novo salario de " + nome + " é de " + salario);


    }


}
