import java.util.ArrayList;
import java.util.List;

public class Item {

    private double valorItem;
    private List<Item> listaDeItens = new ArrayList<Item>();

    public Item(double valorItem) {
        this.valorItem = valorItem;
    }

    public double getValorItem() {
        return valorItem;
    }

    public List<Item> getListaDeItens() {
        return listaDeItens;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    public void setListaDeItens(List<Item> listaDeItens) {
        this.listaDeItens = listaDeItens;
    }

    public void adicionaItem(Item item) {
        listaDeItens.add(item);
    }

    public void removeItem(Item item) {
        listaDeItens.remove(item);
    }
}
