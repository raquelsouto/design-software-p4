
public class Main {

    public static void main(String[] args) {
        
        DataPersistence bd = new MySqlBancoDeDados();
        bd.enviarComandos("Select * FROM xx WHERE x = 1");

        
        DataPersistence bd2 = new MongoDBPersistence();
        bd.enviarComandos("SELECT 1=1");
    }

}
