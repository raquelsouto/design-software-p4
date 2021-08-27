public class FactoryFigura {

    public Figura getFigura(String tipo, double raioLado) {
        switch (tipo) {
            case "circulo":
                return new Circulo(raioLado);
            case "quadrado":
                return new Quadrado(raioLado);
            case "triangulo":
                return new TrEquilatero(raioLado);
            default:
                return null;
        }
    }
}

