package br.edu.infnet.appconfeitaria.model.tests;

import br.edu.infnet.appconfeitaria.model.domain.Pedido;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appconfeitaria.model.domain.Cliente;
import br.edu.infnet.appconfeitaria.model.domain.Doce;
import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.domain.Pudim;
import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.exceptions.ClienteInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCaracteresInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.PedidoSemClienteException;
import br.edu.infnet.appconfeitaria.model.exceptions.PedidoSemDoceException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;


public class PedidoTest {
    public static void main(String[] args) {
        List<Doce> doce1 = new ArrayList<Doce>();
        List<Doce> doce2 = new ArrayList<Doce>();
        List<Doce> doce3 = new ArrayList<Doce>();

        try {
            Bolo boloQuadrado = new Bolo("codigoteste1", "bolo de formigueiro", "chocolate",
            2, 25.0f, "quadrado", "chocolate", 1);

            doce1.add(boloQuadrado);
            doce3.add(boloQuadrado);
        } catch (ValorZeradoException e) { 
            System.out.println(e.getMessage());
        }

        try {
            Pudim pudimP = new Pudim("codigoteste2", "Pudim", "chocolate",
            2, 25.0f, "P", true, 1);

            doce2.add(pudimP);
            doce3.add(pudimP);
        } catch (ValorZeradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Torta tortaSalgadaVegana = new Torta("codigoteste3", "Torta Salgada Vegana", "sabor",
            2, 25.0f, true, "decoracao", false);

            doce2.add(tortaSalgadaVegana);
            doce3.add(tortaSalgadaVegana);
        } catch (ValorZeradoException | NumeroDeCaracteresInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Cliente cli0 = new Cliente("joe", "doe", 123456789);

            Pedido ped0 = new Pedido(cli0, doce1);
            ped0.setDescricao("1 pedido");
            ped0.setWeb(true);
            ped0.imprimir();

            Pedido ped1 = new Pedido(cli0, doce2);
            ped1.setDescricao("2 pedido");
            ped1.setWeb(false);
            ped1.imprimir();

        } catch (ClienteInvalidoException | PedidoSemClienteException | PedidoSemDoceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli1 = new Cliente("joe", "doe", 123456789);

            Pedido ped2 = new Pedido(cli1, doce3);
            ped2.setDescricao("3 pedido");
            ped2.setWeb(true);
            ped2.imprimir();
        } catch (ClienteInvalidoException | PedidoSemClienteException | PedidoSemDoceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli2 = new Cliente(null, "doe", 123456789);

            Pedido ped0 = new Pedido(cli2, doce1);
            ped0.setDescricao("1 pedido");
            ped0.setWeb(true);
            ped0.imprimir();
        } catch (ClienteInvalidoException | PedidoSemClienteException | PedidoSemDoceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli2 = new Cliente("joe", null, 123456789);

            Pedido ped0 = new Pedido(cli2, doce1);
            ped0.setDescricao("1 pedido");
            ped0.setWeb(true);
            ped0.imprimir();
        } catch (ClienteInvalidoException | PedidoSemClienteException | PedidoSemDoceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli2 = new Cliente("joe", "doe", 0);

            Pedido ped0 = new Pedido(cli2, doce1);
            ped0.setDescricao("1 pedido");
            ped0.setWeb(true);
            ped0.imprimir();
        } catch (ClienteInvalidoException | PedidoSemClienteException | PedidoSemDoceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli3 = new Cliente("joe", "doe", 0);
            Pedido ped0 = new Pedido(cli3, doce1);
            ped0.setDescricao("1 pedido");
            ped0.setWeb(true);
            ped0.imprimir();
        } catch (ClienteInvalidoException | PedidoSemClienteException | PedidoSemDoceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli4 = new Cliente("joe", "doe", 10);
            
            Pedido ped4 = new Pedido(null, doce1);
            ped4.setDescricao("1 pedido");
            ped4.setWeb(true);
            ped4.imprimir();
        } catch (ClienteInvalidoException | PedidoSemClienteException | PedidoSemDoceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli4 = new Cliente("joe", "doe", 10);
            
            Pedido ped4 = new Pedido(cli4, null);
            ped4.setDescricao("1 pedido");
            ped4.setWeb(true);
            ped4.imprimir();
        } catch (ClienteInvalidoException | PedidoSemClienteException | PedidoSemDoceException e) {
            System.out.println(e.getMessage());
        }

    }
}
