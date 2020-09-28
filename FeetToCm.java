class FeetToCm{
    public static void main(String[] args){
    calFeetToCm(12,4);
    }
    public static double calFeetToCm(double feet,double inch){
        double cm = 0;
        if (feet>=0 && inch>=0 && inch<=12){    
            cm = (inch + (feet*12)) * 2.54 ;
            }
        else{
            System.out.println("Enter Feet and Inches again");
        }
        System.out.println(feet +" Feet " + inch +" Inch = "+ cm + "cm"); 
        return 0;
    }
    public static void calFeetToCm(double inch){
        if (inch>=0){
            double  cm = inch*2.54;
            System.out.println( inch +" Inch = "+cm + "cm");
        }
    }
}