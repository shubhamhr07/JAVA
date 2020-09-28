import java.util.*;
class FeetToCm{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("1: Feet.Inch ----- > cm\n2: Inch ---------- > cm \n3: Exit");
        int i=s.nextInt();
        while(i!=3){
            if (i==1){
                System .out.println("Enter Feets:");
                double feet = s.nextDouble();
                System .out.println("Enter Inches:");
                double inch = s.nextDouble();
                calFeetToCm(feet,inch);
            }
            else if (i==2){
                System .out.println("Enter Inches:");
                double inch = s.nextDouble();
                calFeetToCm(inch);
            }
            else{
                System.out.println("Invelid Input: Enter again");
            }
        System.out.println("1: Feet.Inch ----- > cm\n2: Inch ---------- > cm \n3: Exit");
        i = s.nextInt();
        }
    }
    public static double calFeetToCm(double feet,double inch){
        double cm = 0;
        if (feet>=0 && inch>=0 && inch<=12){    
            cm = (inch + (feet*12)) * 2.54 ;
            }
        else{
            System.out.println("Enter Feet and Inches again");
        }
        System.out.println(feet +" Feet " + inch +" Inch = "+ cm + "cm\n"); 
        return 0;
    }
    public static void calFeetToCm(double inch){
        if (inch>=0){
            double  cm = inch*2.54;
            System.out.println( inch +" Inch = "+cm + "cm\n");
        }
    }
}