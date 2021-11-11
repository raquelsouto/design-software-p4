public class Main {

    public static void main(String[] args) {

        System.out.println("Realizando a soma..");
        Operacao primeiraOperacao = new Operacao(5, "+", 10);
        int resultado = primeiraOperacao.resolverExpressaoNumerica();
        System.out.println("O resultado da expressão " + primeiraOperacao.getPrimeiroValor() + " + " + primeiraOperacao.getSegundoValor() + " = " + resultado);

        System.out.println("\nRealizando a subtração..");
        Operacao segundaOperacao = new Operacao(20, "-", 10);
        int resultado2 = segundaOperacao.resolverExpressaoNumerica();
        System.out.println("O resultado da expressão " + segundaOperacao.getPrimeiroValor() + " - " + segundaOperacao.getSegundoValor() + " = " + resultado2);

        System.out.println("\nRealizando a multiplicação..");
        Operacao terceiraOperacao = new Operacao(9, "*", 9);
        int resultado3 = terceiraOperacao.resolverExpressaoNumerica();
        System.out.println("O resultado da expressão " + terceiraOperacao.getPrimeiroValor() + " * " + terceiraOperacao.getSegundoValor() + " = " + resultado3);

        System.out.println("\nRealizando a divisão..");
        Operacao quartaOperacao = new Operacao(56, "/", 4);
        int resultado4 = quartaOperacao.resolverExpressaoNumerica();
        System.out.println("O resultado da expressão " + quartaOperacao.getPrimeiroValor() + " / " + quartaOperacao.getSegundoValor() + " = " + resultado4);

        System.out.println("\nPara uma expressão inválida..");
        Operacao testeOperacao = new Operacao(56, ",", 4);
        int resultado5 = testeOperacao.resolverExpressaoNumerica();
        System.out.println("O resultado da expressão " + testeOperacao.getPrimeiroValor() + " , " + testeOperacao.getSegundoValor() + " = " + resultado5 + "\n");

        System.out.println("Primeiro teste da constante");
        ConstanteNumerica constante = new ConstanteNumerica(4);
        int resultConst = constante.resolverExpressaoNumerica();
        System.out.println("Valor inserido: " + resultConst);

        System.out.println("\nSegundo teste da constante");
        ConstanteNumerica constante2 = new ConstanteNumerica(45);
        int resultConst2 = constante2.resolverExpressaoNumerica();
        System.out.println("Valor inserido: " + resultConst2);

    }
}
