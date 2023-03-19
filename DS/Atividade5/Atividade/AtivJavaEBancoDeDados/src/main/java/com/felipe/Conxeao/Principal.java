package com.felipe.Conxeao;

import com.felipe.util.IO;
import java.util.Scanner;

public class Principal 
{
    
    public static void main(String[] args){
        
        IO io = new IO();
        ConexaoBanco conexao = new ConexaoBanco();
        Escolha esco = new Escolha();
        int c = 0;
        io.setTexto("Programa Banco de Dados");
        io.exibirTexto();
            while(c == 0){
            io.setInfo(Integer.parseInt(io.digitarTexto("Banco de Dados Basiquin\n\n"
                    + " '0' para Sair do Programa\n"
                    + " '1' para Visualizar Todos os Dados\n"
                    + " '2' para Inserir Dados\n"
                    + " '3' para Atualizar os Dados\n"
                    + " '4' para Deletar os Dados\n"
                    + " '5' para Criar Tabela ou DataBase")));

            switch(io.getInfo()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    conexao.selectAll();
                    break;

                case 2:
                    esco.setNome(io.digitarTexto("Insira o Nome com aspas duplas"));
                    esco.setPeso(Double.parseDouble(io.digitarTexto("Insira o Peso")));
                    conexao.insert(esco.getNome(),+ esco.getPeso());
                    break;

                case 3:
                    esco.setCod(Integer.parseInt(io.digitarTexto("Insira o código do aluno")));
                    esco.setNome(io.digitarTexto("Insira o Nome com aspas duplas do aluno"));
                    esco.setPeso(Double.parseDouble(io.digitarTexto("Insira o Peso do aluno")));
                    conexao.update(esco.getCod(),esco.getNome(), esco.getPeso());
                    break;
                case 4:
                    io.setInfo(Integer.parseInt(io.digitarTexto("DELETE\n\n"
                            + " '1' para Deletar um Banco de Dados/DataBase\n"
                            + " '2' para Deletar uma Tabela\n"
                            + " '3' para Deletar um Cadastro")));
                    if(io.getInfo()== 1){
                        esco.setDb(io.digitarTexto("Digite o nome do banco de dados"));
                        conexao.deleteDataBase(esco.getDb());
                    }
                    else if(io.getInfo()== 2){
                        esco.setDb(io.digitarTexto("Digite o nome da tabela"));
                        conexao.deleteTable(esco.getDb());
                    }
                    else if(io.getInfo()== 3){
                        esco.setDb(io.digitarTexto("Digite o nome do banco"));
                        esco.setId(Integer.parseInt(io.digitarTexto("Digite o Id do aluno")));
                        conexao.deleteCadastro(esco.getDb(), esco.getId());
                    }
                    else{
                        io.setTexto("Opção Inválida!");
                        io.exibirTexto();
                    }
                    break;
                case 5:
                    io.setInfo(Integer.parseInt(io.digitarTexto("CREATE\n\n"
                            + " '1' para Criar um Banco de Dados/DataBase\n"
                            + " '2' para Criar uma Tabela\n")));
                    if(io.getInfo()== 1){
                        conexao.createNewDatabase("nomeBanco.db");
                    }
                    else if(io.getInfo()== 2){
                        conexao.createNewTable();
                    }
                    else{
                        io.setTexto("Opção Inválida!");
                        io.exibirTexto();
                    }
                    break;
                default:
                    io.setTexto("Opção Inválida!");
                    io.exibirTexto();
                    break;
            }
        }
    }
}
