package polimorfismo;

public class CalculadoraImposto {
    public static void main(String[] args) {
        
        Imposto[] impostos = {
            new ImpostoPessoaJuridica(100000.00), 
            new ImpostoPessoaFisica(100000.00)
        };

        for (Imposto imposto : impostos) {
            System.out.println(imposto.calcularImposto());
        }
    }
}
