public class TestAPI {

    private String url;
    private int status;

    public TestAPI get(String url) {
        this.url = url;
        return this;
    }

    public TestAPI then() {
        return this;
    }

    public TestAPI statusCode(int status) throws Exception {
        int fakeCode = 200;
        if (status != fakeCode) {
            throw new Exception();
        }
        return this;
    }

    public TestAPI body()  {
        return this;
    }

    public TestAPI hasParameter(String parameters) throws Exception {
        System.out.println("Chamando o back.. " + parameters);
        return this;
    }

}
