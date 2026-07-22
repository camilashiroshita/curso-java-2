package heranca;

public class Tempestade extends SuperHeroi implements Avenger {

    public Tempestade(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    public boolean isLeader() {
        return false;
    }
    
}
