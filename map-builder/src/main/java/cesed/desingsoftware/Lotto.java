package cesed.desingsoftware;

import cesed.desingsoftware.exceptions.UnsatisfiedRestrictionException;
import lombok.Data;

import java.util.logging.Logger;

@Data
public class Lotto {

    private String url;
    private int id;
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

        if(id != idFake || endpoint != url) {
            throw new UnsatisfiedRestrictionException("Id esperado: " + idFake + "Id recebido: " + id
                                            + " \nUrl esperado: " + endpoint + "Url recebido: " + url);
        }
        log.info("Id e url esperado são os mesmos do recebido");
        return this;
    }

    public Lotto hasItem(int idVitorias, int vitorias) throws UnsatisfiedRestrictionException {
        int idFake = 23;
        int vitoriasFake = 54;

        if(idVitorias != idFake || vitorias != vitoriasFake) {
            throw new UnsatisfiedRestrictionException("Id de vitórias esperado: " + idFake +
                                                        "Id de vitórias recebido: " + id +
                            "\nNúmero de vitórias esperada: " + vitoriasFake + " Número de vitórias recebida: " + vitorias);
        }
        log.info("OK!");
        return this;

    }
}
