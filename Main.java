import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criação de produtos e validade
    	Produto arroz = new ProdutoValidade("Arroz", 10.0, false);
    	Produto feijao = new ProdutoValidade("Feijão", 4.0, false);
        //Produto macarrao = new ProdutoValidade("Macarrão", 5.0, false);
       // Produto alface = new ProdutoValidade("Alface", 5.0, false);
       // Produto leite = new ProdutoValidade("Leite", 4.0, false);
        //Produto iogurte = new ProdutoValidade("Iogurte", 3.75, true);
       

        // Criação de produtos com fornecedor
        ProdutoFornecedor carne = new ProdutoFornecedor("Carne", 40.0, "Friboi");
        ProdutoFornecedor frango = new ProdutoFornecedor("Frango", 25.0, "Seara");
        //ProdutoFornecedor porco = new ProdutoFornecedor("Porco", 35.0, "Fornecedor B");

        // Criação do estoque e adição de produtos
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(arroz);
        estoque.adicionarProduto(feijao);
        //estoque.adicionarProduto(macarrao);
        //estoque.adicionarProduto(alface);
       // estoque.adicionarProduto(leite);
        //estoque.adicionarProduto(iogurte);
        estoque.adicionarProduto(carne);
        estoque.adicionarProduto(frango);
        //estoque.adicionarProduto(porco);

        // Criação do carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(arroz, 2);
        carrinho.adicionarItem(feijao, 3);
        //carrinho.adicionarItem(macarrao, 1);
        //carrinho.adicionarItem(alface, 2);
        //carrinho.adicionarItem(frango, 2);

        // Criação da forma de pagamento
        FormaDePagamento formaDePagamento1 = new FormaDePagamento("Dinheiro");
        FormaDePagamento formaDePagamento2 = new FormaDePagamento("Cartão de crédito");
        FormaDePagamento formaDePagamento3 = new FormaDePagamento("Cartão de débito");
        FormaDePagamento formaDePagamento4 = new FormaDePagamento("Pix");
        
        // Exibição das formas de pagamento disponíveis
        System.out.println("Formas de Pagamento Disponíveis:");
        System.out.println("1. " + formaDePagamento1.getDescricao());
        System.out.println("2. " + formaDePagamento2.getDescricao());
        System.out.println("3. " + formaDePagamento3.getDescricao());
        System.out.println("4. " + formaDePagamento4.getDescricao());
        
        // Leitura da forma de pagamento escolhida pelo usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha a forma de pagamento (1-4): \n");
        int opcaoPagamento = scanner.nextInt();
        System.out.println("\n");

        FormaDePagamento formaDePagamentoEscolhida;

        if (opcaoPagamento == 1) {
            formaDePagamentoEscolhida = formaDePagamento1;
        } else if (opcaoPagamento == 2) {
            formaDePagamentoEscolhida = formaDePagamento2;
        } else if (opcaoPagamento == 3) {
            formaDePagamentoEscolhida = formaDePagamento3;
        } else if (opcaoPagamento == 4) {
            formaDePagamentoEscolhida = formaDePagamento4;
        } else {
            System.out.println("Opção inválida. Usando forma de pagamento padrão do caixa (Dinheiro)\n");
            formaDePagamentoEscolhida = formaDePagamento1;
        }
        // Criação da venda
        Venda venda = new Venda(carrinho, formaDePagamentoEscolhida);

        // Cálculo do total da venda
        double total = venda.calcularTotal();
        System.out.println("Total da compra: R$ " + total);

        // Exibição dos itens do carrinho
        System.out.println("Itens do carrinho:");
        venda.exibirItens();

        // Geração de relatório para o gerente
        System.out.println("Relatório de vendas:");
        estoque.exibirProdutos();

        // Verificação de validade dos produtos no estoque
        System.out.println("Verificação de validade:");
        Produto[] produtosEstoque = estoque.getProdutos();
        for (Produto produto : produtosEstoque) {
            if (produto instanceof ProdutoValidade) {
                ProdutoValidade produtoValidade = (ProdutoValidade) produto;
                if (produtoValidade.isVencido()) {
                    System.out.println("Produto vencido: \n" + produto.getNome());
                }
            }
        }

        // Gerenciamento de fornecedores
        System.out.println("\nGerenciamento de fornecedores:");
        for (Produto produto : estoque.getProdutos()) {
            if (produto instanceof ProdutoFornecedor) {
                ProdutoFornecedor produtoFornecedor = (ProdutoFornecedor) produto;
                System.out.println("Produto: " + produto.getNome() + ", Fornecedor: " + produtoFornecedor.getFornecedor());
            }
        }

        System.out.println("\n");
        scanner.close();
    }
}
