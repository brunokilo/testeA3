import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario {

    public Funcionario() {
    }

    // public Pagamento pagamento;
    public ArrayList <Pagamento> pagamentos = new ArrayList<>();
    private String nome;
    private String sobrenome;
    private LocalDate nascimento;

    private double salario;

    private String sexo;

    public ArrayList pagamento;

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList getPagamento() {
        return pagamento;
    }

    public void setPagamento(ArrayList pagamento) {
        this.pagamento = pagamento;
    }
}
