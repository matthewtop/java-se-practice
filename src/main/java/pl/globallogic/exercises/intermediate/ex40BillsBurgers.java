package pl.globallogic.exercises.intermediate;
//The purpose of this application is to help a company called Bill's Burgers manage the
//        process of selling their hamburgers. And in order to match Bill's menu, you will need to
//        create three(3) classes, Hamburger, DeluxeBurger, and HealthyBurger.
//        For the base Hamburger class, there will need to be four variables to represent the four
//        basic ingredients of the hamburger, name, meat, price, and breadRollType. The price
//        variable should be of type double, while the other three are of type String. A constructor
//        will be needed to accept these four values as parameters when creating a new
//        hamburger.
//        There will also need to be separate variables for four(4) possible additions to the
//        hamburger. Those should be declared with these names: addition1Name,
//        addition1Price, addition2Name, addition2Price, addition3Name, addition3Price,
//        addition4Name, and addition4Price. The name variables should be of type String and
//        the price variables should be of type double.
//        Five(5) methods are also needed inside the Hamburger class. Four(4) for adding up to
//        four additions to the hamburger and one(1) for printing out an itemized listing of the
//final hamburger with addons, if any, and the total price. Remember that a name and
//        price must be accepted as parameters in the first four methods so that the price of the
//        hamburger is adjusted accordingly. These methods should be named
//        addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3,
//        addHamburgerAddition4, and itemizehamburger. The first four methods do not return
//        values, but the last method does return the total price of the hamburger of type double,
//        which includes the base price of the hamburger plus any additional items.
//        For the second class, DeluxeBurger, there are no additional member variables, and the
//        constructor accepts no parameters. Instead, the constructor creates a deluxe burger
//        with all the fixings and chips and a drink for a base price of $19.10. The constructor can
//        be configured in any way, as long as chips and drink are added for the total price just
//        mentioned. In this class, the four(4) methods defined in the Hamburger class for
//        including additional toppings must each be overridden so that a message is printed
//        stating that no additional items can be added to a deluxe burger.
//        And for the third class, HealthyBurger, there will be four(4) additional member variables
//        called healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and
//        healthyExtra2Price. The names are type String and the prices are type double. The
//        constructor for this class accepts two(2) parameters for meat and price. Those are set
//        in the constructor along with an appropriate name for the type of burger.
//        Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that
//        each accept a name and price for the addition, allowing for up to two(2) addons to the
//        basic healthy burger. And finally the itemizeHamburger method created in the
//        Hamburger class should be overridden to generate a message appropriate to the type of
//        burger along with any addons. The method also returns the total price of the healthy
//        burger of type double.

public class ex40BillsBurgers {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + String.format("%.2f",hamburger.itemizeHamburger()));
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + String.format("%.2f",db.itemizeHamburger()));
    }
}

class Hamburger{
    private final String name;
    private final String meat;
    private final String breadRollType;
    private final double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    Hamburger(String name, String meat, double price, String breadRollType){
        this.name=name;
        this.meat=meat;
        this.breadRollType=breadRollType;
        this.price=price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name=addition1Name;
        this.addition1Price=addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name=addition2Name;
        this.addition2Price=addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name=addition3Name;
        this.addition3Price=addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name=addition4Name;
        this.addition4Price=addition4Price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " Hamburger on a "+ this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
        if(this.addition1Name!=null){
            hamburgerPrice+=this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " +  this.addition1Price);
        }
        if(this.addition2Name!=null){
            hamburgerPrice+=this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(this.addition3Name!=null){
            hamburgerPrice+=this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if(this.addition4Name!=null){
            hamburgerPrice+=this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return (hamburgerPrice);
    }


}
class DeluxeBurger extends Hamburger{
    DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon", 14.54,"Whtie");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println("Cannot add additional items to a deluxe burger ");
    }
    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        System.out.println("Cannot add additional items to a deluxe burger ");
    }
    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        System.out.println("Cannot add additional items to a deluxe burger ");
    }
    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        System.out.println("Cannot add additional items to a deluxe burger ");
    }

}
class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    HealthyBurger(String meat, double price){
        super("Healthy", meat,price,"Brown Rye");
    }
    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
    }
    @Override
    public double itemizeHamburger(){
        double totalPrice = super.itemizeHamburger();
        if(healthyExtra1Name!=null){
            totalPrice+=healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if(healthyExtra2Name!=null){
            totalPrice+=healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for an extra "+ healthyExtra2Price);
        }
        return totalPrice;
    }
}
