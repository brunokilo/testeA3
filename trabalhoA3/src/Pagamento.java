import java.time.LocalDate;

public class Pagamento {

    Pagamento (Funcionario funcionario, LocalDate now, double salario){

    }
    public Funcionario funcionario;
    public LocalDate data;
    public double liquido;

    public double bruto;

    //METODO DE TESTE
    public void desconta100() {
        if (funcionario != null) {
            double salarioDescontado = funcionario.getSalario() - 100;
            funcionario.setSalario(salarioDescontado);
        }
    }
}
