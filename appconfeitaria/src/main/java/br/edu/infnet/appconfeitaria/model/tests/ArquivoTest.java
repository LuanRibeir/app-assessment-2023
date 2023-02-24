package br.edu.infnet.appconfeitaria.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appconfeitaria.model.domain.Bolo;
import br.edu.infnet.appconfeitaria.model.domain.Cliente;
import br.edu.infnet.appconfeitaria.model.domain.Doce;
import br.edu.infnet.appconfeitaria.model.domain.Pedido;
import br.edu.infnet.appconfeitaria.model.domain.Pudim;
import br.edu.infnet.appconfeitaria.model.domain.Torta;
import br.edu.infnet.appconfeitaria.model.exceptions.ClienteInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCamadasInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeCaracteresInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.NumeroDeQuantidadeInvalidoException;
import br.edu.infnet.appconfeitaria.model.exceptions.PedidoSemClienteException;
import br.edu.infnet.appconfeitaria.model.exceptions.PedidoSemDoceException;
import br.edu.infnet.appconfeitaria.model.exceptions.ValorZeradoException;

public class ArquivoTest {
    public static void main(String[] args) {
        try {
            String dir = "src/main/resources/static/";
            String arq = "pedidos.txt";
        try {
            FileReader fReader = new FileReader(dir+arq);
            BufferedReader ler = new BufferedReader(fReader);

            FileWriter fWriter = new FileWriter(dir+"out_"+arq);
            BufferedWriter escrever = new BufferedWriter(fWriter);

            String linha = ler.readLine();

            String[] campos = null;

            List<Doce> doces = new ArrayList<Doce>();
            Pedido pedido = null;

            Float preco = null;

            while(linha != null){
                campos = linha.split(";");

                switch (campos[0].toUpperCase()) {
                    case "R":
                        // R;Descricao;web;nome;cpf;telefone;
                        try {
                            pedido = new Pedido(new Cliente(campos[3], campos[4], Integer.valueOf(campos[5])), doces);
                            pedido.setDescricao(campos[1]);
                            pedido.setWeb(Boolean.valueOf(campos[2]));
                        } catch (ClienteInvalidoException | PedidoSemClienteException | PedidoSemDoceException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "B":
                        // B;codigo;nome;sabor;kilo;valorkg;formato;saborCobertura;camadas;
                         try {
                             Bolo bolo = new Bolo(campos[1], campos[2], campos[3], Integer.valueOf(campos[4]),
                                          Float.valueOf(campos[5]), campos[6], campos[7], Integer.valueOf(campos[8]));
        
                             preco = bolo.calcularValorPorKilo();
                             doces.add(bolo);
                         } catch (ValorZeradoException | NumeroDeCamadasInvalidoException e) {
                             System.out.println(e.getMessage());
                         }
                        break;
                    case "T":
                        // T;codigo;nome;sabor;kilo;valorkg;true;decoracao;false;
                        try {
                            Torta torta = new Torta(campos[1], campos[2], campos[3], Integer.valueOf(campos[4]),
                            Float.valueOf(campos[5]), Boolean.valueOf(campos[6]), campos[7], Boolean.valueOf(campos[8]));
                
                            preco = torta.calcularValorPorKilo();
                            doces.add(torta);
                        } catch (ValorZeradoException | NumeroDeCaracteresInvalidoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "P":
                        // P;codigo;nome;sabor;kilo;valorkg;P;true;1;
                        try {
                            Pudim pudim = new Pudim(campos[1], campos[2], campos[3], Integer.valueOf(campos[4]), Float.valueOf(campos[5]),
                                                    campos[6], Boolean.valueOf(campos[7]), Integer.parseInt(campos[8]));
                
                            preco = pudim.calcularValorPorKilo();
                            doces.add(pudim);
                        } catch (ValorZeradoException | NumeroDeQuantidadeInvalidoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Registro inválido!");
                    break;
                }

                linha = ler.readLine();
            }

            escrever.write(pedido.obterLinha());

            escrever.close();
            ler.close();
            fReader.close();
            fWriter.close();
        } catch (IOException e) {
            System.out.println("[ERRO] " + e.getMessage());
        }
        } finally {
            System.out.println("Processamento Finalizado!");
        }
        
            
    }
}
