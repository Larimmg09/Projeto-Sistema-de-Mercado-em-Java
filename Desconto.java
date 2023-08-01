public class Desconto {
    public static double aplicarDesconto(double preco, double percentualDesconto) {
        double desconto = (percentualDesconto / 100) * preco;
        return preco - desconto;
    }
}
