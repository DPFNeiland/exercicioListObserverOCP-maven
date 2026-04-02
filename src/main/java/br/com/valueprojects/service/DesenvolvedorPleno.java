package br.com.valueprojects.service;

public class DesenvolvedorPleno implements InterfaceDesenvolvedor{
    @Override
    public double calculaProdutividade(double metrica) {
        return metrica * 0.65;
    }
}
