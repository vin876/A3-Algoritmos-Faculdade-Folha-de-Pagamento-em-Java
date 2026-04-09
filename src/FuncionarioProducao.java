public class FuncionarioProducao extends Colaborador {
    private int quantidadeProduzida;
    private double valorPorPeca;

    public FuncionarioProducao(int matricula, String nome, int quantidadeProduzida, double valorPorPeca) {
        super(matricula, nome);
        this.quantidadeProduzida = quantidadeProduzida;
        this.valorPorPeca = valorPorPeca;
    }

    @Override
    public double calcularExtras() {
        return quantidadeProduzida * valorPorPeca;
    }

    @Override
    public String getTipo() {
        return "Funcionário de Produção";
    }

    @Override
    public void exibirDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: R$ " + SALARIO_BASE);
        System.out.println("Produtividade: R$ " + calcularExtras());
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
        System.out.println("-----------------------------------");
    }
}
