package pl.globallogic.lessons.lesson3;

public class ReferenceVsPrimitiveSandbox {
    public static void main(String[] args) {
//        int n1 = 5;
//        int n2 = n1;
//        System.out.println(n1);
//        System.out.println(n2);
//        n1=6;
//        System.out.println(n1);
//        System.out.println(n2);

        User joe1 = new User("Joe");
        User joe2 = joe1;
        System.out.println(joe1);
        System.out.println(joe2);

        joe1.name = "John";
        System.out.println(joe1);
        System.out.println(joe2);

    }
}
