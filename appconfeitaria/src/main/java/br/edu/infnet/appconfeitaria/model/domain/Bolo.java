package br.edu.infnet.appconfeitaria.model.domain;

import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCamadasInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;

public class Bolo extends Doce{
    private String formato;
    private String saborCobertura;
    private int camadas;

    public Bolo(String codigo, String nome, String sabor, int kilo,
                float valorKg, String formato, String saborCobertura, int camadas) throws ValorZeradoException{
                    
        super(codigo, nome, sabor, kilo, valorKg);
        this.formato = formato;
        this.camadas = camadas;
        this.saborCobertura = saborCobertura;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(formato);
        sb.append(";");
        sb.append(saborCobertura);
        sb.append(";");
        sb.append(camadas);

        return sb.toString();
    }

    @Override
    public float calcularValorPorKilo() throws NumeroDeCamadasInvalidoException{
        float valorTotal = getValorKg() * getKilo();
        float adicional;

        if(camadas < 1) {
            throw new NumeroDeCamadasInvalidoException("[ERRO] Número de camadas inválido!!!");
        }

        if ("quadrado".equals(formato.toLowerCase())){
            adicional = ((40 * valorTotal) / 100) * camadas;
        } else {
            adicional = ((30 * valorTotal) / 100) * camadas;
        }

        return valorTotal + adicional;
    }

    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getSaborCobertura() {
        return saborCobertura;
    }
    public void setSaborCobertura(String saborCobertura) {
        this.saborCobertura = saborCobertura;
    }

    public int getCamadas() {
        return camadas;
    }
    public void setCamadas(int camadas) {
        this.camadas = camadas;
    }

}   
