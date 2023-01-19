package teste;

public class MainTeste {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();

        FormaPagamentoCartaoDebito formaPagamento = new FormaPagamentoCartaoDebito();
        pagamento.pagar(formaPagamento);

        pagamento.pagar(new IFormaPagamento() {
            @Override
            public void validarPagamento() {

            }

            @Override
            public void concluirPagamento() {

            }
        });
    }
}