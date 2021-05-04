package pl.etomaszewski.happymoney.account.transactions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Deposit.class, name = "Deposit"),
        @JsonSubTypes.Type(value = Withdraw.class, name = "Withdraw"),
        @JsonSubTypes.Type(value = IncomingTransfer.class, name = "IncomingTransfer"),
        @JsonSubTypes.Type(value = OutgoingTransfer.class, name = "OutgoingTransfer")}
)
@JsonPropertyOrder({"type", "sender", "recipient", "amount", "title"})
public interface Transaction {
    String getSender();

    String getRecipient();

    String getAmount();

    String getTitle();
}