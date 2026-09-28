public class ColaboradorPadrao extends Colaborador {

    public ColaboradorPadrao(String matricula, String nome) {
        super(matricula, nome);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase();
    }

    @Override
    public void exibirDados() {
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: Colaborador Padrão");
        System.out.println("Salário Base: R$ " + getSalarioBase());
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
    }
}