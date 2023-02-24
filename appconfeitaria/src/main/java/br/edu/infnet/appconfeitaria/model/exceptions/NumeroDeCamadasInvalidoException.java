package br.edu.infnet.appconfeitaria.model.exceptions;

public class NumeroDeCamadasInvalidoException extends Exception {
    private static final long serialVersionUID = 1L;

    public NumeroDeCamadasInvalidoException(String messagem){
        super(messagem);
    }
}
