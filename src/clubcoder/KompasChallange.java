
package clubcoder;

/**
 *
 * @author Maikel
 */
public class KompasChallange {

    public static void main(String[] args) {
        int x = 5;
        
        for (int i=x;i>0;i--) {
            
            for (int j=0;j< ((i+(i-1)));j++) {
                
                System.out.print("*");
                
            }
            System.out.println("");
            
            
        }
        
        
    }
    
}
