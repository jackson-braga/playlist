package teste;

public class Pagamento {

    public void pagar(IFormaPagamento formaPagamento) {
        if(formaPagamento != null) {
            formaPagamento.validarPagamento();
            formaPagamento.concluirPagamento();
        }
    }
}
