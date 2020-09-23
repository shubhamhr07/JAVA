//program to check the position of student Using methos

import java.util.*;
class Methods
{
    public static void main(String[] args)
    {   
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = s.nextLine();
        System.out.println("Enter Marks: ");
        int a= s.nextInt();
        highScorePosition(name,cal(a));
    }
    public static void highScorePosition(String name,int position)
    {
        System.out.println(name+" manage to get into position "+position+" on the high score table");
    }
    public static int cal(int a)
    {
        if (a>=1000)
            return 1;
        else if (1000>=a)
            return 2;
        else if (500>=a)
            return 3;
        return 4;    
    }
}
