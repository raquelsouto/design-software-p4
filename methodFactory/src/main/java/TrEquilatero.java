public class TrEquilatero extends Figura {

    private double lado;

    public TrEquilatero(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return ((lado * lado) * (Math.sqrt(3))/4);
    }

    @Override
    public String toString() {
        return "TrEquilatero {" +
                "área = " + area() +
                '}';
    }
}
