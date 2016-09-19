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
public class SmartPhone implements UsbPort {

    private String inputan;
    
    @Override
    public void readInput(String s) {
        this.inputan = s;
        System.out.println("Smartphone baca: " + this.inputan);
    }

    @Override
    public void printInput() {
        System.out.println("Inputan dari smartphone adalah: " + this.inputan);
    }

    @Override
    public void charging() {
        System.out.println("Charging.......");
    }
    
}
