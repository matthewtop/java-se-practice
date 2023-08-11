package pl.globallogic.exercises.intermediate;

public class ex38Encapsulation {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = "
                +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = "
                +printer.getPagesPrinted());
    }
}

class Printer{
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if (tonerLevel+tonerAmount>100){
                return -1;
            }
            tonerLevel +=tonerAmount;
            return tonerLevel;
        }
        return -1;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            System.out.println("Printing in duplex mode");
            pagesToPrint = (int) Math.ceil(pagesToPrint / 2.0);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

}
