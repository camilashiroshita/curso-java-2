package exercicios;

// Exercício Carro
public class Main {   
        public static void main(String[] args) {
            Carro meuCarro = new Carro("Fusca", 2020, "azul");
            meuCarro.acelerar();
            System.out.println(meuCarro.getDetalhes());
        }
    } 

    