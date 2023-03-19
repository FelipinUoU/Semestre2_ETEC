/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeTime;

/**
 *
 * @author pipis
 */
public class Moto {
    
    IMotor motor;
    
    Moto(IMotor m)     {
        
        this.motor=m;}
    
    
public String acelerar() {
    
    return this.motor.acelerar();}    
}
