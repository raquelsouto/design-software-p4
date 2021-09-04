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
        log.info("Chamando a url: " + url + " com id = " + id);
        return this;
    }

    public Lotto then() {
        return this;
    }

    public Lotto when() {
        return this;
    }

    public Lotto body(String url) {
        log.info("Chamando a url: " + url);
        return this;
    }

    public Lotto statusCode(int status) throws UnsatisfiedRestrictionException {
        int codigoFake = 200;

        if (codigoFake != status) {
            throw new UnsatisfiedRestrictionException("Status esperado: " + codigoFake + "\n Status recebido: " + status);
        }
        log.info("statusCode esperado é o mesmo do recebido");
        return this;
    }

    public Lotto equalTo(int id, String url) throws UnsatisfiedRestrictionException {
        int idFake = 5;
        String endpoint = "lotto.winners.winnerId";

        if(id == idFake && endpoint.equals(url)) {
            log.info("Id e url esperado são os mesmos do recebido");
            return this;
        }
        throw new UnsatisfiedRestrictionException("Id esperado: " + idFake + " Id recebido: " + id
                + " \n Url esperado: " + endpoint + " Url recebido: " + url);
    }

    public Lotto hasItem(int idVitorias, int vitorias) throws UnsatisfiedRestrictionException {
        int idFake = 23;
        int vitoriasFake = 54;

        if(idVitorias == idFake && vitorias == vitoriasFake) {
            log.info("OK!");
            return this;
        }
        throw new UnsatisfiedRestrictionException("Id de vitórias esperado: " + idFake + " Id de vitórias recebido: " + id +
                                    "\nN úmero de vitórias esperada: " + vitoriasFake + " Número de vitórias recebida: " + vitorias);

    }
}
