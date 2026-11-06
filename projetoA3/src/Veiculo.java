
public abstract class Veiculo {

    private String placa;
    private String modelo;

    public Veiculo(String placa, String modelo) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Placa obrigatoria.");
        }

        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo obrigatorio.");
        }

        this.placa = placa.trim().toUpperCase();
        this.modelo = modelo.trim();
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract double calcularTarifa(long minutos);

    public void exibirInformacoes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
    }
}
