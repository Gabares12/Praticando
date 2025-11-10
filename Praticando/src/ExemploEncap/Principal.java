package ExemploEncap;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("ana");
        funcionario1.setCargo("gerente de projetos");
        funcionario1.setSalario(9000);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Joao";
        funcionario2.cargo = "Desenvolvidor";
        funcionario2.salario = 8500;

        funcionario2.exibirInfo();
        funcionario2.reajustarSalario(5);
        funcionario1.exibirInfo();
    }
}
