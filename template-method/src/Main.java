public class Main {

    public static void main(String[] args) {

        Item item1 = new Item("celular", 1500);
        Item item2 = new Item("travesseiro", 180);

        TemplateMethodImposto templateIcpp = new Icpp(1500, item1);

        TemplateMethodImposto templateIkcv = new Ikcv(120, item2);

        System.out.println("ICPP\n");
        boolean r1 = templateIcpp.calcularImpostoMaximo(5000, item1);
        System.out.println(r1);
        double v1 = templateIcpp.calculaImpostoAlto(5000, item1);
        System.out.printf("Imposto R$ " + "%.2f", v1);

        System.out.println();

        boolean r2 = templateIcpp.calcularImpostoMaximo(100, item1);
        System.out.println(r2);
        double v2 = templateIcpp.calculaImpostoBaixo(100, item1);
        System.out.printf("Imposto R$ " + "%.2f", v2);

        System.out.println("\n");

        System.out.println("IKCV");
        boolean r3 = templateIkcv.calcularImpostoMaximo(3600, item2);
        System.out.println(r3);
        double v3 = templateIkcv.calculaImpostoAlto(360, item2);
        System.out.printf("Imposto R$ " + "%.2f", v3);
        System.out.println("\n");

        boolean r4 = templateIkcv.calcularImpostoMaximo(1000, item2);
        System.out.println(r4);
        double v4 = templateIkcv.calculaImpostoAlto(1000, item2);
        System.out.printf("Imposto R$ " + "%.2f", v4);
        System.out.println("\n");

        boolean r5 = templateIkcv.calcularImpostoMaximo(600, item2);
        System.out.println(r4);
        double v5 = templateIkcv.calculaImpostoBaixo(660, item2);
        System.out.printf("Imposto R$ " + "%.2f", v5);
    }

}
