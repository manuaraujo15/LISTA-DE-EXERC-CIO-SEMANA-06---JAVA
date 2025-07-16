public class ImovelNovo extends Imovel {

    public ImovelNovo(Endereco endereco, double preco) {
        super(endereco, preco);
    }

    @Override
    public double calcularValorImovel() {
        // Imóvel novo tem um acréscimo de 10%
        return preco * 1.10;
    }
}
