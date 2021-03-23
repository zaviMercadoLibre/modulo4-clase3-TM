package ejercicio2;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public static void main(String[] args) {
        Triangulo rec = new Triangulo(2,3);
        System.out.println(rec);
    }

    @Override
    public double area() {
        return (this.base*this.altura)/2;
    }
}
