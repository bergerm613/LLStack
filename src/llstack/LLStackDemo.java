
package llstack;

/**
 *
 * @author Michal
 */
public class LLStackDemo {
    public static void main(String[] args)    
    {
        LLStack lls = new LLStack<>();
        System.out.println(lls.isEmpty());
        
        lls.push(5);
        lls.push("hi");
        System.out.println(lls.isEmpty());
        
        System.out.println(lls);
        
        System.out.println(lls.pop());
        System.out.println(lls.pop());
        System.out.println(lls.pop());
        System.out.println(lls.pop());
        
        System.out.println(lls);
        System.out.println(lls.isEmpty()); 
        
        
    }
    
}
