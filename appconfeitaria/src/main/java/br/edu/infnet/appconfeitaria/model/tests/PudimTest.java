package br.edu.infnet.appconfeitaria.model.tests;

import br.edu.infnet.appconfeitaria.model.domain.Pudim;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeQuantidadeInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;

public class PudimTest {
    public static void main(String[] args) {
        try {
            Pudim pudimP = new Pudim("codigoteste1", "Pudim", "chocolate",
            2, 25.0f, "P", true, 1);

            System.out.println(pudimP);
            System.out.println(pudimP.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeQuantidadeInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pudim pudimSemLactoseM = new Pudim("codigoteste2", "Pudim", "chocolate", 2,
            25.0f, "M", false, 2);

            System.out.println(pudimSemLactoseM);
            System.out.println(pudimSemLactoseM.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeQuantidadeInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pudim pudimG = new Pudim("codigoteste3", "Pudim", "chocolate",
            2, 25.0f, "G", true, 1);
    
            System.out.println(pudimG);
            System.out.println(pudimG.calcularValorPorKilo());
    
        } catch (ValorZeradoException | NumeroDeQuantidadeInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pudim pudimG2 = new Pudim("codigoteste3", "Pudim", "chocolate",
            2, 25.0f, "G", true, 0);
    
            System.out.println(pudimG2);
            System.out.println(pudimG2.calcularValorPorKilo());
    
        } catch (ValorZeradoException | NumeroDeQuantidadeInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
