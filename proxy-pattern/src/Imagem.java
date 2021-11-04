public class Imagem implements Grafico {

    private int altura = 15;
    private int largura = 21;
    private String caminho;
    private int binarioImagem;

    public Imagem(String caminho) {
        this.caminho = caminho;
    }

    @Override
    public int getAltura() {
        return altura;
    }

    @Override
    public int getLargura() {
        return largura;
    }

    @Override
    public String getCaminho() {
        return caminho;
    }

    @Override
    public void desenharImagem() {
        System.out.println("Desenhando a imagem " + caminho);
    }
}
