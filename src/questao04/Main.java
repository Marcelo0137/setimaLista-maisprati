package questao04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MeioTransporte> meioDeTransporte = new ArrayList<>();

        meioDeTransporte.add(new Carro());

        for (MeioTransporte transporte : meioDeTransporte) {
            try {
                transporte.acelerar();
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
