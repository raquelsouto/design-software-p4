public class RetanguloAdapter extends Retangulo {

    Retangulo retangulo = new Retangulo();

    public void desenharRetangulo(int coordSupEsqX, int coordSupEsqY, int coordInfDirX, int coordInfDirY) {
        retangulo.desenharRetangulo(coordSupEsqX, coordSupEsqY, Math.abs(coordSupEsqY - coordInfDirY), Math.abs(coordInfDirX - coordSupEsqX));
    }

}
