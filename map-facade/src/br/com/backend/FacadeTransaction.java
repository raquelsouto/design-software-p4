package br.com.backend;

public class FacadeTransaction {

    public static void fazerTransferencia(int codigoOrigem, int contaDestino, double montante) {
        RealizarTransferencia.fazerTransferencia(codigoOrigem, contaDestino, montante);
    }

    public static void pagarNoDebito(double montante) {
        PagamentoDebitoTransaction.pagarNoCredito(montante);
    }

    public static void pagarNoCredito(int numeroCartao, String titular, double montante, int cvc) {
        PagementoCreditoTransaction.pagarNoCredito(numeroCartao, titular, montante, cvc);
    }


}
