package pl.globallogic.exercises.intermediate;
//Your job is to create a simple banking application.
//        Implement the following classes:
//        1. Bank
//        - It has two fields, A String called name and an ArrayList that holds objects of type
//        Branch called branches.
//        - A constructor that takes a String (name of the bank). It initialises name and
//        instantiates branches.
//        - And five methods, they are (their functions are in their names):
//        - addBranch(), has one parameter of type String (name of the branch) and returns
//        a boolean. It returns true if the branch was added successfully or false otherwise.
//        - addCustomer(), has three parameters of type String (name of the branch),
//        String (name of the customer), double (initial transaction) and returns a boolean. It
//        returns true if the customer was added successfully or false otherwise.
//        - addCustomerTransaction(), has three parameters of type String (name of the
//        branch), String (name of the customer), double (transaction) and returns a boolean.
//        It returns true if the customers transaction was added successfully or false
//        otherwise.
//        - findBranch(), has one parameter of type String (name of the Branch) and
//        returns a Branch. Return the Branch if it exists or null otherwise.
//        - listCustomers(), has two parameters of type String (name of the Branch),
//        boolean (print transactions) and returns a boolean. Return true if the branch exists or
//        false otherwise. This method prints out a list of customers.
//        2. Branch
//        - It has two fields, A String called name and an ArrayList that holds objects of type
//        Customer called customers.
//        - A constructor that takes a String (name of the branch). It initialises name and
//        instantiates customers.
//        - And five methods, they are (their functions are in their names):
//        - getName(), getter for name.
//        - getCustomers(), getter for customers.
//        - newCustomer(), has two parameters of type String (name of customer),
//        double (initial transaction) and returns a boolean. Returns true if the customer was
//        added successfully or false otherwise.
//        - addCustomerTransaction(), has two parameters of type String (name of
//        customer), double (transaction) and returns a boolean. Returns true if the customers
//        transaction was added successfully or false otherwise.
//        - findCustomer(), has one parameter of type String (name of customer) and
//        returns a Customer. Return the Customer if they exist, null otherwise.
//        3. Customer
//        - It has two fields, A String called name and an ArrayList that holds objects of type
//        Double called transactions.
//        - A constructor that takes a String (name of customer) and a double (initial
//        transaction). It initialises name and instantiates transactions.
//        - And three methods, they are (their functions are in their names):
//        - getName(), getter for name.
//        - getTransactions(), getter for transactions.
//        - addTransaction(), has one parameter of type double (transaction) and doesn't
//        return anything.

import java.util.ArrayList;

public class ex46Banking {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        bank.listCustomers("Adelaide", true);
    }
}

class Customer{
    private final String name;
    private final ArrayList<Double> transactions;

    Customer(String name, double initialTransaction){
        this.name=name;
        this.transactions= new ArrayList<>();
        addTransaction(initialTransaction);
    }

    public String getName(){
        return name;
    }

    public  ArrayList<Double> getTransactions(){
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}

class Branch{
    private final String name;
    private final ArrayList<Customer> customers;

    Branch(String branchName){
        this.name=branchName;
        this.customers= new ArrayList<>();
    }

     public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if (findCustomer(customerName)==null){
            customers.add(new Customer(customerName,initialTransaction));
            return true;
        }
        return false;
    }

    public Customer findCustomer(String customerName){
        for (Customer customer:customers){
            if (customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = findCustomer(customerName);
        if (customer!=null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }
}

class Bank{
    private String name;
    private final ArrayList<Branch> branches;

    Bank(String name){
        this.name=name;
        this.branches= new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if (branch!= null){
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public Branch findBranch(String branchName){
        for (Branch branch: branches){
            if (branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            ArrayList<Customer> customers = branch.getCustomers();
            System.out.println("Customer details for branch " + branch.getName());

            for (int j = 0; j < customers.size(); j++) {
                Customer customer = customers.get(j);
                System.out.println("Customer: " + customer.getName() + "[" + (j + 1) + "]");

                if (printTransactions) {
                    ArrayList<Double> transactions = customer.getTransactions();
                    System.out.println("Transactions");
                    for (int i = 0; i < transactions.size(); i++) {
                        System.out.println("[" + (i + 1) + "] Amount " + transactions.get(i));
                    }
                }
            }
            return true;
        }
        return false;
    }
}


