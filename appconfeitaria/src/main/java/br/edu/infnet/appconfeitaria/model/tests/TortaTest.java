package br.edu.infnet.appconfeitaria.model.tests;

import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCaracteresInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;

public class TortaTest {
    public static void main(String[] args) {

        String loren141 = "Praesent in mauris eu tortor porttitor accumsan. Mauris suscipit, ligula sit amet pharetra semper, nibh ante cursus purus, vel sagittis velit mauris vel metus. Aenean fermentum risus id tortor. Integer imperdiet lectus quis justo. Integer tempor. Vivamus ac urna vel leo pretium faucibus. Mauris elementum mauris vitae tortor. In dapibus augue non sapien. Aliquam ante. Curabitur bibendum justo non orci. Praesent in mauris eu tortor porttitor accumsan. Mauris suscipit, ligula sit amet pharetra semper, nibh ante cursus purus, vel sagittis velit mauris vel metus. Aenean fermentum risus id tortor. Integer imperdiet lectus quis justo. Integer tempor. Vivamus ac urna vel leo pretium faucibus. Mauris elementum mauris vitae tortor. In dapibus augue non sapien. Aliquam ante. Curabitur bibendum justo non orci.";

        try {
            Torta tortaSalgadaVegana = new Torta("codigoteste1", "Torta Salgada Vegana", "sabor",
            2, 25.0f, true, "decoracao", false);

            System.out.println(tortaSalgadaVegana);
            System.out.println(tortaSalgadaVegana.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCaracteresInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Torta tortaDoce = new Torta("codigoteste1", "Torta Salgada", "sabor",
            2, 25.0f, false, "decoracao", true);
    
            System.out.println(tortaDoce);
            System.out.println(tortaDoce.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCaracteresInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Torta tortaDoceVegana = new Torta("codigoteste1", "Torta Salgada", "sabor",
            2, 25.0f, true, "decoracao", true);
    
            System.out.println(tortaDoceVegana);
            System.out.println(tortaDoceVegana.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCaracteresInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Torta tortaDoceVeganaLetra = new Torta("codigoteste1", "Torta Salgada", "sabor",
            2, 25.0f, true, "decoracao", true);

            tortaDoceVeganaLetra.setDecoracao(loren141);
    
            System.out.println(tortaDoceVeganaLetra);
            System.out.println(tortaDoceVeganaLetra.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCaracteresInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Torta tortaDoceVeganaLetra = new Torta("codigoteste1", "Torta Salgada", "sabor",
            2, 25.0f, true, loren141, true);
            System.out.println(tortaDoceVeganaLetra);
            System.out.println(tortaDoceVeganaLetra.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCaracteresInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
