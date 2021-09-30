public class CarroFactory {

    public Carro obterCarro(int anoInicio, int anoFim, double orcamento) {
        //TODO: regra de negócio para definir qual carro comprar.

        Carro carroSugerido = null;
        carroSugerido = new Celta("Celta spirit", 4, "azul", 1.0, 2012, 10000);

        return carroSugerido;
    }

}
