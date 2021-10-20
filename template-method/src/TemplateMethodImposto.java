public abstract class TemplateMethodImposto extends Imposto {

    public TemplateMethodImposto(double orcamento, Item item) {
        super(orcamento, item);
    }

    public double calculaImposto(double orcamento, Item item) {
        if(calcularComImpostoMaximo(orcamento, item)) {
            return calculaImpostoAlto(orcamento, item);
        } else {
            return calculaImpostoMenor(orcamento, item);
        }
    }

    public abstract boolean calcularComImpostoMaximo(double orcamento, Item item);

    public abstract double calculaImpostoAlto(double orcamento, Item item);

    public abstract double calculaImpostoMenor(double orcamento, Item item);
}
