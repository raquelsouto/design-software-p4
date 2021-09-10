package cesed.desingsoftware;

import cesed.desingsoftware.exceptions.UnsatisfiedRestrictionException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.logging.Logger;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Lotto {

    private String url;
    private int id;
    private int statusCode;

    public static final Logger log = Logger.getLogger(Lotto.class.getName());

    public Lotto get(String url, int id) {
        this.id = id;
        this.url = url;
        return this;
    }

    public Lotto then() {
        return this;
    }

    public Lotto when() {
        return this;
    }

    public Lotto body(String idJsonField, Boolean eqToId, String winnersIdJsonField, Boolean winnersHasItens) throws UnsatisfiedRestrictionException {
        String winnersEndpoint = "lotto.winners.winnerId";
        String lottoIdEndpoint = "lotto.lottoId";

        if (!lottoIdEndpoint.equals(idJsonField)) {
            log.info("idJsonField is incorrect!");
            throw new UnsatisfiedRestrictionException();
        }

        if (!winnersEndpoint.equals(winnersIdJsonField)) {
            log.info("winnersIdJsonField is incorrect!");
            throw new UnsatisfiedRestrictionException();
        }
        return this;
    }

    public Lotto statusCode(int status) throws UnsatisfiedRestrictionException {
        if (status < 0) {
            log.info("Status must be a positive value!");
            throw new UnsatisfiedRestrictionException();
        }
        int fakeCode = 200;

        if (fakeCode != status) {
            throw new UnsatisfiedRestrictionException("Status expected: " + fakeCode + " Status received: " + status);
        }
        this.statusCode = status;
        log.info("statusCode set!");
        return this;
    }

    public Boolean equalTo(int id) throws UnsatisfiedRestrictionException {
        if(id != this.id) {
            log.warning("Id is not equal to parameter!");
            return false;
        }

        log.info("Id is equal to parameter!");
        return true;
    }

    public Boolean hasItems(int item1, int item2) throws UnsatisfiedRestrictionException {
        int item1Fake = 23;
        int item2Fake = 54;

        if (item1 != item1Fake && item2 != item2Fake) {
            log.warning("One or both items were not found!");
            return false;
        }

        log.info("Body has all itens!");
        return true;
    }
}
