package pl.etomaszewski.happymoney.account.transactions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Withdraw implements Transaction {
    private final BigDecimal amount;

    @JsonCreator
    public Withdraw(@JsonProperty("amount") BigDecimal amount) {
        this.amount = amount;
    }

    public String getSender() {
        return "YOU";
    }

    public String getRecipient() {
        return "ATM";
    }

    public String getAmount() {
        return amount.toString();
    }

    public String getTitle() {
        return "Wypłata środków";
    }
}