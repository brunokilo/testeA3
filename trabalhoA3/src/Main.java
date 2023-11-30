import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o nome do funcionário: ");
        funcionario.setNome(sc.nextLine());

        System.out.print("Digite o sobrenome do funcionário: ");
        funcionario.setSobrenome(sc.nextLine());

        System.out.print("Digite a data de nascimento do funcionário (XXXX-MM-YY): ");
        funcionario.setNascimento(LocalDate.parse(sc.next()));

        System.out.print("Digite o salário do funcionário: ");
        funcionario.setSalario(sc.nextDouble());

        sc.nextLine();

        System.out.println("Digite o sexo do funcionário: ");
        funcionario.setSexo(sc.nextLine());

        Pagamento pagamento = new Pagamento(funcionario, LocalDate.now(), funcionario.getSalario());


        System.out.println(funcionario.getNome());

        System.out.println(funcionario.getSobrenome());

        System.out.println(funcionario.getNascimento());

        System.out.println(funcionario.getSalario());

        System.out.println(funcionario.getSexo());

        System.out.println(funcionario.pagamentos);

        sc.close();
    }
}