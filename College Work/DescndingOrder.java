import  java.util.*;
import java.lang.*;

class DescenndingOrder{
    public static void main(String[] args){
        int integerArray[]=getint(5);
        int integerArray2[]=getSorted(integerArray);
        for(int i=0;i<integerArray2.length;i++)
            System.out.println("#"+i+": "+integerArray2[i]);
        

    }

    public static int[] getint(int size){
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[size];
        System.out.println("Enter "+size+" Numbers(from 0 to 1000");
        for(int i=0;i<size;i++)
            inputArray[i] = scanner.nextInt();
        scanner.close();
        return inputArray;
    }

    public static int[] getSorted(int[] arrayToSort){
        int[] sortedArray = new int[arrayToSort.length];
        int max=0;
        int del;
        for (i=0;i<arrayToSort.length;i++){
            for(int j=0;arrayToSort.length<j;j++){
                if(arrayToSort[j]>max){
                    max=arrayToSort[j];
                    del=j;
                }
            }
            arrayToSort[del]=max;
            sortedArray[i]=max; 
        }
        return sortedArray;


    }
} 