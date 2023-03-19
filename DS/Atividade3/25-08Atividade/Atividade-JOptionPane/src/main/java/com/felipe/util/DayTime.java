package com.Felipe.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTime {
    
    private String data;
    
    private String hora;
    
    public DayTime()
    {
        Date dataHoraAtual = new Date();
        
        this.setData(new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual));
        
        this.setHora(new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual));
    }

    public String getData()
        {
        return data;
        }

    public void setData(String Data)
        {
        this.data = Data;
        }

            public String getHora()
            {
                return hora;
            }

            public void setHora(String hora)
            {
                this.hora = hora;
            }
}


