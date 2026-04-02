package br.com.valueprojects.dominio;

import br.com.valueprojects.service.InterfaceDesenvolvedor;

import java.util.List;

public class CriadorEstimativaJava {
    private final List<AcoesDepoisEstimativa> acoes;
    private final InterfaceDesenvolvedor desenvolvedor;

    public CriadorEstimativaJava(InterfaceDesenvolvedor desenvolvedor, List<AcoesDepoisEstimativa> acoes) {
        this.desenvolvedor = desenvolvedor;
        this.acoes = acoes;
    }

    public EstimativaJava cria(Tarefa tarefa) {
        double metrica = tarefa.getMetricaTarefa();

        double produtividade = desenvolvedor.calculaProdutividade(metrica);

        EstimativaJava estimativa = new EstimativaJava(metrica, produtividade);

        for (AcoesDepoisEstimativa acao : acoes) {
            acao.executa(estimativa);
        }

        return estimativa;
    }
}
