package llstack;

public class LLStack<T> implements LLStackI<T>
{

    private LL<T> stack = new LL<>();

    @Override
    public void push(T element)
    {
        stack.add(element);
    }

    @Override
    public boolean isEmpty()
    {
        return(stack.getHead() == null);
    }

    @Override
    public T pop()
    {
        T info = stack.getHead();
        if (info != null)
        {
            stack.remove(info);
        }
        return info;
    }

    @Override
    public T peek()
    {
        return stack.getHead();
    }

    @Override
    public String toString()
    {
        return stack.toString();
    }
}
