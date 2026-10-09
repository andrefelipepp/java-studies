public class ColaboradorProducao extends Colaborador {

    private int quantidadePecas;
    private double valorPorPeca;

    public ColaboradorProducao(String matricula, String nome,
                               int quantidadePecas, double valorPorPeca) {
        super(matricula, nome);
        this.quantidadePecas = quantidadePecas;
        this.valorPorPeca = valorPorPeca;
    }

    public int getQuantidadePecas() {
        return quantidadePecas;
    }

    public void setQuantidadePecas(int quantidadePecas) {
        this.quantidadePecas = quantidadePecas;
    }

    public double getValorPorPeca() {
        return valorPorPeca;
    }

    public void setValorPorPeca(double valorPorPeca) {
        this.valorPorPeca = valorPorPeca;
    }

    public double calcularProdutividade() {
        return quantidadePecas * valorPorPeca;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + calcularProdutividade();
    }

    @Override
    public void exibirDados() {
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: Colaborador de Produção");
        System.out.println("Salário Base: R$ " + getSalarioBase());
        System.out.println("Produtividade: R$ " + calcularProdutividade());
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
    }
}