public class ImovelVelho extends Imovel {

    public ImovelVelho(Endereco endereco, double preco) {
        super(endereco, preco);
    }

    @Override
    public double calcularValorImovel() {
        // Imóvel velho tem um desconto de 15%
        return preco * 0.85;
    }
}
