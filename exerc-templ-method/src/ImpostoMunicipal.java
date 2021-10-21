public class ImpostoMunicipal extends TemplateMethodImposto {

    public static double IMPOSTO_ICVV = 5.0;
    public static double IMPOSTO_ICTU = 3.0;
    public static double IMPOSTO_ITPU = 3.0;
    public static double IMPOSTO_ITCMD = 8.2;

    public ImpostoMunicipal(String nomeProduto, double valorProduto) {
        super(nomeProduto, valorProduto);
    }

    @Override
    public double calculaImposto(double valorProduto) {
        return valorProduto + IMPOSTO_ICVV + IMPOSTO_ICTU + IMPOSTO_ITCMD + IMPOSTO_ITPU;
    }
}
