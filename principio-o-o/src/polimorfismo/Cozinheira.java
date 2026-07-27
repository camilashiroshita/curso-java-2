package polimorfismo;

public class Cozinheira implements Trabalhadora {

    public void trabalhar() {
        System.out.println("Fazer comida.");
    }

    public void temperarComida() {
         System.out.println("Temperar comida.");
    }

    public String toString() {
        return "Cozinheira";
    }
}    
