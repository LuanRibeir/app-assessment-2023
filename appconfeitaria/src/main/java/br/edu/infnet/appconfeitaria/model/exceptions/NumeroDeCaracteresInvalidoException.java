package br.edu.infnet.appconfeitaria.model.exceptions;

public class NumeroDeCaracteresInvalidoException extends Exception{
    private static final long serialVersionUID = 1L;

    public NumeroDeCaracteresInvalidoException(String messagem){
        super(messagem);
    }
}
