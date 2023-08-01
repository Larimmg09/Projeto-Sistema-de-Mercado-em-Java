import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Produto, Integer> itens;

    public CarrinhoDeCompras() {
        itens = new HashMap<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.put(produto, quantidade);
    }

    public void removerItem(Produto produto) {
        itens.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<Produto, Integer> entry : itens.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            total += produto.getPreco() * quantidade;
        }
        return total;
    }

    public void exibirItens() {
        for (Map.Entry<Produto, Integer> entry : itens.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + quantidade);
            System.out.println();
        }
    }

    // Getter para itens
    public Map<Produto, Integer> getItens() {
        return itens;
    }
}
