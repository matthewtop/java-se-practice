package pl.globallogic.bankingApp;

import pl.globallogic.bankingApp.parser.BankingTransactionCSVParser;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TransactionProcessorTest {
    public static void main(String[] args) throws IOException {
        Path testData = Paths.get("src/main/resources/transactions.csv");
        System.out.println(BankingTransactionCSVParser.parseFile(testData));
    }
}
