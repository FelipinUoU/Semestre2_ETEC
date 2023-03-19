package com.felipe.util;
import javax.swing.JOptionPane;


public class IO {
    
    private int info = 0;
    private String texto;   

    
    public int getInfo()
    {
        return info;
    }

    public void setInfo(int info)
    {
        this.info = info;
    }
    
    public String getTexto()
    {
        return texto;
    }

    public void setTexto(String texto)
    {
        this.texto = texto;
    }

    public void exibirTexto()
    {
        JOptionPane.showMessageDialog(null , texto);
    }

    public String digitarTexto(String mensagem)
    {
        this.setTexto(JOptionPane.showInputDialog(mensagem));
        return this.getTexto();
    }
}