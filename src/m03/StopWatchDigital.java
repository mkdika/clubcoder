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
public class StopWatchDigital extends JamDigital {
    
    public void selisihWaktu(long l1, long l2) {
        System.out.println("Selisih waktu: " + ((l2 - l1)/1000d) + " Secs.");
    }
    
}
