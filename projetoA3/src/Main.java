
public class Main {

    public static void main(String[] args) {

        Veiculo carro = new Carro("ABC1D23", "Civic");
        Veiculo moto = new Moto("XYZ9A87", "CG 160");

        System.out.println("=== PARKCONTROL ===");

        System.out.println("\nCARRO:");
        carro.exibirInformacoes();
        System.out.printf(
            "Valor por 90 minutos: R$ %.2f%n",
            carro.calcularTarifa(90)
        );

        System.out.println("\nMOTO:");
        moto.exibirInformacoes();
        System.out.printf(
            "Valor por 90 minutos: R$ %.2f%n",
            moto.calcularTarifa(90)
        );
    }
}
