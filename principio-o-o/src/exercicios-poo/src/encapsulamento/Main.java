package encapsulamento;

public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(1, 10.0, "Camila");

        System.out.println(conta);

        conta.depositar(50.0);
        System.out.println(conta);

        conta.sacar(20.0);
        System.out.println(conta);

        // Tentar sacar um valor maior que o saldo
        conta.sacar(100.0);
        System.out.println(conta);
    }
}
