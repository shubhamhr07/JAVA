// kg to pound
import java.util.*;
class PoundToKG
{
    public static void main(String[] args)
    {
        double kg,p;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value(KG) you want to convert\n");
        kg= sc.nextDouble();
        p= kg / 0.45359237d;
        System.out.println(kg+" KG equal to "+p+" Pound");
    }
}