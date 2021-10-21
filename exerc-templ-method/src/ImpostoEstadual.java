public class ImpostoEstadual extends TemplateMethodImposto {

    public static double IMPOSTO_ICVV = 5.0;
    public static double IMPOSTO_ICTU = 3.0;

    public ImpostoEstadual(String nomeProduto, double valorProduto) {
        super(nomeProduto, valorProduto);
    }

    @Override
    public double calculaImposto(double valorProduto) {
        return valorProduto + IMPOSTO_ICVV + IMPOSTO_ICTU;
    }

}
