import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Data
public class Operacao extends ExpressaoNumerica {

    private int primeiroValor;
    private String operador;
    private int segundoValor;
    List<ExpressaoNumerica> listaDeExpressaoNumerica = new ArrayList<ExpressaoNumerica>();

    public static final Logger log = Logger.getLogger(Operacao.class.getName());

    public Operacao(int primeiroValor, String operador, int segundoValor) {
        super();
        this.primeiroValor = primeiroValor;
        this.operador = operador;
        this.segundoValor = segundoValor;
    }

    @Override
    public int resolverExpressaoNumerica() {
        switch (operador) {
            case "+":
                return this.primeiroValor + this.segundoValor;
            case "-":
                return this.primeiroValor - this.segundoValor;
            case "*":
                return this.primeiroValor * this.segundoValor;
            case "/":
                return this.primeiroValor / this.segundoValor;
            default:
                log.warning("Expressão inválida. Por favor, tente novamente");
                return 0;
        }
    }

}
