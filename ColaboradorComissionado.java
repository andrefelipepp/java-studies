public class ColaboradorComissionado extends Colaborador {

    private double valorVendas;
    private double percentualComissao;

    public ColaboradorComissionado(String matricula, String nome,
                                   double valorVendas, double percentualComissao) {
        super(matricula, nome);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double calcularComissao() {
        return valorVendas * percentualComissao / 100;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + calcularComissao();
    }

    @Override
    public void exibirDados() {
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: Colaborador Comissionado");
        System.out.println("Salário Base: R$ " + getSalarioBase());
        System.out.println("Comissão: R$ " + calcularComissao());
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
    }
}