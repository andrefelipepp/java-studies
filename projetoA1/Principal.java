import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal {

    public static String formatarMoeda(double valor) {
        NumberFormat formato =
        NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

        return formato.format(valor);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE FOLHA DE PAGAMENTO =====");
            System.out.println("1 - Cadastrar Colaborador Padrão");
            System.out.println("2 - Cadastrar Colaborador Comissionado");
            System.out.println("3 - Cadastrar Colaborador Produção");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("5 - Exibir Resumo da Folha");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Digite uma opção válida.");
                sc.nextLine();
                System.out.print("Escolha uma opção: ");
            }

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

               case 1:
                    System.out.println("\n--- Cadastro de Colaborador Padrão ---");

                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    ColaboradorPadrao colaborador = 
                        new ColaboradorPadrao(matricula, nome);

                    colaboradores.add(colaborador);

                    System.out.println("Colaborador cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Cadastro de Colaborador Comissionado ---");

                    System.out.print("Matrícula: ");
                    String matriculaComissionado = sc.nextLine();

                    System.out.print("Nome: ");
                    String nomeComissionado = sc.nextLine();

                    System.out.print("Valor de vendas: ");

                    while (!sc.hasNextDouble()) {
                        System.out.println("Digite um valor numérico válido.");
                        sc.nextLine();
                        System.out.print("Valor de vendas: ");
                    }

                    double valorVendas = sc.nextDouble();

                    while (valorVendas < 0) {
                        System.out.println("O valor de vendas não pode ser negativo.");
                        System.out.print("Digite novamente: ");

                        while (!sc.hasNextDouble()) {
                            System.out.println("Digite um valor numérico válido.");
                            sc.nextLine();
                            System.out.print("Valor de vendas: ");
                        }

                        valorVendas = sc.nextDouble();
                    }

                    System.out.print("Percentual de comissão: ");

                    while (!sc.hasNextDouble()) {
                        System.out.println("Digite um valor numérico válido.");
                        sc.nextLine();
                        System.out.print("Percentual de comissão: ");
                    }

                    double percentualComissao = sc.nextDouble();

                    while (percentualComissao < 0) {
                        System.out.println("O percentual de comissão não pode ser negativo.");
                        System.out.print("Digite novamente: ");

                        while (!sc.hasNextDouble()) {
                            System.out.println("Digite um valor numérico válido.");
                            sc.nextLine();
                            System.out.print("Percentual de comissão: ");
                        }

                        percentualComissao = sc.nextDouble();
                    }

                    sc.nextLine();

                    ColaboradorComissionado comissionado =
                        new ColaboradorComissionado(
                            matriculaComissionado,
                            nomeComissionado,
                            valorVendas,
                            percentualComissao
                        );

                    colaboradores.add(comissionado);

                    System.out.println("Colaborador cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Cadastro de Colaborador Produção ---");

                    System.out.print("Matrícula: ");
                    String matriculaProducao = sc.nextLine();

                    System.out.print("Nome: ");
                    String nomeProducao = sc.nextLine();

                    System.out.print("Quantidade de peças: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Digite uma quantidade inteira válida.");
                        sc.nextLine();
                        System.out.print("Quantidade de peças: ");
                    }

                    int quantidadePecas = sc.nextInt();

                    while (quantidadePecas < 0) {
                        System.out.println("A quantidade de peças não pode ser negativa.");
                        System.out.print("Digite novamente: ");

                        while (!sc.hasNextInt()) {
                            System.out.println("Digite uma quantidade inteira válida.");
                            sc.nextLine();
                            System.out.print("Quantidade de peças: ");
                        }

                        quantidadePecas = sc.nextInt();
                    }

                    System.out.print("Valor por peça: ");

                    while (!sc.hasNextDouble()) {
                        System.out.println("Digite um valor numérico válido.");
                        sc.nextLine();
                        System.out.print("Valor por peça: ");
                    }


                    double valorPorPeca = sc.nextDouble();

                    while (valorPorPeca < 0) {
                        System.out.println("O valor por peça não pode ser negativo.");
                        System.out.print("Digite novamente: ");

                        while (!sc.hasNextDouble()) {
                            System.out.println("Digite um valor numérico válido.");
                            sc.nextLine();
                            System.out.print("Valor por peça: ");
                        }

                        valorPorPeca = sc.nextDouble();
                    }

                    sc.nextLine();

                    ColaboradorProducao producao =
                        new ColaboradorProducao(
                        matriculaProducao,
                        nomeProducao,
                        quantidadePecas,
                        valorPorPeca
                    );

                    colaboradores.add(producao);

                    System.out.println("Colaborador cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("\n===== FOLHA DE PAGAMENTO =====");

                    if (colaboradores.isEmpty()) {
                        System.out.println("Nenhum colaborador cadastrado.");
                    } else {
                        for (Colaborador Colaborador : colaboradores) {
                        Colaborador.exibirDados();
                        System.out.println("-----------------------------");
                        }
                    }

                    break;

                case 5:
                    System.out.println("\n===== RESUMO DA FOLHA =====");

                    if (colaboradores.isEmpty()) {
                        System.out.println("Nenhum colaborador cadastrado.");
                    } else {
                        double totalFolha = 0;

                        for (Colaborador Colaborador : colaboradores) {
                        totalFolha += Colaborador.calcularSalarioFinal();
                        }

                        int totalColaboradores = colaboradores.size();
                        double salarioMedio = totalFolha / totalColaboradores;

                        System.out.println("Total de colaboradores: " + totalColaboradores);
                        System.out.println("Total da folha: R$ " + totalFolha);
                        System.out.println("Salário médio: R$ " + salarioMedio);
                    }

                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}