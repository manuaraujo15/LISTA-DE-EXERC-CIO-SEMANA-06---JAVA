import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Imovel[] imoveis = new Imovel[200];

        System.out.println("=== Cadastro de Imóveis ===");

        for (int i = 0; i < imoveis.length; i++) {
            System.out.println("\nCadastro do " + (i + 1) + "º imóvel:");

            System.out.print("Rua: ");
            String rua = sc.nextLine();
            System.out.print("Número: ");
            int numero = Integer.parseInt(sc.nextLine());
            System.out.print("Bairro: ");
            String bairro = sc.nextLine();
            System.out.print("Cidade: ");
            String cidade = sc.nextLine();
            System.out.print("Estado: ");
            String estado = sc.nextLine();
            System.out.print("Preço base: ");
            double preco = Double.parseDouble(sc.nextLine());

            Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado);

            // Alterna entre ImovelNovo e ImovelVelho
            if (i % 2 == 0) {
                imoveis[i] = new ImovelNovo(endereco, preco);
            } else {
                imoveis[i] = new ImovelVelho(endereco, preco);
            }
        }

        System.out.println("\n=== VALORES FINAIS DOS IMÓVEIS ===");
        for (int i = 0; i < imoveis.length; i++) {
            System.out.printf("\nImóvel %d:\n", i + 1);
            System.out.println("Endereço: " + imoveis[i].getEndereco());
            System.out.printf("Valor Final: R$ %.2f\n", imoveis[i].calcularValorImovel());
        }

        sc.close();
    }
}
