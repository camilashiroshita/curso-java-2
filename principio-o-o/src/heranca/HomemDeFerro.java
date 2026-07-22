package heranca;

public class HomemDeFerro extends SuperHeroi implements Avenger {

    public HomemDeFerro(String traje, String[] superPoderes) {
        super(traje, superPoderes);
        System.out.println("Homem de Ferro!");
    }

    // Sobrescrevendo um métododa da superclasse
    public void usarSuperPoder(int index) {
        System.out.println("Falar com Jarvis");
        super.usarSuperPoder(index);        
    }

    public boolean isLeader() {
        return true;
    }
    
}
