public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return rua + ", " + numero + " - " + bairro + ", " + cidade + " - " + estado;
    }
}
