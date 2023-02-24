package br.edu.infnet.appconfeitaria.model.exceptions;

public class NumeroDeQuantidadeInvalidoException extends Exception{
    private static final long serialVersionUID = 1L;

    public NumeroDeQuantidadeInvalidoException(String messagem){
        super(messagem);
    }
}
