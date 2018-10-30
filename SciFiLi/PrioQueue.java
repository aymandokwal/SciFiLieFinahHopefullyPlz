
/**
 * Write a description of class PrioQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



import java.util.Scanner;
import java.io.FileReader;

public class PrioQueue<Type> extends Queue<Type>
{
    List<Type> a = new List<Type>();
    
    void Inserting(Type n, int prior)
    {
        super.First();
        super.Next();
        while (super.GetValue().getPrior()>n.getPrior())
        {
            super.Next();
        }
        super.InsertBefore(n);
    }
    
    Type getHighestPrior()
    {
        super.First();
        super.Next();
        return (Type)(super.GetValue());
    }
    
    void removeMax()
    {
        super.First();
        super.Next();
        super.Remove();
    }
    
    String getPrior()
    {
        Scanner books = new Scanner(new File("SciFiLiBooks.txt"));
        while(books.hasNextLine())
        {
            a.InsertAfter(books.nextLine());
        }
        books.close();
        a.First();
    }
    
}
