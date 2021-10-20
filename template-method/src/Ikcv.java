public class Ikcv extends Imposto {

    public Ikcv(double orcamento, Item item) {
        super(orcamento, item);
    }

    public double calculaImposto(double orcamento, Item item) {
        if(orcamento > 500 && procurarItemCaro(item)) {
            return orcamento * 0.1;
        }
        return orcamento * 0.06;
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


