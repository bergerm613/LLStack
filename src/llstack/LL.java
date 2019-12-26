
package llstack;
 

/**
 * Linked List based on DJW's LLNode
 *
 * @author Katz9
 */
public class LL<T>  
{
    private LLNode head = null;
    private LLNode curr = null;

   
    public void add(T value)
    {
        LLNode node = new LLNode(value);
        node.setLink(head);
        head = node;
    }

   
    public boolean remove(T value)
    {
        boolean removed = false;
        LLNode thisNode = head;
        while (thisNode != null && !thisNode.getInfo().equals(value))
        {
            thisNode = thisNode.getLink();
        }
        if (thisNode != null)
        { // have to remove it
            LLNode nextNode = thisNode.getLink();
            if (nextNode != null)
            { // then copy its values to this node
                thisNode.setInfo(nextNode.getInfo());
                thisNode.setLink(nextNode.getLink());
            }
            else
            {
                thisNode.setInfo(null);// = null;
            }
            removed = true;
        }
        return removed;
    }

    
    
    public T getHead()
    {
        T ret = null;
        if (head != null)
        {
            ret = (T)head.getInfo();
        }
        return ret;
    }
    
//<editor-fold defaultstate="collapsed" desc=" iteratror ">     
    public void reset()
    {
        curr = null;
    }

    
    public T next()
    {
        if (curr == null)
        {
            curr = head;
        }
        else
        {
            curr = curr.getLink();
        }
        return curr == null ? null : (T) curr.getInfo();
    }

 //</editor-fold>
    
    
    public String toString()
    {
        String strRV = "->";
        this.reset();
        T info = this.next();
        while (info != null)
        {            
            strRV += (info.toString() + "->");
            info = this.next();              
        }
        return strRV;
    }
}
