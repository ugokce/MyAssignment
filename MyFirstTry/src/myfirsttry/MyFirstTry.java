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
        Player oyuncu2 = new Player("Ahmet");
        Player oyuncu3 = new Player("Mehmet");
        Player oyuncu4 = new Player("Hasan");
        
        
        GameManager OyunKontrol = new GameManager();
        
        OyunKontrol.AddPlayer(oyuncu1);
        OyunKontrol.AddPlayer(oyuncu2);
        OyunKontrol.AddPlayer(oyuncu3);
        OyunKontrol.AddPlayer(oyuncu4);
        
        //this method creates Okey Stones,Shuffles them ,Picks a random "Okey",
        //Distributes okey stones to each person,sort player boards according "Color" and "increasing" orders.
        OyunKontrol.SetUpGame(0);
       
        OyunKontrol.FindTheWinner();
        
        
        
        
        
        
    }
    
}
