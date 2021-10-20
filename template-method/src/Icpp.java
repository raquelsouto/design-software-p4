public class Icpp extends Imposto {

    public Icpp(double orcamento, Item item) {
        super(orcamento, item);
    }

    public double calculaImposto(double orcamento, Item item) {
        if(orcamento > 500) {
            return orcamento * 0.07;
        }
        return orcamento * 0.05;
    }

}
