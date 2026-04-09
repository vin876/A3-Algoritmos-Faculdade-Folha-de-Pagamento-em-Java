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
