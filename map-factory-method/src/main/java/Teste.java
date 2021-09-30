public class Teste {

    public static void main(String[] args) {

        CarroFactory factory = new CarroFactory();

        Carro  carroSugerido = factory.obterCarro(2010, 2020, 15000);
        System.out.println(carroSugerido);

    }

}
