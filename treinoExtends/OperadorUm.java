package treinoExtends;

public class OperadorUm {
    protected String nome;
    protected int conta;
    protected double valor;

    public OperadorUm() {

    }

    public OperadorUm(String nome, int conta, double valor) {
        this.nome = nome;
        this.conta = conta;
        this.valor = valor;

    }

    public String getNome() {
        return nome;
    }

    public int getConta() {
        return conta;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Nome: " + nome + "\nConta: " + conta + "\nSaldo: R$ " + String.format("%.2f", valor);
    }
}
