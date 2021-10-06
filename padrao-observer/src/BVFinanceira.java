public class BVFinanceira implements FinanceirasParceiras {

    @Override
    public void novoDevedor(String titular, String telefone, double valorDevedor) {
        System.out.println("BVFinanceira Ligando para " + titular + " no telefone " + telefone + ". O valor da dívida é R$ " + valorDevedor);
    }
}
