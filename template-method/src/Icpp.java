public class Icpp extends TemplateMethodImposto {

    private static double IMPOSTO_ALTO_ICPP = 0.07;
    private static double IMPOSTO_BAIXO_ICPP = 0.05;

    public Icpp(double orcamento, Item item) {
        super(orcamento, item);
    }

    @Override
    public boolean calcularImpostoMaximo(double orcamento, Item item) {
        return orcamento > 500;
    }

    @Override
    public double calculaImpostoAlto(double orcamento, Item item) {
        return orcamento * IMPOSTO_ALTO_ICPP;
    }

    @Override
    public double calculaImpostoBaixo(double orcamento, Item item) {
        return orcamento * IMPOSTO_BAIXO_ICPP;
    }

}
