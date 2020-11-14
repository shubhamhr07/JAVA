package stationary;

public class Main {

    public static void main(String[] args) {
	    Printer prints = new Printer(75,false);
	    prints.addToner(30);
	    prints.printPage(50);
	    prints.printPage(5550);
		System.out.println("-----------------------------------");
	    Printer prints2 = new Printer(80,true);
	    prints2.printPage(55);
    }
}
