package pl.globallogic.exercises.intermediate;

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
    private String name,meat,breadRollType;
    private double price;

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
