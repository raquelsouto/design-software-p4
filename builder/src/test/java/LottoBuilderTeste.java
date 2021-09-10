import cesed.desingsoftware.Lotto;
import cesed.desingsoftware.exceptions.UnsatisfiedRestrictionException;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LottoBuilderTeste {

    private Lotto lotto;

    @BeforeEach
    public void setup() {
        lotto = new Lotto();
    }

    @Test
    public void testeParaCriarUmLotto() throws UnsatisfiedRestrictionException {
        Lotto lotto = new Lotto();

        lotto
                .when()
                    .get("localhost:8080/lotto{id}", 5)
                .then()
                    .statusCode(200)
                    .body("lotto.lottoId", lotto.equalTo(5),
                        "lotto.winners.winnerId", lotto.hasItems(23, 54));

        Assert.assertEquals("localhost:8080/lotto{id}", lotto.getUrl());
        Assert.assertEquals(5, lotto.getId());
        Assert.assertEquals(200, lotto.getStatusCode());
    }
}
