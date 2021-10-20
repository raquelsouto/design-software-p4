public class Icpp extends TemplateMethodImposto {

    public Icpp(double orcamento, Item item) {
        super(orcamento, item);
    }

    @Override
    public boolean calcularComImpostoMaximo(double orcamento, Item item) {
        return orcamento > 500;
    }

    @Override
    public double calculaImpostoAlto(double orcamento, Item item) {
        return orcamento * 0.07;
    }

    @Override
    public double calculaImpostoMenor(double orcamento, Item item) {
        return orcamento * 0.05;
    }

}
