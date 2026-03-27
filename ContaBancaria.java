package treino;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido para deposito");

        } else {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado.");
        }

    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido para saque");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        }

    }


}
