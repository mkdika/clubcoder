
package m03;

/**
 *
 * @author Maikel
 */
public class IndukAyam {
    
    private static int totalInstance;
    
    public void addInstance() {
        totalInstance++;
    }
    
    public void getTotalInstance() {
        System.out.println("Total anak ayam saat ini: " + totalInstance);
    }    
}
