package questao03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Shikamaru", new BigDecimal("10000"));
        Funcionario desenvolvedor = new Desenvolvedor("Zuko", new BigDecimal("6000"));

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);

        for(Funcionario funcionario : funcionarios) {
            System.out.println("Funcionários: " + funcionario.getNome());
            System.out.println("Salários: " + funcionario.getSalario());
            System.out.println("Bônus: " + funcionario.bonus());
            System.out.println("---------------------------------------");
        }
    }
}
