
/**
 * Write a description of class Queue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Queue<Type> extends List<Type>
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Queue
     */
    public Queue()
    {
        // initialise instance variables
        super();
    }

    void Enqueue(Type data)
    {
        super.InsertAfter(data);
    }
    
    void Dequeue()
    {
        super.First();
        super.Next();
        super.Remove();
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
