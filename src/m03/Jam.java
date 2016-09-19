
package m03;

import java.util.Date;

/**
 *
 * @author Maikel
 */
public class Jam {
    
    private Date date;
    
    public int getHour() {
        date = new Date();
        return date.getHours();
    }
    
    public int getMinutes() {
        date = new Date();
        return date.getMinutes();
    }
    
    public int getSeconds() {
        date = new Date();
        return date.getSeconds();
    }
    
    public Date getDate() {
        return new Date();
    }
    
    
}
