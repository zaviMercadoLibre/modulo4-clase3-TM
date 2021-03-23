package ejercicio2;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI*this.radio*radio;
    }

    public static void main(String[] args) {
        Circulo circ = new Circulo(5);
        System.out.println(circ);
    }
}
