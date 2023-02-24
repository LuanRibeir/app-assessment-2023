package br.edu.infnet.appconfeitaria.model.tests;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.domain.Pudim;
import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCamadasInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCaracteresInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeQuantidadeInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;

public class DoceTest {
    public static void main(String[] args) {
        
        try {
            Bolo boloQuadrado = new Bolo("codigoteste1", "bolo de formigueiro", "chocolate",
                                    2, 25.0f, "quadrado", "chocolate", 2);

            System.out.println(boloQuadrado);
            System.out.println(boloQuadrado.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pudim pudimP = new Pudim("codigoteste1", "Pudim", "chocolate",
            2, 25.0f, "P", true, 1);

            System.out.println(pudimP);
            System.out.println(pudimP.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeQuantidadeInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Torta tortaSalgadaVegana = new Torta("codigoteste1", "Torta Salgada Vegana", "sabor",
            2, 25.0f, true, "decoracao", false);

            System.out.println(tortaSalgadaVegana);
            System.out.println(tortaSalgadaVegana.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCaracteresInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}