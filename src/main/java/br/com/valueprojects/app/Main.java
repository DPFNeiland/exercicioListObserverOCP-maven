package br.com.valueprojects.app;

import br.com.valueprojects.dao.EstimativaJavaDao;
import br.com.valueprojects.dominio.*;
import br.com.valueprojects.infra.EmissorDeSms;
import br.com.valueprojects.infra.LogDeAuditoria;
import br.com.valueprojects.service.DesenvolvedorPleno;
import br.com.valueprojects.service.InterfaceDesenvolvedor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa(1, "Implementar login", 100.0);

        List<AcoesDepoisEstimativa> acoes = List.of(
                new EstimativaJavaDao(),
                new EmissorDeSms(),
                new LogDeAuditoria()
        );

        InterfaceDesenvolvedor pleno = new DesenvolvedorPleno();
        CriadorEstimativaJava criador = new CriadorEstimativaJava(pleno, acoes);
        EstimativaJava estimativa = criador.cria(tarefa);

        System.out.println("Estimativa Pleno: " + estimativa.getProdutividadeDesenvolvedor());
    }
}