package ejercicio2;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(2,3);
        System.out.println(rec);
    }

    @Override
    public double area() {
        return this.base*this.altura;
    }
}
