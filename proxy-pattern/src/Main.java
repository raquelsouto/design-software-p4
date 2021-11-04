public class Main {

    public static void main(String[] args) {

        Grafico graph = new ImagemProxy("C:/testes.jpeg");
        graph.desenharImagem();
        System.out.println("Alura da imagem: " + graph.getAltura() + " cm");
        System.out.println("Largura da imagem " + graph.getLargura() + " cm");
    }
}
