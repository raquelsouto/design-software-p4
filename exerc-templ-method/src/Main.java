public class Main {

    public static void main(String[] args) {

        System.out.println("Imposto Municipal");
        ImpostoMunicipal impostom = new ImpostoMunicipal("PillowTop Queen", 500);

        double impostoProd1 = impostom.calculaImposto(500);
        System.out.println("Valor total final: R$ " + impostoProd1 + "\n");

        System.out.println("Imposto Estadual");
        ImpostoEstadual impostoe = new ImpostoEstadual("Jogo de taças", 80.0);

        double impostoProd2 = impostoe.calculaImposto(80.0);
        System.out.println("Valor total final: R$ " + impostoProd2 + "\n");

        System.out.println("Imposto Total sobre um produto");
        Imposto imposto = new Imposto("Camisa masculina", 120);

        double impostoTotal = imposto.calculaImposto(120);
        System.out.println("Valor total final: R$ " + impostoTotal + "\n");

    }

}
