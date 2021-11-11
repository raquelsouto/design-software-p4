public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Realizando a soma..");
        Operacao primeiraOperacao = new Operacao(new ConstanteNumerica(5), "+", new ConstanteNumerica(10));
        int resultado = primeiraOperacao.resolverExpressaoNumerica();
        System.out.println("O resultado da expressão é = " + resultado);

        System.out.println("\nRealizando a subtração..");
        Operacao segundaOperacao = new Operacao(new ConstanteNumerica(20), "-", new ConstanteNumerica(10));
        int resultado2 = segundaOperacao.resolverExpressaoNumerica();
        System.out.println("O resultado da expressão é = " + resultado2);

        System.out.println("\nRealizando a multiplicação..");
        Operacao terceiraOperacao = new Operacao(new ConstanteNumerica(9), "-", new ConstanteNumerica(9));
        int resultado3 = terceiraOperacao.resolverExpressaoNumerica();
        System.out.println("O resultado da expressão é = " + resultado3);

        System.out.println("\nRealizando a divisão..");
        Operacao quartaOperacao = new Operacao(new ConstanteNumerica(56), "-", new ConstanteNumerica(4));
        int resultado4 = quartaOperacao.resolverExpressaoNumerica();
        System.out.println("O resultado da expressão é = " + resultado4);

        System.out.println("\nPara uma expressão inválida..");
        Operacao testeOperacao = new Operacao(new ConstanteNumerica(0), ",", new ConstanteNumerica(1));
        int resultado5 = testeOperacao.resolverExpressaoNumerica();
        System.out.println("O resultado da expressão é = " + resultado5);

    }
}
