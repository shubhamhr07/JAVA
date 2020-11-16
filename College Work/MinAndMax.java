import java.util.*;
class MinAndMax{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int min=0;int max=0;
        boolean first = true;   //using Flag to assign values first time
        while(true){
            System.out.println("Enter number: ");
            Boolean hasNextInt = s.hasNextInt();    
            if (hasNextInt){
                int num = s.nextInt();
                if(first){
                    min=num;max=num;first=false;
                }
                else if(max<num)
                    max=num;    
                else if(num<min) 
                    min=num; 
            }
            else{
                System.out.println("Invelid OUTPUT\nmin : "+min+"\nmax : "+max);
                break;
            }
        }                           
        s.close();
    }
}