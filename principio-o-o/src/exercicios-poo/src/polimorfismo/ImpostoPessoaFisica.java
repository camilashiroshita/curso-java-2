package polimorfismo;

public class ImpostoPessoaFisica implements Imposto {
    private double rendaAnual;

    public double getRendaAnual() {
        return rendaAnual;
    }

    ImpostoPessoaFisica (double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto() {
        return (rendaAnual * 0.2);
    }

    
    
}
