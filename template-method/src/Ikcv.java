public class Ikcv extends TemplateMethodImposto {

    private static double IMPOSTO_ALTO_IKCV = 0.1;
    private static double IMPOSTO_BAIXO_IKCV = 0.06;

    public Ikcv(double orcamento, Item item) {
        super(orcamento, item);
    }

    @Override
    public boolean calcularImpostoMaximo(double orcamento, Item item) {
        return orcamento > 500 && procurarItemCaro(item);
    }

    @Override
    public double calculaImpostoAlto(double orcamento, Item item) {
        return orcamento * IMPOSTO_ALTO_IKCV;
    }

    @Override
    public double calculaImpostoBaixo(double orcamento, Item item) {
        return orcamento * IMPOSTO_BAIXO_IKCV;
    }

    private boolean procurarItemCaro(Item item) {
        for (Item itens : item.getListaDeItens()) {
            if (item.getValorItem() > 100) {
                return true;
            }
        }
        return false;
    }

}


