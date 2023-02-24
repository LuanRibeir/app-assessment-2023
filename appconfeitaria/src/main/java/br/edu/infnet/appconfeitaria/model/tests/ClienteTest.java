package br.edu.infnet.appconfeitaria.model.tests;

import br.edu.infnet.appconfeitaria.model.domain.Cliente;
import br.edu.infnet.appconfeitaria.model.exceptions.ClienteInvalidoException;

public class ClienteTest {
    public static void main(String[] args) {

        try {
            Cliente cli0 = new Cliente("joe", "doe", 123456789);
            System.out.println(cli0);
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli0 = new Cliente("joe", "doe", 123456789);
            System.out.println(cli0);
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli0 = new Cliente("joe", "doe", 123456789);
            System.out.println(cli0);
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli1 = new Cliente("joe", "doe", 123456789);
            System.out.println(cli1);
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli2 = new Cliente("joe", "doe", 123456789);
            System.out.println(cli2);
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli3 = new Cliente("joe", "doe", 0);
            System.out.println(cli3);
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli4 = new Cliente("joe", null, 123456789);
            System.out.println(cli4);
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente cli5 = new Cliente(null, "doe", 123456789);
            System.out.println(cli5);
        } catch (ClienteInvalidoException e) {
            System.out.println(e.getMessage());
        }


    }
}
