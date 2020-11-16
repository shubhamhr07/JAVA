import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int integerArray[] = getint(5);
        //int integerArray2[] = getSorted(integerArray);
        int integerArray2[] = sortBySwap(integerArray);
        for (int i = 0; i < integerArray2.length; i++)
            System.out.println("#" + i + ": " + integerArray2[i]);
    }

    public static int[] getint(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[size];
        System.out.println("Enter " + size + " Numbers(from 0 to 1000");
        for (int i = 0; i < size; i++)
            inputArray[i] = scanner.nextInt();
        scanner.close();
        return inputArray;
    }

    public static int[] getSorted(int[] arrayToSort) {
        int[] sortedArray = new int[arrayToSort.length];
        int max=0;
        int del=0;
        for (int i = 0; i < arrayToSort.length; i++) {
            max=0;
            for (int j = 0;j<arrayToSort.length; j++) {
                if (arrayToSort[j] > max) {
                    max = arrayToSort[j];
                    del=j;
                }
            }
            sortedArray[i] =arrayToSort[del];
            arrayToSort[del] = 0;
        }
        return sortedArray;
    }
    public static int[] sortBySwap(int[] array){
        int temp;
        boolean flag = true;
        while(flag){
            flag=false;
            for(int i=0;i<array.length-1;i++){
                if(array[i]<array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag=true;
                }
            }
        }
        return array;

    }
}
