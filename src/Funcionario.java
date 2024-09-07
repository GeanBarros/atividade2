
public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;

    }

    public double getSalarioBruto() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        this.salarioBruto += this.salarioBruto * (porcentagem / 100.0);
    }

    public void mostrarDados() {
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("salário líquido: R$ %.2f%n", getSalarioBruto());
    }

}
