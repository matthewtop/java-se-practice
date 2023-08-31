package pl.globallogic.bankingApp.model;

import java.time.LocalDate;

public class BankingTransaction {
    private  final LocalDate transactionDate;
    private final String accountNumber;
    private final double amount;
    private final String transactionType;


    public BankingTransaction(LocalDate transactionDate, String accountNumber, double amount, String transactionType){
        this.transactionDate=transactionDate;
        this.accountNumber=accountNumber;
        this.amount=amount;
        this.transactionType=transactionType;
    }

    public LocalDate getTransactionDate(){
        return transactionDate;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getAmount(){
        return amount;
    }
    public String getTransactionType(){
        return transactionType;
    }

}
