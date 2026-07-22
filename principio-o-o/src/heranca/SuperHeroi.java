package heranca;

// Superclasse (classe pai de todos, representa todos os super-heróis)
public class SuperHeroi {
    private String traje;
    private String[] superPoderes; 

    public SuperHeroi(String traje, String[] superPoderes) {
        this.traje = traje;
        this.superPoderes = superPoderes;
    }

    public void usarSuperPoder(int index) {
        System.out.println("Usando super poder " + superPoderes[index]);
    }

    public String getTraje() {
        return traje;
    }     
}
