import lombok.Data;

@Data
public abstract class Carro {

    private String modelo;
    private int numeroPortas;
    private String cor;
    private double motor;
    private int ano;
    private double valor;

    public Carro(String modelo, int numeroPortas, String cor, double motor, int ano, double valor) {
        this.modelo = modelo;
        this.numeroPortas = numeroPortas;
        this.cor = cor;
        this.motor = motor;
        this.ano = ano;
        this.valor = valor;
    }

}
