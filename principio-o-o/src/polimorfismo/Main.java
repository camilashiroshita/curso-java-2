package polimorfismo;

public class Main {
    public static void main(String[] args) {
        // A variável é do tipo Trabalhadora, mas o objeto é uma Cozinheira
        // Trabalhadora cozinheira = new Cozinheira();
        // Trabalhadora medica = new Medica();
        // Trabalhadora programadora = new Programadora();

        Trabalhadora[] trabalhadores = {
            new Cozinheira(), new Medica(), new Programadora()
        };

        trabalhar(trabalhadores);
    }

    private static void trabalhar(Trabalhadora[] trabalhadores) {
        for (Trabalhadora trabalhadora : trabalhadores) {
            trabalhadora.trabalhar();
            if (trabalhadora instanceof Cozinheira)
                ((Cozinheira) trabalhadora).temperarComida();
        }
    }
}

