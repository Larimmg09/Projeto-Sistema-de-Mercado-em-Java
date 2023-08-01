public class ProdutoValidade extends Produto {
    private boolean vencido;

    public ProdutoValidade(String nome, double preco, boolean vencido) {
        super(nome, preco);
        this.vencido = vencido;
    }

    public boolean isVencido() {
        return vencido;
    }

    public void setVencido(boolean vencido) {
        this.vencido = vencido;
    }
}

