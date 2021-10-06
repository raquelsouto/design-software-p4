public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta(123,14513,"Raquel Winkeler","(83)99898-2526");
        conta.depositar(1600);
        conta.registrarFinanceiraParceira(new BVFinanceira());
        conta.registrarFinanceiraParceira(new WinkelerCred());

        conta.sacar(2000);
        System.out.println(conta.getSaldo());
    }

}
