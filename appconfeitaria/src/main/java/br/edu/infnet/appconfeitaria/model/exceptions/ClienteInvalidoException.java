package br.edu.infnet.appconfeitaria.model.exceptions;

public class ClienteInvalidoException extends Exception{
    private static final long serialVersionUID = 1L;

    public ClienteInvalidoException(String messagem){
        super(messagem);
    }
}
