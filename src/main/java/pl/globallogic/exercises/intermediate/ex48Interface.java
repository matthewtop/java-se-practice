package pl.globallogic.exercises.intermediate;
//Create a simple interface that allows an object to be saved to some sort of storage
//        medium.
//        Implement the following:
//        1. ISaveable (interface)
//        - It has two methods:
//        - write(), takes no arguments and returns a List containing objects of type
//        String.
//        - read(), takes a List of type String and doesn't return anything.
//        2. Player (class)
//        - It has four fields. Two Strings called name and weapon. Two ints called
//        hitPoints and strength.
//        - A constructor that accepts a String (name) and two ints (hitPoints and
//        strength). It initialises name, hitPoints and strength with the newly passed in
//        values. It initialises weapon with the default weapon "Sword".
//        - And eleven methods:
//        - Getters and setters for all four fields.
//        - write(), same as interface. Return a List of the fields in the order they appear
//        in toString().
//        - read(), same as interface. Store the values in the List, in the order they appear
//        in toString(). Make sure the List is not null and the size() is greater than 0 before
//        storing the values.
//        - toString(), Players overriding toString() method. It takes no arguments and
//        returns a String in the following format:
//        Player{name='Tim', hitPoints=10, strength=15,
//        weapon='Sword'}
//        3. Monster (class)
//        - It has three fields. One String called name and Two ints called hitPoints and
//        strength.
//        - A constructor that accepts a String (name) and two ints (hitPoints and
//        strength). It initialises name, hitPoints and strength with the newly passed in
//        values.
//        - And six methods:
//        - Only getters for the three fields.
//        - write(), same as interface. Return a List of the fields in the order they appear
//        in toString().
//        - read(), same as interface. Store the values in the List, in the order they appear
//        in toString(). Make sure the List is not null and the size() is greater than 0 before
//        storing the values.
//        - toString(), Monsters overriding toString() method. It takes no arguments and
//        returns a String in the following format:
//        Monster{name='Werewolf', hitPoints=20, strength=40}

import java.util.ArrayList;
import java.util.List;

public class ex48Interface {
    public static void main(String[] args) {
        Player player1 = new Player("Matthew",100,25);
        Player player2 = new Player("Ivan",200,200);
        Monster monster1 = new Monster("Bug",10,2);
        List<String> player1Values = player1.write();
        List<String> player2Values = player2.write();
        List<String> monsterValues = monster1.write();

        player1.read(player1Values);
        player2.read(player2Values);
        monster1.read(monsterValues);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(monster1);

    }
}

interface iSaveable{
    List<String> write();
    void read(List<String> savedValue);
}

class Player implements iSaveable{
    private String name,weapon;
    private int hitPoints,strength;

    Player(String name, int hitPoints, int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
        this.weapon="Sword";
    }
    public String getName(){
        return name;
    }
    public String getWeapon(){
        return weapon;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public int getStrength(){
        return strength;
    }
    @Override
    public List<String> write(){
        List<String> values= new ArrayList<>();
        values.add(name);
        values.add(String.valueOf(hitPoints));
        values.add(String.valueOf(strength));
        values.add(weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues){
        if (savedValues !=null && !savedValues.isEmpty()){
            name=savedValues.get(0);
            hitPoints = Integer.parseInt(savedValues.get(1));
            strength=Integer.parseInt(savedValues.get(2));
            weapon=savedValues.get(3);
        }
    }

    @Override
    public String toString(){
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}

class Monster implements iSaveable{
    private String name;
    private int hitPoints,strength;

    Monster(String name, int hitPoints, int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
    }
    public String getName(){
        return name;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public int getStrength(){
        return strength;
    }


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(name);
        values.add(String.valueOf(hitPoints));
        values.add(String.valueOf(strength));
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues !=null && !savedValues.isEmpty()) {
            name = savedValues.get(0);
            hitPoints = Integer.parseInt(savedValues.get(1));
            strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString(){
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }


}
