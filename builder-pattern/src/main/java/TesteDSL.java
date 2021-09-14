public class TesteDSL {

    public static void main(String[] args) throws Exception {

        DSL consulta = new DSL();

        consulta
                .select()
                .from("USUARIO")
                .where("USUARIO = 'RAQUEL'")
                .fetch();

        TestAPI api = new TestAPI();

        api
                .get("http://localhost:8080/user")
                .then().hasParameter("/produto")
                .statusCode(200);

//        api
//                .get("http://localhost:8080/produto")
//                .then()
//                .body()
//                .hasParameter("user");

    }
}

