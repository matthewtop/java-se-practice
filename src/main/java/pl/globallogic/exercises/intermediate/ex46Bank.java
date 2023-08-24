package pl.globallogic.exercises.intermediate;

import java.util.ArrayList;

public class ex46Bank {
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
    private String name;
    private ArrayList<Double> transactions;

    Customer(String name, double initialTransaction){
        this.name=name;
        this.transactions=new ArrayList<Double>();
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
    private String name;
    private ArrayList<Customer> customers;

    Branch(String branchName){
        this.name=branchName;
        this.customers= new ArrayList<Customer>();
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
    private ArrayList<Branch> branches;

    Bank(String name){
        this.name=name;
        this.branches= new ArrayList<Branch>();
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


