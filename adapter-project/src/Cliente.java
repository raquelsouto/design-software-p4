public class Cliente implements IRetangulo {

    @Override
    public void desenharRetangulo(int coordSupEsqX, int coordSupEsqY, int coordInfDirX, int coordInfDirY) {
        RetanguloAdapter retanguloAdapter = new RetanguloAdapter();
        retanguloAdapter.desenharRetangulo(coordSupEsqX, coordSupEsqY, coordInfDirX, coordInfDirY);
    }
}
