package br.edu.infnet.appconfeitaria.model.exceptions;

public class PedidoSemDoceException extends Exception {
    private static final long serialVersionUID = 1L;

    public PedidoSemDoceException(String messagem){
        super(messagem);
    }
}
