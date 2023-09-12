import java.util.Scanner;

public class FancyReceipt {
    public String custID;

    public String item1, item2, item3, item4, item5, item6;
    public double price1, price2, price3, price4, price5, price6;
    public boolean done = false;
    public boolean fin = false;

    public boolean nextCustom()
    {
        greet();
        while (!done){
        scanItems();
        }
        checkout();
        return fin;
    }

    public void greet()
    {
        System.out.println("Hello! Welcome to the Breakfast Store!");
    }

    public void scanItems()
    {
        System.out.println("Scan the next item");
        done = true;
    }

    public void checkout()
    {
        System.out.println("Pay me");
    }
}
