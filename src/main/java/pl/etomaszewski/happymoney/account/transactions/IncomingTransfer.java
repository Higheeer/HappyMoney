package pl.etomaszewski.happymoney.account.transactions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class IncomingTransfer implements Transaction {
    private final String sender;
    private final BigDecimal amount;
    private final String title;

    @JsonCreator
    public IncomingTransfer(@JsonProperty("sender") String sender, @JsonProperty("amount") BigDecimal amount, @JsonProperty("title") String title) {
        this.sender = sender;
        this.amount = amount;
        this.title = title;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return "YOU";
    }

    public String getAmount() {
        return amount.toString();
    }

    public String getTitle() {
        return title;
    }
}