
public class Carro extends Veiculo {

    private static final double TARIFA_HORA = 8.0;

    public Carro(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularTarifa(long minutos) {
        if (minutos < 0) {
            throw new IllegalArgumentException("Tempo invalido.");
        }

        long horas = Math.max(1, (minutos + 59) / 60);

        return horas * TARIFA_HORA;
    }
}
