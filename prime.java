import java.lang.*;
class prime
{
    public static void main(String[] args )
    {
        int[] num ={2,5,7,350,700,2020};
        for(int i=0;i<6;i++)
        {
            for(int j=2;j<num[i];i++)
            {
                if (num[i]%j==0)
                    System.out.println("\n"+num[i]+" is not a prime number");
                else
                    System.out.println("\n"+num[i]+" is a prime number");
            }
        }
    }   
}