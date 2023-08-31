package pl.globallogic.bankingApp.parser;

import jdk.jshell.spi.ExecutionControl;
import pl.globallogic.bankingApp.model.BankingTransaction;

import java.nio.file.Path;
import java.util.List;

public interface BankingTransactionParser {
    static List<BankingTransaction> parseFile(Path file){
        return null;
    }
}
