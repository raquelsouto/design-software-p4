public class ImagemProxy implements Grafico {

    private int altura;
    private int largura;
    private String caminho;
    private Imagem imagem;

    public ImagemProxy(String caminho) {
        this.caminho = caminho;
    }

    @Override
    public int getAltura() {
        if (imagem == null) {
            return altura;
        }
        return imagem.getAltura();
    }

    @Override
    public int getLargura() {
        return imagem.getLargura();
    }

    @Override
    public String getCaminho() {
        return imagem.getCaminho();
    }

    @Override
    public void desenharImagem() {
        if (imagem == null) {
            imagem = new Imagem(caminho);
        }
        imagem.desenharImagem();
    }
}
