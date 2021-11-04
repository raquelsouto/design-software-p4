import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Item {

    private long size;
    private String name;

    public Item(long size, String name) {
        this.size = size;
        this.name = name;
    }
}
