package heranca;

public class HomemAranha extends SuperHeroi implements Avenger {

    public HomemAranha(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    public boolean isLeader() {
        return false;
    }
    
}
