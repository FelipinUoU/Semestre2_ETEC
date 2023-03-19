package com.Felipe.Util;
import javax.swing.JOptionPane;

public class IO {
// o que significa IO?
    
    private String texto;
    
    public IO()
    {}
    
    public String getTexto(){
       
        return texto;}
    
    public void setTexto (String texto){
        
        this.texto = texto;}
    
                        
                        public void exibirTexto(){
                            
                            JOptionPane.showMessageDialog(null , texto);}

                        public String digitarTexto (String mensagem){
                            
                            this.setTexto(JOptionPane.showInputDialog(mensagem));
                            return this.getTexto();} 
                        
                        
         
                }












