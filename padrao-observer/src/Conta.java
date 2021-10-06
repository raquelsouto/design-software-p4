import java.util.ArrayList;
import java.util.List;

public class Conta {

    private int agencia;
    private int conta;
    private String titular;
    private double saldo;
    private String telefone;

    private List<FinanceirasParceiras> observerCollection = new ArrayList<FinanceirasParceiras>();

    public Conta(int agencia, int conta, String titular, String telefone) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.telefone = telefone;
    }

    public Conta(int agencia, int conta, String titular, String telefone, double saldo) {
        this(agencia,conta,titular,telefone);
        this.saldo = saldo;
    }

    public void registrarFinanceiraParceira(FinanceirasParceiras novaParceira) {
        observerCollection.add(novaParceira);
    }

    public void desregistrarFinanceiraParceira(FinanceirasParceiras novaParceira) {
        observerCollection.remove(novaParceira);
    }

    public void depositar(double montante) {
        if (montante > 0) {
            saldo += montante;
        }
    }

    public void sacar(double montante) {
        if(montante > 0) {
            saldo -= montante;
        }
        if(saldo < 0) {
            for (FinanceirasParceiras parceira : observerCollection) {
                parceira.novoDevedor(titular, telefone, saldo);
            }
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTitular() {
        return titular;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
