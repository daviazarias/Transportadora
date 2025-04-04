import encapsulamento.versao3.Veiculo;
import java.util.Scanner;

public class TesteVeiculo3 {

    private static final Scanner sc = new Scanner(System.in);

    private static void adicionarCaixa(Veiculo veiculo, int num){
        System.out.print("Insira o peso da caixa a adicionar: ");
        double peso = sc.nextDouble();
        System.out.println("Adicionando caixa número " + num + " (" + peso + "kg) : "
                + veiculo.adicionarCaixa(peso));
    }

    public static void main(String[] args) {

        System.out.print("Insira a carga máxima do veículo: ");
        double cargaMaxima = sc.nextDouble();
        System.out.println("Criando um veículo com carga máxima de " + cargaMaxima + " kg");
        Veiculo veiculo = new Veiculo(cargaMaxima);

        for(int i = 1; i <= 5; i++)
            adicionarCaixa(veiculo,i);

        System.out.println("A carga do veículo é: " + veiculo.getCarga() + " kg");
    }
}
