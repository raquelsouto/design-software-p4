
public class DSL {

    private String tabela;
    private String condicao;

    public DSL select() {
        return this;
    }

    public DSL from(String tabela) {
        this.tabela = tabela;
        return this;
    }

    public DSL where(String condicao) {
        this.condicao = condicao;
        return this;
    }

    public void fetch() {
        String consulta = "SELECT * FROM" + tabela + " WHERE " + condicao;
        System.out.println("executando a consulta..");
    }

}
