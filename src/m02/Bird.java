/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m02;

/**
 *
 * @author Maikel
 */
public class Bird {
    
    private int paruh;
    private String warna;
    
    public Bird() {
        
    }
    
    public Bird(int paruh, String warna) {
        this.paruh = paruh;
        this.warna = warna;
    }
    
    public void berkicau() {
        System.out.println("Twit.");
    }
    
    public void terbang() {
        System.out.println("terbang diatas 100m");
    }
    
    public void printBird() {
        System.out.println("ini adalah super class bird.");
    }
    
}
