package pl.globallogic.exercises.intermediate;

public class ex30Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); //
        person.setLastName(""); // lastName is set to empty

        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }
    static class Person{
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public int getAge(){
            return age;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public void setLastName(String lastName){
            this.lastName=lastName;
        }
        public void setAge(int age){
            if(age<0||age>100){
                age=0;
            }
            this.age=age;
        }
        public boolean isTeen(){
            getAge();
            return (age>12&&age<20);
        }
        public String getFullName(){
            getFirstName();
            getLastName();
            if(firstName.isEmpty()&&lastName.isEmpty()){
                return "";
            }
            return firstName+lastName;
        }

    }
}
