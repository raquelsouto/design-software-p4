
public class MongoDBPersistence implements DataPersistence {

    @Override
    public void enviarComandos(String sql) {
        
        System.out.println("Enviando o comando " + sql + " para o MongoDB");
        System.out.println(sql);
        
    }

}
