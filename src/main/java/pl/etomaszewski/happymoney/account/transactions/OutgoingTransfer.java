package pl.etomaszewski.happymoney.account.transactions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class OutgoingTransfer implements Transaction {
    private final String recipient;
    private final BigDecimal amount;
    private final String title;

    @JsonCreator
    public OutgoingTransfer(@JsonProperty("recipient") String recipient, @JsonProperty("amount") BigDecimal amount, @JsonProperty("title") String title) {
        this.recipient = recipient;
        this.amount = amount;
        this.title = title;
    }

    public String getSender() {
        return "YOU";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getAmount() {
        return amount.toString();
    }

    public String getTitle() {
        return title;
    }
}