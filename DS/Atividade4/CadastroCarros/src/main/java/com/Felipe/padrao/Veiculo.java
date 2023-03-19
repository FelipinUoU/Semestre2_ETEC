package com.Felipe.padrao;

public class Veiculo {
     
    private String marca = "";
    
    private String modelo = "";
    
    private float Motorizacao = 0;
    
    public Veiculo(){
    }
    
    public float getmotorizacao(){
        return Motorizacao;
    }
    
    public void setmotorizacao(float motorizacao){
        this.Motorizacao = motorizacao;
    }
    
    public String getmarca(){
        return marca;
    }
    
    public void setmarca(String marca){
        this.marca = marca;
    }
    
    public String getmodelo(){
        return modelo;
    }
    
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
}
