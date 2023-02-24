package br.edu.infnet.appconfeitaria.model.exceptions;

public class ValorZeradoException extends Exception{
    private static final long serialVersionUID = 1L;

    public ValorZeradoException(String messagem){
        super(messagem);
    }
}
