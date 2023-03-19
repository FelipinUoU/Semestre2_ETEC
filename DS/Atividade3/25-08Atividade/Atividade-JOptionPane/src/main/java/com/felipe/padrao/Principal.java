package com.Felipe.padrao;

import com.Felipe.util.DayTime;
import com.Felipe.util.IO;
       
public class Principal {


    public static void main(String[] args) 
    {
       

        IO io = new IO();

        Aluno aluno = new Aluno() ;

        DayTime dayTime = new DayTime () ;

        io.setTexto ("Programa de Cadastro");

        io.exibirTexto();

                aluno.setNome (io.digitarTexto("Digite seu nome: "));

                aluno.setIdade (Integer.parseInt(io.digitarTexto ("Digite sua idade: ")));

                aluno.setFumante (Boolean.parseBoolean(io.digitarTexto("Digite true fumante e false para não fumante")));

            io.setTexto("""
                        Cadastro Realizado: 
                        
                        Nome: """    + aluno.getNome()   + "\n" +
                        "Idade: "   + aluno.getIdade()  + "\n" +
                        "Fumante: " + aluno.isFumante() + "\n" +
                        "Data: "    + dayTime.getData() + "\n" +
                        "Hora: "    + dayTime.getHora()
                        );
            
        io.exibirTexto();

    }
}

