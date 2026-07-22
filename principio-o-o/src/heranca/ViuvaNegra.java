package heranca;

public class ViuvaNegra extends SuperHeroi implements Avenger{

    public ViuvaNegra(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    public boolean isLeader() {
        return false;
    }
    
}
