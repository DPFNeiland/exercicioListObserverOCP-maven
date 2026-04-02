package br.com.valueprojects.dominio;

public class EstimativaJava {
    private final double metrica;
    private final double produtividadeDesenvolvedor;

    public EstimativaJava(double metrica, double produtividadeDesenvolvedor) {
        this.metrica = metrica;
        this.produtividadeDesenvolvedor = produtividadeDesenvolvedor;
    }

    public double getMetrica() {
        return metrica;
    }

    public double getProdutividadeDesenvolvedor() {
        return produtividadeDesenvolvedor;
    }

    @Override
    public String toString() {
        return "EstimativaJava{" +
                "metrica=" + metrica +
                ", produtividadeDesenvolvedor" + produtividadeDesenvolvedor +
                '}';
    }
}
