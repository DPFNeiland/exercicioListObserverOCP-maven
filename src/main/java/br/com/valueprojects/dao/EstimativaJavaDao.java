package br.com.valueprojects.dao;

import br.com.valueprojects.dominio.AcoesDepoisEstimativa;
import br.com.valueprojects.dominio.EstimativaJava;
import br.com.valueprojects.dominio.Tarefa;

public class EstimativaJavaDao implements AcoesDepoisEstimativa {

    @Override
    public void executa(EstimativaJava estimativa) {
        System.out.println("[DAO] Salvando tarefa estimada no banco: " + estimativa);
    }

}
