import lombok.Data;

@Data
public class File extends Item {

    private String icon;

    public File(long size, String name, String icon) {
        super(size, name);
        this.icon = icon;
    }

}
