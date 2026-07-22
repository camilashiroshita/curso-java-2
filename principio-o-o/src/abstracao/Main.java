package abstracao;

public class Main {
    public static void main(String[] args) {
        TV minhaTV = new TV();
        minhaTV.ligarDesligar();
        minhaTV.aumentarVolume();
        minhaTV.diminuirVolume();
        minhaTV.trocarCanal(1);
    }
    
}
