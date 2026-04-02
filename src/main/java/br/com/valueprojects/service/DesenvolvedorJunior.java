package br.com.valueprojects.service;

public class DesenvolvedorJunior implements InterfaceDesenvolvedor {
    @Override
    public double calculaProdutividade(double metrica) {
        return metrica * 0.4;
    }
}