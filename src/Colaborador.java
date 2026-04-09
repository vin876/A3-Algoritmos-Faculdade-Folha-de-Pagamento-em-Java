public abstract class Colaborador {
    protected int matricula;
    protected String nome;
    protected static final double SALARIO_BASE = 2000.0;

    public Colaborador(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return SALARIO_BASE;
    }

    public abstract double calcularExtras();

    public double calcularSalarioFinal() {
        return SALARIO_BASE + calcularExtras();
    }

    public abstract String getTipo();

    public abstract void exibirDados();
}
