public class Main {

    public static void main(String[] args) {

        SistemaAlarme alarme = new SistemaAlarme("Presença");
        alarme.registrarQuemAcionar(new CompanhiaDeSeguro());
        alarme.registrarQuemAcionar(new DelegaciaDePolicia());

        alarme.detectarMovimento();

    }
}
