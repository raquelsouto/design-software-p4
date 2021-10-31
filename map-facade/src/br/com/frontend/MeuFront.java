package br.com.frontend;

import br.com.backend.FacadeTransaction;

public class MeuFront {

    public static void main(String[] args) {

        FacadeTransaction.pagarNoDebito(200);
        FacadeTransaction.pagarNoCredito(123,"Raquel", 120, 006 );
        FacadeTransaction.fazerTransferencia(123, 456, 180);

    }
}
