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
        double novaCarga = carga + quilosParaNewtons(peso);

        if(novaCarga > cargaMaxima)
            return false;

        carga = novaCarga;
        return true;
    }

    private double newtonsParaQuilos(double peso){
        return peso * 9.8;
    }

    private double quilosParaNewtons(double peso){
        return peso / 9.8;
    }
}
