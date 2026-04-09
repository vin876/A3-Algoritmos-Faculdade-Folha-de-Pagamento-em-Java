import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Colaborador> colaboradores = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    cadastrarFuncionarioPadrao();
                    break;
                case 2:
                    cadastrarFuncionarioComissionado();
                    break;
                case 3:
                    cadastrarFuncionarioProducao();
                    break;
                case 4:
                    gerarFolhaPagamento();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
public static void exibirMenu() {
        System.out.println("\n========= SISTEMA DE FOLHA DE PAGAMENTO =========");
        System.out.println("1 - Cadastrar Funcionário Padrão");
        System.out.println("2 - Cadastrar Funcionário Comissionado");
        System.out.println("3 - Cadastrar Funcionário Produção");
        System.out.println("4 - Gerar Folha de Pagamento");
        System.out.println("0 - Sair");
    }

    public static void cadastrarFuncionarioPadrao() {
        System.out.println("\n--- Cadastro Funcionário Padrão ---");
        int matricula = lerInteiro("Matrícula: ");
        String nome = lerTexto("Nome: ");

        colaboradores.add(new FuncionarioPadrao(matricula, nome));
        System.out.println("Funcionário padrão cadastrado com sucesso!");
    }

    public static void cadastrarFuncionarioComissionado() {
        System.out.println("\n--- Cadastro Funcionário Comissionado ---");
        int matricula = lerInteiro("Matrícula: ");
        String nome = lerTexto("Nome: ");
        double vendas = lerDoublePositivo("Informe valor das vendas: ");
        double percentual = lerDoublePositivo("Informe comissão percentual: ");

        colaboradores.add(new FuncionarioComissionado(matricula, nome, vendas, percentual));
        System.out.println("Funcionário comissionado cadastrado com sucesso!");
    }

    public static void cadastrarFuncionarioProducao() {
        System.out.println("\n--- Cadastro Funcionário Produção ---");
        int matricula = lerInteiro("Matrícula: ");
        String nome = lerTexto("Nome: ");
        int quantidade = lerInteiroPositivo("Informe quantidade de peças: ");
        double valorPeca = lerDoublePositivo("Informe valor da peça: ");

        colaboradores.add(new FuncionarioProducao(matricula, nome, quantidade, valorPeca));
        System.out.println("Funcionário de produção cadastrado com sucesso!");
    }

    public static void gerarFolhaPagamento() {
        System.out.println("\n========= FOLHA DE PAGAMENTO =========");

        if (colaboradores.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;
        }

        System.out.println("Total de pessoas cadastradas: " + colaboradores.size());
        System.out.println("-----------------------------------");

        for (Colaborador c : colaboradores) {
            c.exibirDados();
        }
    }

    public static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                int valor = Integer.parseInt(sc.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
            }
        }
    }

    public static int lerInteiroPositivo(String mensagem) {
        int valor;
        do {
            valor = lerInteiro(mensagem);
            if (valor < 0) {
                System.out.println("Valor inválido! Digite um número positivo.");
            }
        } while (valor < 0);
        return valor;
    }

    public static double lerDoublePositivo(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = Double.parseDouble(sc.nextLine().replace(",", "."));
                if (valor < 0) {
                    System.out.println("Valor inválido! Digite um número positivo.");
                } else {
                    return valor;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido.");
            }
        }
    }

    public static String lerTexto(String mensagem) {
        String texto;
        do {
            System.out.print(mensagem);
            texto = sc.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("Campo não pode ficar vazio.");
            }
        } while (texto.isEmpty());
        return texto;
    }
}
