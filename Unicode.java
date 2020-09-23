import java.lang.*;
class Unicode 
{
    public static void main(String[] args)
    {
        String myUC1= "_ \u0941" ;   
        char myUC2= '\u0936';        
        String myUC3="\u092D";      
        char myUC4='\u092E';        
        System.out.println(myUC1 + myUC2 + myUC3 + myUC4);
    }
}