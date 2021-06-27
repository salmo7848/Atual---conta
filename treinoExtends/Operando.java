package treinoExtends;

public class Operando extends OperadorUm {

    public double deposito;

    public Operando(String nome, int conta, double valor, double deposito) {
        super(nome, conta, valor);
        this.deposito = deposito;
    }

    public double saldo() {
        return valor += deposito;
    }

    public String toString() {
        return "Nome: " + nome + "\nConta: " + conta + "\nSaldo atual: R$ " + String.format("%.2f", saldo());
    }

}
