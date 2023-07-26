# Sistema de Mercado em Java

## DESCRIÇÃO
O projeto consiste na implementação de um sistema de supermercado com o intuito de gerenciar a operação de varejo ou atacado. Seu objetivo é administrar a frente de caixa, funcionários e estoque, gerenciar toda a operação, além de automatizar tarefas do backoffice.

## TÓPICOS ESCOLHIDOS PARA IMPLEMENTAÇÃO
- Abstração
- Java Collections
- Polimorfismo Dinâmico

## CLASSES
*Main:* possui os testes padrão para o funcionamento e teste das classes;

*Pessoa:* possui os atributos principais de uma pessoa (nome e cpf) e um método para exibir esses atributos (exibirDados);

*Funcionario:* essa classe estende a classe Pessoa e possui um atributo (salario), sendo exibida a partir do método exibirDados criado na classe Pessoa;

*Gerente:* é um tipo de pessoa, então também estende a classe Pessoa. Possui um atributo (departamento: qual o tipo de departamento que este gerente gerencia), sendo exibido a partir do método exibirDados criado na classe Pessoa;

*Cliente:* é um tipo de pessoa, então também estende a classe Pessoa. Possui um atributo (endereco: indica o endereço do cliente), também sendo exibido através do método exibirDados criado na classe Pessoa; 

*Produto:* esta classe armazena cada tipo de produto que o mercado possui, seus atributos são nome e preco. E não possui nenhuma função.

*Estoque:* esta classe armazena todos os produtos do mercado em uma lista do pacote List e ArrayList do java Collections. Possui as seguintes funções: adiciona um novo produto no estoque (adicionarProduto) e remove um produto (removerProduto) e também é exibida através do método exibirDados;

*Desconto:* esta classe permite aplicar um desconto na compra de um produto, seu método é estático e é contabilizado através de um percentual de desconto;

*CarrinhoDeCompras:* esta classe permite armazenar produtos em um carrinho do tipo Map/HashMap, que permite armazenar chaves e atribuir valores a elas. Tem como funções: adicionarItem (adiciona um item ao carrinho), removerItem (remove um item do carrinho) e calcularTotal (calcula o total das compras que estão no carrinho), e além disso o método exibirDados;

*FormaDePagamento:* esta classe permite dizer qual será o tipo de pagamento; possui apenas o atributo nome;

*ProdutoFornecedor:* esta classe estende a classe Produto, possui apenas um atributo (fornecedor) que indica qual o tipo de fornecedor de tal produto. Além de já possuir os atributos de Produto;

*ProdutoValidade:* esta classe também estende Produto e indica se determinado produto está vencido ou não; 

*Venda:* esta classe une outras duas classes (CarrinhoDeCompras e FormaDePagamento) e tem como objetivo aplicar um tipo de venda com base nos produtos armazenados no carrinho e a sua forma de pagamento que o cliente escolheu; sua função é indicar o valor da compra e exibir seus itens.

