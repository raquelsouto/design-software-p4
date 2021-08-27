public class Circulo extends Figura{

    private double raioLado;
    private static final double PI = 3.14;

    public Circulo(double raioLado) {
        this.raioLado = raioLado;
    }

    public double getRaioLado() {
        return raioLado;
    }

    public void setRaioLado(double raioLado) {
        this.raioLado = raioLado;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raioLado=" + raioLado +
                '}';
    }

    @Override
    public double area() {
        return (raioLado * PI);
    }
}
