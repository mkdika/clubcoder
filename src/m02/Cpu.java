
package m02;



public class Cpu {
    
    private String processor;    
    
    private String ram;
    
    public Cpu() {
        
    }
            
    public Cpu(String processor, String ram) {
        this.processor = processor;
        this.ram = ram;
    }
    
    public void printSpec() {
        System.out.println("Processor = " + processor);
        System.out.println("ram = " + ram);                
    }
    
}
