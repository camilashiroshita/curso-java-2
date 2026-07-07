package moradias;

public class Casa {
    // Inicializando atributos
    public boolean inteligente; 
    public String nome;

    //Criando o construtor sem parâmetro
    public Casa() {
    }

    // Criando o construtor com parâmetro
    public Casa(boolean inteligente) {
        this.inteligente = inteligente;
    }

    // Implementando método
    public void acenderLuz() {
        if (inteligente)
            System.out.println("Comando de voz");
        else
            System.out.println("Pressionar interruptor");
    }
}
