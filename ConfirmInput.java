import java.util.*;

class ConfirmInput{
    public static void main(String[] args){
        int num=0;
        Scanner s = new Scanner(System.in);
        boolean mx = s.hasNextInt();
        System.out.println(mx);
        if(mx){ 
            num = s.nextInt();
            System.out.println("num :"+num);
        }
        s.close();
    }
}