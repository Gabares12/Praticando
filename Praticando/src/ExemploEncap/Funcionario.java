package ExemploEncap;

public class Funcionario {


   private String nome;
   private String cargo;
   private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void exibirInfo(){
        System.out.printf("Funcionario %s - Cargo: %s - Salário %.2f ", nome,cargo,salario);

    }

    public void reajustarSalario(double percentual ){

        salario += salario * (percentual / 100);
        System.out.println("\no novo salario de " + nome + " é de " + salario);


    }
}
