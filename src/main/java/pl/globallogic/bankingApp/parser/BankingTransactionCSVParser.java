package pl.globallogic.bankingApp.parser;

import pl.globallogic.bankingApp.model.BankingTransaction;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankingTransactionCSVParser implements BankingTransactionParser{

    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static List<BankingTransaction> parseFile(Path file) throws IOException {
        List<String> rawTransactions = Files.readAllLines(file);
        List<BankingTransaction> transactions=new ArrayList<>();

        for (String row: rawTransactions){
            String[] transactionData = row.split(",");
            LocalDate transactionDate = LocalDate.parse(transactionData[0], DATE_PATTERN);
            String accountNumber=transactionData[1];
            double transactionAmount = Double.parseDouble(transactionData[2]);
            String transactionType = transactionData[3];
            transactions.add(new BankingTransaction(transactionDate,accountNumber,transactionAmount,transactionType));

        }

        return transactions;

    }
}
