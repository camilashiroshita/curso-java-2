package heranca;

public class Triangulo extends FiguraGeometrica {

    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.tipo = "Triângulo";
    }

    public int getArea() {
        int area = (base*altura) / 2;
        return area;
    }

    public String toString() {
        return "{ base: " + this.base + ", altura: " + this.altura + ", tipo: " + this.tipo + " }";
    }
    
}
