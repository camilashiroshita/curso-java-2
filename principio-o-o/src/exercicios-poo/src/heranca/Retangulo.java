package heranca;

public class Retangulo extends FiguraGeometrica {
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
        this.tipo = "Retângulo";
    }

     public int getArea() {
        int area = (altura*largura);
        return area;
    }

    public String toString() {
        return "{ altura: " + this.altura + ", largura: " + this.largura + ", tipo: " + this.tipo + " }";
    }


    
}
