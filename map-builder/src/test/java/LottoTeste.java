import cesed.desingsoftware.Lotto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LottoTeste {

    private Lotto lotto;

    @BeforeEach
    public void setup() {
        lotto = new Lotto("/lotto/{id}", 5, 200);
        lotto = new Lotto("/lotto/{id}", 5, 200);
    }

    @Test
    public void getStatusCode() {
        int codigo = 200;
        assertEquals(codigo, lotto.getStatusCode());
    }

    @Test
    public void getUrl() {
        String url = "/lotto/{id}";
        assertEquals(url, lotto.getUrl());
    }

    @Test
    public void getId() {
        int id = 5;
        assertEquals(id, lotto.getId());
    }
}
