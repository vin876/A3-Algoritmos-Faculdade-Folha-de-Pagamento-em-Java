public class FuncionarioComissionado extends Colaborador {
    private double vendas;
    private double percentualComissao;

    public FuncionarioComissionado(int matricula, String nome, double vendas, double percentualComissao) {
        super(matricula, nome);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularExtras() {
        return vendas * percentualComissao / 100.0;
    }

    @Override
    public String getTipo() {
        return "Funcionário Comissionado";
    }

    @Override
    public void exibirDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: R$ " + SALARIO_BASE);
        System.out.println("Comissão: R$ " + calcularExtras());
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
        System.out.println("-----------------------------------");
    }
}
