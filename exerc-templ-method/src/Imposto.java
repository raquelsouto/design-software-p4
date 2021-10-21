public class Imposto {

    private String nomeProduto;
    private double valorProduto;

    public Imposto(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public double calculaImposto(double valorProduto) {
        return ImpostoMunicipal.IMPOSTO_ITPU + ImpostoMunicipal.IMPOSTO_ITCMD + ImpostoMunicipal.IMPOSTO_ICVV + ImpostoMunicipal.IMPOSTO_ICTU;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

}
