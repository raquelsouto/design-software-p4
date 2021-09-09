package cesed.desingsoftware;

import cesed.desingsoftware.exceptions.UnsatisfiedRestrictionException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.logging.Logger;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Lotto {

    private String url = "";
    private int id = 0;
    private int statusCode = 0;

    public static final Logger log = Logger.getLogger(Lotto.class.getName());

    public void setStatusCode(int status) throws UnsatisfiedRestrictionException {
        int fakeCode = 200;

        if (fakeCode != status) {
            throw new UnsatisfiedRestrictionException("Status esperado: " + fakeCode + "\n Status recebido: " + status);
        }

        this.statusCode = status;
        log.info("statusCode esperado é o mesmo do recebido");
    }

}
