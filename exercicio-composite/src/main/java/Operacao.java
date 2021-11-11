import lombok.Data;

import java.util.logging.Logger;

@Data
public class Operacao extends ExpressaoNumerica {

    private ExpressaoNumerica primeiroValor;
    private String operador;
    private ExpressaoNumerica segundoValor;

    public static final Logger log = Logger.getLogger(Operacao.class.getName());

    public Operacao(ExpressaoNumerica primeiroValor, String operador, ExpressaoNumerica segundoValor) {
        super();
        this.primeiroValor = primeiroValor;
        this.operador = operador;
        this.segundoValor = segundoValor;
    }

    @Override
    public int resolverExpressaoNumerica()  throws Exception {
        switch (operador) {
            case "+":
                return this.primeiroValor.resolverExpressaoNumerica() + segundoValor.resolverExpressaoNumerica();
            case "-":
                return this.primeiroValor.resolverExpressaoNumerica() - this.segundoValor.resolverExpressaoNumerica();
            case "*":
                return this.primeiroValor.resolverExpressaoNumerica() * this.segundoValor.resolverExpressaoNumerica();
            case "/":
                return this.primeiroValor.resolverExpressaoNumerica() / this.segundoValor.resolverExpressaoNumerica();
            default:
                log.warning("Operador inválido. Por favor, tente novamente");
                throw new Exception();
        }
    }

}
