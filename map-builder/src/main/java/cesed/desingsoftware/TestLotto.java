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

        System.out.println("\n");

//        lotto
//                .when()
//                .get("localhost:8080/lotto{id}", 5)
//                .then()
//                .statusCode(200)
//                .body("lotto.lottoId")
//                .equalTo(5, "lotto.winners.winnerId")
//                .hasItem(23, 54);
    }
}
