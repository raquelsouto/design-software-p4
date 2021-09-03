package cesed.desingsoftware;

import cesed.desingsoftware.exceptions.UnsatisfiedRestrictionException;

public class TestLotto {

    public static void main(String[] args) throws UnsatisfiedRestrictionException {

        Lotto lotto = new Lotto();

        lotto
                .when()
                .get("localhost:8080/lotto{id}", 5)
                .then()
                .statusCode(200)
                .body("lotto.lottoId")
                .equalTo(2, "lotto.winners.winnerId")
                .hasItem(23, 54);

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
