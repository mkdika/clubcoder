/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03;

/**
 *
 * @author Maikel
 */
public abstract class Binatang {
    
    private int umur;
    
    public abstract void setSayap(String sayap);
    
    public abstract void setSirip(String sirip);
    
    public void getUmur() {
        System.out.println("Umur: " + this.umur);
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
}
