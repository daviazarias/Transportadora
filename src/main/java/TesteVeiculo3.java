import encapsulamento.versao3.Veiculo;
import java.util.Scanner;

public class TesteVeiculo3 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean sucesso;

        System.out.print("Insira a carga máxima do veículo: ");
        double cargaMaxima = sc.nextDouble();
        Veiculo veiculo = new Veiculo(cargaMaxima);
        System.out.println("Criando um veículo com carga máxima de " + cargaMaxima + " kg");

        do {
            System.out.print("Insira o peso da caixa a adicionar: ");
            double peso = sc.nextDouble();
            sucesso = veiculo.adicionarCaixa(peso);
            System.out.println("Adicionando caixa (" + peso + "kg) : " + sucesso);
        } while (sucesso);

        System.out.println("A carga do veículo é: " + veiculo.getCarga() + " kg");
    }
}
