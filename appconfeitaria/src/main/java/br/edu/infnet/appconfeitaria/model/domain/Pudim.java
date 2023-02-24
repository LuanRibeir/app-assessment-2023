package br.edu.infnet.appconfeitaria.model.domain;

import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeQuantidadeInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;

public class Pudim extends Doce{
    private String tamanho;
    private boolean lactose;
    private int quantidade;

    public Pudim(String codigo, String nome, String sabor, int kilo,
                float valorKg, String tamanho, Boolean lactose, int quantidade) throws ValorZeradoException{
                    
        super(codigo, nome, sabor, kilo, valorKg);
        this.tamanho = tamanho;
        this.lactose = lactose;
        this.quantidade = quantidade;
    }

    @Override
    public float calcularValorPorKilo() throws NumeroDeQuantidadeInvalidoException{
        float valorTotal = getValorKg() * getKilo();
        float adicional = ((30 * valorTotal) / 100) * quantidade;

        if(quantidade < 1) {
            throw new NumeroDeQuantidadeInvalidoException("[ERRO] Número de quantidade inválido!!!");
        }

        switch (tamanho.toUpperCase()) {
            case "P":
                adicional += 5;
                break;
            case "M":
                adicional += 10;
                break;
            case "G":
                adicional += 15;
                break;
            default:
                adicional += 10;
                break;
        } 

        return lactose ? valorTotal + adicional: valorTotal + adicional * 2;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(tamanho);
        sb.append(";");
        sb.append(lactose ? "S/Lactose" : "C/Lactose");
        sb.append(";");
        sb.append(quantidade);

        return sb.toString();
    }

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isLactose() {
        return lactose;
    }
    public void setLactose(boolean lactose) {
        this.lactose = lactose;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
