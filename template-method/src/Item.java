import java.util.ArrayList;
import java.util.List;

public class Item {

    private String nomeItem;
    private double valorItem;
    private List<Item> listaDeItens = new ArrayList<Item>();

    public Item(String nomeItem, double valorItem) {
        this.nomeItem = nomeItem;
        this.valorItem = valorItem;
    }

    public double getValorItem() {
        return valorItem;
    }

    public String getNomeItem() {
        return nomeItem;
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

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public void adicionaItem(Item item) {
        listaDeItens.add(item);
    }

    public void removeItem(Item item) {
        listaDeItens.remove(item);
    }
}
