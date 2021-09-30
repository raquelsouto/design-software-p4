public class MySqlBancoDeDados implements DataPersistence {

    @Override
    public void enviarComandos(String sql) {
        System.out.println("Enviando o comando " + sql + " para o SGBD MySQL");
        
    }

}
