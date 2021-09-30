package br.com.submarino.app.entidades;

public class ConexaoBancoDados {

    private static Connection instance = new Connection();
    /*Maneira 2
    private static Connection instance;*/

    //Apenas a classe consegue instancia-lo
    private ConexaoBancoDados() {
    }

    /*por causa do static, pode-se chamar o método sem precisar instanciar a classe ConexaoBancoDados
    é o ponto de acesso global*/
    public static Connection getInstance() {
        /*Maneira 2: se o objeto for nulo, cria uma instância de conexão.
        if (instance == null) {
             return new Connection()*/
        return instance;
    }
}