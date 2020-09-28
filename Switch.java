import java.util.*;
class Switch{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Char :");
        String ch = s.nextLine(); 
        switch(ch) {
            case "a":case "e":case "i": case "o": case "u":
                System.out.println(ch +" is a vowel");
                break;
            case "A":case "E":case "I": case "O": case "U":
                System.out.println(ch +" is a vowel");
                break;        
                    
            default:
                System.out.println(ch +" is an consonants"); 
                break;   
        }    
    }
}