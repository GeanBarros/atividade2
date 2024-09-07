import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor do imposto: R$ ");
        double imposto = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

        System.out.println("\nDados iniciais do funcionário: ");
        funcionario.mostrarDados();

        System.out.print("\nDigite a porcentagem de aumento: ");
        double porcentagem = scanner.nextDouble();

        funcionario.aumentarSalario(porcentagem);

        System.out.println("\nDados após o aumento: ");
        funcionario.mostrarDados();

        scanner.close();

    }
}