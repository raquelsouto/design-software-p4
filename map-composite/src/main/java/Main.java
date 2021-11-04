public class Main {

    public static void main(String[] args) {

        System.out.println("Criando uma pasta..");
        Folder pasta1 = new Folder(123, "arq-raquel");
        Folder pasta2 = new Folder(451, "atividades");

        System.out.println("Criando um arquivo..");
        File arquivo1 = new File(895, "att-1", "task.png.icon");
        File arquivo2 = new File(145, "att-2", "task2.png.icon");

        pasta1.addFileOrFolder(pasta2);
        pasta1.addFileOrFolder(arquivo1);
        pasta1.addFileOrFolder(arquivo2);
        //Fazendo uma contagem
        int qtdd = pasta1.countItens();
        System.out.println("Quantidade de itens em pasta1: " + qtdd);

        System.out.println("Após remoção de um arquivo.. realizando recontagem");
        pasta1.removeFileOrFolder(arquivo1);
        //Fazendo uma contagem
        int qtdd2 = pasta1.countItens();
        System.out.println("Quantidade de itens em pasta1: " + qtdd2 + "\n");

        pasta2.addFileOrFolder(arquivo1);

        //Fazendo uma contagem
        int qtdd3 = pasta2.countItens();
        System.out.println("Quantidade de itens em pasta2: " + qtdd3);
    }
}
