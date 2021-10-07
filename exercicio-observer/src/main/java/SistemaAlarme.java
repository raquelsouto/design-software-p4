import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SistemaAlarme {

    private String tipoSensor;
    private List<Sensor> sistemas = new ArrayList<Sensor>();

    public SistemaAlarme(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public void registrarQuemAcionar(Sensor sistema) {
        sistemas.add(sistema);
    }

    public void desregistrarQuemAcionar(Sensor sistema) {
        sistemas.remove(sistema);
    }

    public void detectarMovimento() {
        for (Sensor sensores : sistemas) {
            sensores.acionarEmpresas();
        }
    }


}
