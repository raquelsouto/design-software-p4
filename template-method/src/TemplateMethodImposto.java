public abstract class TemplateMethodImposto extends Imposto {

    public TemplateMethodImposto(double orcamento, Item item) {
        super(orcamento, item);
    }

    public abstract boolean calcularImpostoMaximo(double orcamento, Item item);
    public abstract double calculaImpostoAlto(double orcamento, Item item);
    public abstract double calculaImpostoBaixo(double orcamento, Item item);
}
