public class Venda {
    private CarrinhoDeCompras carrinho;
    private FormaDePagamento formaDePagamento;
   
    public Venda(CarrinhoDeCompras carrinho, FormaDePagamento formaDePagamento) {
        this.carrinho = carrinho;
        this.formaDePagamento = formaDePagamento;
    }
   
    public double calcularTotal() {
        return carrinho.calcularTotal();
    }
   
    public void exibirItens() {
        carrinho.exibirItens();
    }
   
    // Getter e Setter para CarrinhoDeCompras
    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }
   
    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }
   
    // Getter e Setter para FormaDePagamento
    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }
   
    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}   