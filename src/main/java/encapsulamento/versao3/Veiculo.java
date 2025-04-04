package encapsulamento.versao3;

public class Veiculo {
    private double carga;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = quilosParaNewtons(cargaMaxima);
    }

    public double getCarga() {
        return newtonsParaQuilos(carga);
    }

    public double getCargaMaxima() {
        return newtonsParaQuilos(cargaMaxima);
    }

    public boolean adicionarCaixa(double peso){
        peso = quilosParaNewtons(peso);
        if(carga + peso <= cargaMaxima){
            carga += peso;
            return true;
        }
        return false;
    }

    private double newtonsParaQuilos(double peso){
        return 9.8 * peso;
    }

    private double quilosParaNewtons(double peso){
        return peso / 9.8;
    }
}
