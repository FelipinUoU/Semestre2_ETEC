package com.Felipe.padrao;
import com.Felipe.Util.IO;
import com.Felipe.Util.DayTime;

public class Principal 
{
    public static void main(String[] args) 
    {
        
        
        IO io = new IO();
        
        Carro carro = new Carro();
        
        DayTime dayTime = new DayTime();
        
        io.setTexto("Programa de Cadastro de Carro");
        
        io.exibirTexto();
        
        carro.setmarca(io.digitarTexto("Digite a marca de seu carro: "));
        
        carro.setmodelo(io.digitarTexto("Digite o modelo de seu carro: "));
        
        carro.setRodas(Integer.parseInt(io.digitarTexto("Digite a quantidade de rodas: ")));
        
        carro.setmotorizacao(Float.parseFloat(io.digitarTexto("Digite a motorização de seu carro: ")));
        
        carro.setFlex(Boolean.parseBoolean(io.digitarTexto("Digite true Flex e false para não Flex: ")));
        
        io.setTexto("Informações do carro: \n\n"
                + "Marca: " + carro.getmarca() + "\n"
                + "Modelo: " + carro.getmodelo() + "\n"
                + "Quantidade de Rodas: " + carro.getRodas() + "\n"
                + "Motorização: " + carro.getmotorizacao() + "\n"
                + "Flex: " + carro.isFlex() + "\n\n"
                + "Data: " + dayTime.getData() + "\n"
                + "Hora: " + dayTime.getHora() 
        );
        
        io.exibirTexto();
    }
}

