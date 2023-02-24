package br.edu.infnet.appconfeitaria.model.domain;

import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCaracteresInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;

public class Torta extends Doce{
    private boolean vegana;
    private String decoracao;
    private boolean isDoce; //doce ou salgada

    public Torta(String codigo, String nome, String sabor, int kilo,
                float valorKg, Boolean vegana, String decoracao, Boolean doce)
                throws ValorZeradoException, NumeroDeCaracteresInvalidoException{
        super(codigo, nome, sabor, kilo, valorKg);
        this.vegana = vegana;
        this.setDecoracao(decoracao);
        this.isDoce = doce;
    }

    @Override
    public float calcularValorPorKilo() {
        float valorTotal = getValorKg() * getKilo();
        float adicional = ((30 * valorTotal) / 100);
        
        if (isDoce) {
            adicional += 10;
        } else {
            adicional += 15;
        }

        return vegana ? valorTotal + adicional * 2 : valorTotal + adicional;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(vegana);
        sb.append(";");
        sb.append(decoracao);
        sb.append(";");
        sb.append(isDoce ? "DOCE" : "SALGADA");
        sb.append(";");
        sb.append(this.calcularValorPorKilo());

        return sb.toString();
    }

    public Boolean getVegana() {
        return vegana;
    }
    public void isVegana(Boolean vegana) {
        this.vegana = vegana;
    }

    public String getDecoracao() {
        return decoracao;
    }
    public void setDecoracao(String decoracao) throws NumeroDeCaracteresInvalidoException{
        if (decoracao.length() > 140){
            throw new NumeroDeCaracteresInvalidoException("[ERRO] Mantenha a decoração com no máximo de 140 characteres.");
        }

        this.decoracao = decoracao;
    }

    public Boolean getIsDoce() {
        return isDoce;
    }
    public void setIsDoce(Boolean isDoce) {
        this.isDoce = isDoce;
    }



}
