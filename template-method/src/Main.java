public class Main {

    public static void main(String[] args) {

        Item item1 = new Item("celular", 1500);
        Item item2 = new Item("travesseiro", 180);

        Icpp icpp = new Icpp(1500, item1);
        Ikcv ikcv = new Ikcv(120, item2);

        System.out.println("ICPP");
        double resultado1 = icpp.calculaImposto(1500, item1);
        System.out.printf("Imposto R$ " + "%.2f", resultado1);

        System.out.println();
        double resultado2 = icpp.calculaImposto(10000, item1);
        System.out.printf("Imposto R$ " + "%.2f", resultado2);

        System.out.println("\n");

        System.out.println("IKCV");
        double result = ikcv.calculaImposto(360, item2);
        System.out.printf("Imposto R$ " + "%.2f", result);

        System.out.println();
        double result2 = ikcv.calculaImposto(4500, item1);
        System.out.printf("Imposto R$ " + "%.2f", result2);
    }

}
