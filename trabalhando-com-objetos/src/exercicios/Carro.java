package exercicios;

public class Carro {
    String modelo;
    int ano;
    String cor;
    int velecidadeMaxima;    


    public int acelerar() {
        return velecidadeMaxima += 10;
    }

    Carro(String modelo, int ano, String cor, int velecidadeMaxima) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velecidadeMaxima = velecidadeMaxima;
    }

    public String getDetalhes() {
        return "Modelo: " + modelo + ", ano: " + ano + ", cor: " + cor +
        ", velocidade Máxima: " + velecidadeMaxima + "Km/h.";
    }
    

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca", 2020, "azul", 100);
        System.out.println(meuCarro.getDetalhes());
    }
}    
    