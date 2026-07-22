package empresa;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        //Acessando os métodos da classe 'Carro'
        carro.ligarCarro(); 
        carro.acelerar();
        carro.frear();
        
        // Acessando os atributos da classe 'Carro'
        // System.out.println(carro.motor); // depois de privar os atributos na classe 'Carro', não é possível, acessar 'motor'
        // System.out.println(carro.airbag); // depois de privar os atributos na classe 'Carro', não é possível, acessar 'motor'
        System.out.println(carro.getVolante());

    }
   
}
