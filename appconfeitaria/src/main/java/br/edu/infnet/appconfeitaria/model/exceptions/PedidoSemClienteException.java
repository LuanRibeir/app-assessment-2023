package br.edu.infnet.appconfeitaria.model.exceptions;

public class PedidoSemClienteException extends Exception{
    private static final long serialVersionUID = 1L;

    public PedidoSemClienteException(String messagem){
        super(messagem);
    }
}
