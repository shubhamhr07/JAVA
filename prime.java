import java.lang.*;
class prime
{
    public static void main(String[] args )
    {
        int[] num ={2,5,31,350,700,2020};
        for(int i=0;i<6;i++)
        {
            int j=1;
            while (j!=num[i])
            {
                if (num[i]%j==0 && j!=1)
                {
                    System.out.println(num[i]+" is not a prime number");
                    break;
                }
                if (num[i]==j+1)
                    System.out.println(num[i]+" is a prime number");
                j+=1;
            } 
        }
    }   
}