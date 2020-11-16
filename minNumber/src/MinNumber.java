import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.Scanner;

public class MinNumber {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter Number of values you want to enter");
        int count=scanner.nextInt();
        int[] inputArray = new int[count];
        inputArray = readInput(count);
        System.out.println("Min Value: "+getMin(inputArray));

    }
    public static int[] readInput(int count){
        int[] array = new int[count];
        for(int i=0;i<count;i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }
    public static int getMin(int[] array){
        int min = Integer.MAX_VALUE;
        System.out.println("Enter "+array.length+" Values");
        for(int i=0;i<array.length;i++){
            if(array[i]<min)
                min=array[i];
        }
        return min;
    }
}
