package cesed.desingsoftware;

import cesed.desingsoftware.exceptions.UnsatisfiedRestrictionException;

public class TestLotto {

    public static void main(String[] args) throws UnsatisfiedRestrictionException {

        LottoBuilder lottoBuilder = new LottoBuilder();

        Lotto lotto = lottoBuilder
                .when()
                    .get("localhost:8080/lotto{id}", 5)
                .then()
                    .statusCode(200)
                    .body("lotto.lottoId", lottoBuilder.equalTo(5),
                          "lotto.winners.winnerId", lottoBuilder.hasItems(23, 54));

        System.out.println(lotto+ "\n");

        Lotto lotto2 = lottoBuilder
                .when()
                    .get("localhost:8080/lotto{id}", 4)
                .then()
                    .statusCode(200)
                    .body("lotto.lottoId", lottoBuilder.equalTo(5),
                          "lotto.winners.winnerId", lottoBuilder.hasItems(23, 54));

        System.out.println(lotto2+ "\n");
    }
}
