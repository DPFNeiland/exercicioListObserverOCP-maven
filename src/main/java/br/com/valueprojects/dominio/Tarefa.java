package br.com.valueprojects.dominio;

public class Tarefa {
    private int idTarefa;
    private String descricaoTarefa;
    private double metricaTarefa;


    public Tarefa(int idTarefa, String descricaoTarefa, double metricaTarefa) {
        this.idTarefa = idTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.metricaTarefa = metricaTarefa;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public double getMetricaTarefa() {
        return metricaTarefa;
    }

    public void setMetricaTarefa(double metricaTarefa) {
        this.metricaTarefa = metricaTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "idTarefa=" + idTarefa +
                ", descricaoTarefa='" + descricaoTarefa + '\'' +
                ", metricaTarefa=" + metricaTarefa +
                '}';
    }
}
