public abstract class TemplateMethodImposto extends Imposto {

    public TemplateMethodImposto(String nomeProduto, double valorProduto) {
        super(nomeProduto, valorProduto);
    }

    public abstract double calculaImposto(double valorProduto);

}
