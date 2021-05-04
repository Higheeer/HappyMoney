package pl.etomaszewski.happymoney.account.transactions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Deposit implements Transaction {
    private final BigDecimal amount;

    @JsonCreator
    public Deposit(@JsonProperty("amount") BigDecimal amount) {
        this.amount = amount;
    }

    public String getSender() {
        return "ATM";
    }

    public String getRecipient() {
        return "YOU";
    }

    public String getAmount() {
        return amount.toString();
    }

    public String getTitle() {
        return "Wpłata środków";
    }
}