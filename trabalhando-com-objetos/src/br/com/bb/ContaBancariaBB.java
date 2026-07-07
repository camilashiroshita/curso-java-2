package br.com.bb;

public class ContaBancariaBB {
    public String titular;
    public double saldo;
	public char[] toString;


    public void atualizarSaldo(Double valor) {
        saldo += valor;
    }

    public String toString() {
        return "{Titular: " + titular + ", saldo: " + saldo + "}";
    }

    public ContaBancariaBB(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

}

