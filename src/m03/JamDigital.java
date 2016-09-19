/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03;

import java.util.Date;

/**
 *
 * @author Maikel
 */
public class JamDigital extends Jam {
    
    public void getTime() {
        Date d = getDate();
        System.out.println("\u001B[33m"+"\u001B[44m"+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
    }
    
    public long getTimeLong() {
        return (new Date()).getTime();
    }
    
}
