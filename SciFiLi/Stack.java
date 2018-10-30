
/**
 * Write a description of class Stack here.
 *
 * Ayman Dokwal
 * @version (a version number or a date)
 * 
 * Help from Kevin Doyle
 * 
 */
public class Stack<Type> extends List<Type>
{
    Stack()
    {
        super();
    }
    
    void Push(Type data)
    {
        super.InsertBefore(data);
    }
    
    Type Pop()
    {
        System.out.println(Peek());
        super.Remove();
        return (Type)(super.GetValue());
    }
    
    Type Peek()
    {
     return (Type)(super.GetValue());   
    }
    
    boolean IsEmptys()
    {
        return super.IsEmpty();
    }
    
    boolean IsFulls()
    {
        return super.IsFull();
    }
    
    int GetSizes()
    {
        return super.GetSize();
    }
}
