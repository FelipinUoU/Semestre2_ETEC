package com.Felipe.padrao;

public class Carro extends Veiculo {
    
    private int Rodas = 0;
    
    private boolean Flex = false;
    
    public Carro(){
        
    }
    
    public boolean isFlex(){
        return Flex;
    }
    
    public void setFlex(boolean flex){
        this.Flex = flex;
    }

    public int getRodas(){
        return Rodas;
    }
    
    public void setRodas(int Rodas){
        this.Rodas = Rodas;
    }
}
