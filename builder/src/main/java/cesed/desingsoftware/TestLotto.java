package cesed.desingsoftware;

import cesed.desingsoftware.exceptions.UnsatisfiedRestrictionException;

public class TestLotto {

    public static void main(String[] args) throws UnsatisfiedRestrictionException, Exception {

        Lotto lotto = new Lotto();

        lotto
                .when()
                    .get("localhost:8080/lotto{id}", 5)
                .then()
                    .statusCode(200)
                    .body("lotto.lottoId", lotto.equalTo(5),
                          "lotto.winners.winnerId", lotto.hasItems(23, 54));

        System.out.println(lotto+ "\n");

        Lotto lotto2 = new Lotto();

        lotto2
                .when()
                    .get("localhost:8080/lotto{id}", 4)
                .then()
                    .statusCode(200)
                    .body("lotto.lottoId", lotto2.equalTo(5),
                          "lotto.winners.winnerId", lotto2.hasItems(23, 54));

        System.out.println(lotto2+ "\n");
    }
}
