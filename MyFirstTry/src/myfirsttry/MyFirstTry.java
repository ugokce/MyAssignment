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
public class MyFirstTry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Player oyuncu1 = new Player("Ugurcan");
        Player oyuncu2 = new Player("Oyuncu 2");
        Player oyuncu3 = new Player("Oyuncu 3");
        Player oyuncu4 = new Player("Oyuncu 4");
        
        
        GameManager OyunKontrol = new GameManager();
        
        OyunKontrol.AddPlayer(oyuncu1);
        OyunKontrol.AddPlayer(oyuncu2);
        OyunKontrol.AddPlayer(oyuncu3);
        OyunKontrol.AddPlayer(oyuncu4);
        OyunKontrol.SetUpGame(0);
       
        
        
        
        
        
        
    }
    
}
