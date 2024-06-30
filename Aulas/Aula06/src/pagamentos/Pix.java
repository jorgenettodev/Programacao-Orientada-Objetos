package pagamentos;

import java.time.LocalDate;

public class Pix implements FormaPagamento{
    private String chave;
    private double valor;
    private String data = LocalDate.now().toString();

    public void receberPagamento(String chave, double valor) {
        this.chave = chave;
        this.valor = valor;

    }

    public double reembolsar(){
        return 0.0;
    }

    public String emitirComprovante() {
        return "";
    }
}
