package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.AcoesDepoisEstimativa;
import br.com.valueprojects.dominio.EstimativaJava;
import br.com.valueprojects.dominio.Tarefa;

public class EmissorDeSms implements AcoesDepoisEstimativa {
    @Override
    public void executa(EstimativaJava estimativa) {
        System.out.println("[SMS] Enviando SMS sobre a tarefa: " + estimativa);
    }

}
