/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroides;

/**
 *
 * @author 59399
 */
public class Objeto {
    //estado(atributos)
    private int drawLocationX,drawLocationY;
    private int angulo;
    private int accX,accY;
    
    // comportamiento (metodos)
    public Objeto(int drawX,int drawY,int angle, int accX, int accY)//constructor
    {
       drawLocationX=drawX;
       drawLocationY=drawY;
       angulo=angle;
       this.accX=accX;
       this.accY=accY;
       
        
    }
    public void setDrawLocationX(int drawX)
    {
        drawLocationX = drawX;
    }
    public void setDrawLocationY(int drawY)
    {
        drawLocationY = drawY;
    }
    public void setAngulo( int angle)
    {
        angulo=angle;
    }   
    public void setAccX(int acX)
    {
        accX=acX;
    }
    public void setAccY(int acY)
    {
        accY=acY;
    }
    // METODOS GET
    public int getDrawLocationX()
    {
        return drawLocationX ;
    }
    public int getDrawLocationY()
    {
        return drawLocationY ;
    }
    public int getAngulo( )
    {
        return angulo;
    }   
    public int getAccX()
    {
        return accX;
    }
    public int getAccY()
    {
        return accY;
    }
    
    
}
