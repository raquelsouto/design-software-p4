public class TesteFactoryFigura {

    public static void main(String[] args) {

        FactoryFigura factory = new FactoryFigura();
        Figura areaCirculor = factory.getFigura("circulo", 2.5);
        System.out.println(areaCirculor);

        Figura areaTriangulo = factory.getFigura("triangulo", 7.0);
        System.out.println(areaTriangulo);

        Figura areaQuadrado = factory.getFigura("quadrado", 2.0);
        System.out.println(areaQuadrado);
    }
}
