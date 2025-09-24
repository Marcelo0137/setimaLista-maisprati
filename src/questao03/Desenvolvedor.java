package questao03;

import java.math.BigDecimal;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal bonus() {
        return salario.multiply(new BigDecimal("0.20"));
    }
}
