package m03;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Maikel
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
//        JamDigital jd = new JamDigital();
//        System.out.println("Hour: " + jd.getHour());
//        System.out.println("Minutes: " + jd.getMinutes());
//        System.out.println("Seconds: " + jd.getSeconds());
//
//        Date d = jd.getDate();
//        System.out.println("Hour: " + d.getHours());
//        System.out.println("Minutes: " + d.getHours());
//        System.out.println("Seconds: " + d.getSeconds());
//        
//        jd.getTime();
//        
//        System.out.println("");
//        
//        Scanner scan = new Scanner(System.in);
//        StopWatchDigital swd = new StopWatchDigital();        
////        int n1 = scan.nextInt();
//        long l1 = swd.getTimeLong();        
//        Thread.sleep(3000);
////        int n2 = scan.nextInt();
//        long l2 = swd.getTimeLong();        
//        swd.selisihWaktu(l1, l2);


           UsbPort usb = new DesktopPC();
           usb.readInput("Sutandi");
           usb.printInput();
           usb.charging();
           
        
        
        

    }

}
