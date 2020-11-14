package stationary;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex ;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>=0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = 0;
        }
        this.duplex = duplex;
        this.pagePrinted=0;
    }

    public void printPage(int newPrints) {
        if(duplex){
            newPrints= (newPrints/2) + (newPrints%2);
            System.out.println("Printing in Duplex mode.");
        }
        float tonerConsumed = newPrints * 0.1F; // 1 print consume 0.1% of toner
        if (tonerConsumed > tonerLevel) {
            System.out.println("Not enough toner to print " + newPrints + " Prints.");
            System.out.println("Enough toner to print "+tonerLevel*10+" Pages.");
        } else {
            pagePrinted += newPrints;
            System.out.println("New Prints: " + newPrints + "\nTotal Prints: " + pagePrinted);
            tonerLevel -= tonerConsumed;
        }
        System.out.println("Toner Left: "+tonerLevel+"%");
    }
    public int addToner(int newToner){
        if(newToner>=0 && newToner<=100) {
            if (this.tonerLevel + newToner > 100) {
                return -1;
            }
            this.tonerLevel += newToner;
            return this.tonerLevel;
        }
        else{
            return -1;
            }
    }
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
