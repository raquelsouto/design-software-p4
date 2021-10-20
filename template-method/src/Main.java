public class Main {

    public static void main(String[] args) {

        Item item1 = new Item("celular", 1500);
        Item item2 = new Item("travesseiro", 180);

        Icpp icpp = new Icpp(1500, item1);
        Ikcv ikcv = new Ikcv(120, item2);


        //ICPP
//        boolean result = icpp.calcularComImpostoMaximo(1500, item1);
//        System.out.println(result);

        double result = icpp.calculaImposto(10000, item1);
        System.out.println(result);


}
