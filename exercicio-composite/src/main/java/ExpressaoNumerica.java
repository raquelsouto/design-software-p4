import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ExpressaoNumerica {

    private int valor;

    public abstract int resolverExpressaoNumerica();

}
