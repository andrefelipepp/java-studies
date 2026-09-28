public class Colaborador {

    public static final double SALARIO_BASE = 2000.00;

    private String matricula;
    private String nome;
    private double salarioBase;

    public Colaborador(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = SALARIO_BASE;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalarioFinal() {
        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
    }
}