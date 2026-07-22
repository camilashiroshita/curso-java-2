package heranca;

public class Main {
    public static void main(String[] args) {
        /* Antes de usar herança
        HomemAranha homemAranha = new HomemAranha();
        HomemDeFerro homemDeFerro = new HomemDeFerro();
        Tempestade tempestade = new Tempestade();
        ViuvaNegra viuvaNegra = new ViuvaNegra();
        */

        SuperHeroi[] superHerois = {
            new HomemAranha("Roupa vermelha com teias", new String[] {"Lançar teia"}),
            new HomemDeFerro("Roupa vermelha super resistente", new String[] {"Usar traje de guerra"}),
            new Tempestade("Roupa branca", new String[] {"Controlar o tempo"}),
            new ViuvaNegra("Roupa vermelha / preta", new String[] {"Espiã"})
        };

        // Fazer o for-each para percorrer pelo array de super-heróis
        for (SuperHeroi superHeroi : superHerois) {
            superHeroi.usarSuperPoder(0);
            System.out.println(superHeroi.getTraje());
        }
    }    
}
