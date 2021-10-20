public class Ikcv extends TemplateMethodImposto {

    public Ikcv(double orcamento, Item item) {
        super(orcamento, item);
    }

    @Override
    public boolean calcularComImpostoMaximo(double orcamento, Item item) {
        return orcamento > 500 && procurarItemCaro();
    }

    @Override
    public double calculaImpostoAlto(double orcamento, Item item) {
        return orcamento * 0.1;
    }

    @Override
    public double calculaImpostoMenor(double orcamento, Item item) {
        return orcamento * 0.06;
    }

    public boolean calculaImposto(double orcamento, double valorItem) {
        if(orcamento > 500 && procurarItemCaro()) {
            return true;
        }
        return false;
    }

    private boolean procurarItemCaro() {
        for (Item item : getItem().getListaDeItens()) {
            if (item.getValorItem() > 100) {
                return true;
            }
        }
        return false;
    }

}


