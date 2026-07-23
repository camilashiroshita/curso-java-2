package polimorfismo;

public class Main {
    public static void main(String[] args) {
        // A variável é do tipo Trabalhadora, mas o objeto é uma Cozinheira
        Trabalhadora cozinheira = new Cozinheira();
        Trabalhadora medica = new Medica();
        Trabalhadora programadora = new Programadora();

        cozinheira.trabalhar();
        medica.trabalhar();
        programadora.trabalhar();
    }
}
