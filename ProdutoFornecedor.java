public class ProdutoFornecedor extends Produto {
    private String fornecedor;

    public ProdutoFornecedor(String nome, double preco, String fornecedor) {
        super(nome, preco);
        this.fornecedor = fornecedor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}