import cesed.desingsoftware.Lotto;
import cesed.desingsoftware.LottoBuilder;
import cesed.desingsoftware.exceptions.UnsatisfiedRestrictionException;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LottoBuilderTeste {

    private LottoBuilder lottoBuilder;

    @BeforeEach
    public void setup() {
        lottoBuilder = new LottoBuilder();
    }

    @Test
    public void testeParaCriarUmLotto() throws UnsatisfiedRestrictionException {
        Lotto lotto = lottoBuilder
                .when()
                    .get("localhost:8080/lotto{id}", 5)
                .then()
                    .statusCode(200)
                    .body("lotto.lottoId", lottoBuilder.equalTo(5),
                        "lotto.winners.winnerId", lottoBuilder.hasItems(23, 54));

        Assert.assertEquals("localhost:8080/lotto{id}", lotto.getUrl());
        Assert.assertEquals(5, lotto.getId());
        Assert.assertEquals(200, lotto.getStatusCode());
    }

}
