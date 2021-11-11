public class ConstanteNumerica extends ExpressaoNumerica {

    private int valorNumerico;

    public ConstanteNumerica(int valorNumerico) {
        super();
        this.valorNumerico = valorNumerico;
    }

    @Override
    public int resolverExpressaoNumerica() {
        return this.valorNumerico;
    }
}
