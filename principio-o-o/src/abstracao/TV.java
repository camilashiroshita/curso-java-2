package abstracao;

public class TV {
    private boolean ligada;
    private int volume;
    private int canal;

    // Método que liga ou desliga a TV
    public void ligarDesligar() {
        // Pega o atributo "ligada" e nega o valor booleano que estiver (this serve para EVIDENCIAR que o atributo é da classe, ou seja, pertence a um objeto)
        this.ligada = !this.ligada;
        System.out.println(
            "A TV está " + (ligada ? "ligada." : "desligada.")
        );
    }

    public void aumentarVolume() {
        // This serve para EVIDENCIAR que o atributo é da classe, ou seja, pertence a um objeto
        this.volume++;
        System.out.println("Volume aumentado para " + this.volume);
    }

    public void diminuirVolume() {
        // "This" tem a função de EVIDENCIAR que o atributo é da classe, ou seja, pertence a um objeto
        this.volume--;
        System.out.println("Volume diminuído para " + this.volume);

    }

    // Parâmetro: novoCanal / Argumento: valor enviado quanto o método é chamado 
    public void trocarCanal(int novoCanal) {
        this.canal = novoCanal;
        System.out.println("Canal alterado para " + this.canal);
    }

}        