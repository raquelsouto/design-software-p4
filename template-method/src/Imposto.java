public abstract class Imposto {

    private double orcamento;
    private Item item;

    public Imposto(double orcamento, Item item) {
        this.orcamento = orcamento;
        this.item = item;

    }
    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
