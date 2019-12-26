
package llstack;

/**
 *
 * @author akatz17
 */
public interface LLStackI<T>
{
    public void push(T element);
    
    public T pop();
    
    public T peek();
    
    public boolean isEmpty();
    
}
