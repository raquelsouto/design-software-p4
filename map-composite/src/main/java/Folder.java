import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Folder extends Item {

    private List<Item> listOfItens = new ArrayList<Item>();

    public Folder(long size, String name) {
        super(size, name);
    }

    public void addFileOrFolder(Item item) {
        listOfItens.add(item);
    }

    public void removeFileOrFolder(Item item) {
        listOfItens.remove(item);
    }

    public int countItens() {
        return listOfItens.size();
    }
}
