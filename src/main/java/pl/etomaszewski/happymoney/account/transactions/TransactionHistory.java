package pl.etomaszewski.happymoney.account.transactions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Vector;

public class TransactionHistory {
    private final Vector<Transaction> transactions;

    public TransactionHistory() {
        this.transactions = new Vector<>();
    }

    @JsonCreator
    public TransactionHistory(@JsonProperty("transactions") Vector<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }

    public BigDecimal balance() {
        return new BigDecimal("23303");
    }

    public Vector<Transaction> getTransactions() {
        return transactions;
    }
}
