public class FactoryFigura {

    public Figura getFigura(String tipo, double raioLado) {
        if (tipo.equalsIgnoreCase("circulo")) {
            return new Circulo(raioLado);
        } else if (tipo.equalsIgnoreCase("quadrado")) {
            return new Quadrado(raioLado);
        } else if (tipo.equalsIgnoreCase("equilatero")) {
            return new TrEquilatero(raioLado);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        FactoryFigura factory = new FactoryFigura();
        Figura circuloValor = factory.getFigura("circulo", 2.5);
        System.out.println(circuloValor.area());

        Figura quadradoValor = factory.getFigura("quadrado", 2.0);
        System.out.println(quadradoValor.area());
    }


}

