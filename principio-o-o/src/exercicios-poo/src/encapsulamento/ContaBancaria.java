package encapsulamento;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria (int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void sacar(double saque) {
        if (saldo >= saque)
            saldo -= saque;
        else
            System.out.println("Saldo insuficiente");         
    }

    public String toString() {
        return "{ numeroConta: " + numeroConta + ", titular: " + titular + ", saldo: "
                + saldo + " }";

    }
}
