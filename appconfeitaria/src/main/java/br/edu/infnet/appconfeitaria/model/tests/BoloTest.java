package br.edu.infnet.appconfeitaria.model.tests;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCamadasInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;

public class BoloTest {
    public static void main(String[] args) {
        try {
            Bolo boloQuadrado = new Bolo("codigoteste1", "bolo de formigueiro", "chocolate",
                                2, 25.0f, "quadrado", "chocolate", 2);

            System.out.println(boloQuadrado + ";" + boloQuadrado.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bolo boloRedondo = new Bolo("codigoteste2", "bolo de formigueiro", "chocolate", 2,
            25.0f, "redondo", "chocolate", 2);

            System.out.println(boloRedondo + ";" + boloRedondo.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bolo bolo3 = new Bolo("codigoteste3", "bolo de formigueiro", "chocolate", 5,
            25.0f, "redondo", "chocolate", 1);

            System.out.println(bolo3 + ";" + bolo3.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bolo bolo4 = new Bolo("codigoteste3", "bolo de formigueiro", "chocolate", 5,
            -30f, "redondo", "chocolate", 1);

            System.out.println(bolo4 + ";" + bolo4.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bolo bolo5 = new Bolo("codigoteste3", "bolo de formigueiro", "chocolate", 5,
            0f, "redondo", "chocolate", 1);

            System.out.println(bolo5 + ";" + bolo5.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bolo bolo6 = new Bolo("codigoteste3", "bolo de formigueiro", "chocolate", -1,
            20f, "redondo", "chocolate", 1);

            System.out.println(bolo6 + ";" + bolo6.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bolo bolo7 = new Bolo("codigoteste3", "bolo de formigueiro", "chocolate", 0,
            20f, "redondo", "chocolate", 1);

            System.out.println(bolo7 + ";" + bolo7.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bolo bolo8 = new Bolo("codigoteste3", "bolo de formigueiro", "chocolate", 1,
            20f, "redondo", "chocolate", 0);

            System.out.println(bolo8 + ";" + bolo8.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bolo bolo9 = new Bolo("codigoteste3", "bolo de formigueiro", "chocolate", 1,
            20f, "redondo", "chocolate", -10);

            System.out.println(bolo9 + ";" + bolo9.calcularValorPorKilo());
        } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
