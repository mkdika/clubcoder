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
public class HybridBird extends Bird {

    private int paruh;
    private String warna;

    public HybridBird() {

    }

    public HybridBird(int paruh, String warna) {
        this.paruh = paruh;
        this.warna = warna;
    }

    @Override
    public void berkicau() {
        super.berkicau();
        System.out.println("zzzzzz");
    }
    
    public void printHybridProperty() {
        System.out.println("paruh = " +paruh);
        System.out.println("warna = " + warna);
    }

}
