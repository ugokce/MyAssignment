/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirsttry;

/**
 *
 * @author ugurcan
 */
public class OkeyStone {
    private Color StoneColor;
    private int Value;
    private boolean isOkey;

    public Color getStoneColor() {
        return StoneColor;
    }

   

    public void setStoneColor(Color StoneColor) {
        this.StoneColor = StoneColor;
    }

    public void setValue(int Value) {
        this.Value = Value;
    }

    public OkeyStone(Color rengi,int sayi) 
    {
        this.StoneColor = rengi;
        this.Value = sayi;
        
    }

    public void setIsOkey(boolean isOkey) {
        this.isOkey = isOkey;
    }

    public boolean isIsOkey() {
        return isOkey;
    }

    public Color getTasRengi() {
        return StoneColor;
    }

    public int getDeger() {
        return Value;
    }
    
    
    
}
