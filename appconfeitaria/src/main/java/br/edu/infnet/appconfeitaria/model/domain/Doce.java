package br.edu.infnet.appconfeitaria.model.domain;

import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCamadasInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeQuantidadeInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;

public abstract class Doce {
    private String codigo;
    private String nome;
    private String sabor;
    private int kilo;
    private float valorKg;

    public Doce(String codigo, String nome, String sabor, int kilo, float valorKg) throws ValorZeradoException {
        if (kilo == 0 || valorKg == 0){
            throw new ValorZeradoException("[ERRO] Valor do kg está zerado!!");
        }

        if (kilo < 0 || valorKg < 0){
            throw new ValorZeradoException("[ERRO] Valor do kg é negativo!!");
        }

        this.codigo = codigo;
        this.nome = nome;
        this.sabor = sabor;
        this.kilo = kilo;
        this.valorKg = valorKg;
    }

    public abstract float calcularValorPorKilo() throws NumeroDeQuantidadeInvalidoException,
                                                        NumeroDeCamadasInvalidoException;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(codigo);
        sb.append(";");
        sb.append(nome);
        sb.append(";");
        sb.append(sabor);
        sb.append(";");
        sb.append(kilo);
        sb.append(";");
        sb.append(valorKg);

        return sb.toString();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSabor() {
        return sabor;
    }

    public int getKilo() {
        return kilo;
    }

    public float getValorKg() {
        return valorKg;
    }
}
