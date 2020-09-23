import java.util.*;
class Operators{
    public static void main(String[] args){
        double first=20.00d;
        double second=80.00d;
        double result= first+second*100.00d;
        boolean op = (result%40.00==0)?true:false;
        System.out.println(op);
        if(!op)
            System.out.println("Got some remainder");
    }
}