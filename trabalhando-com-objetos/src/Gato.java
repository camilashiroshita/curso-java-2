// Criando uma classe chamada Gato
public class Gato {
    // Criando um atributo chamado 'nome' do tipo String
    public String nome;

    // Criando objetos do tipo Gato usando um construtor
    public Gato(String nome) {
        this.nome = nome;
    }

    // Criando um método toString para imprimir o nome do gato
    public String toString() {
        return "{nome: " + this.nome + "}";
    }
}
