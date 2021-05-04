package pl.etomaszewski.happymoney.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import pl.etomaszewski.happymoney.account.transactions.TransactionHistory;

@JsonPropertyOrder({"name", "surname", "accountNumber", "transactionHistory"})
public class Client {
    private final String name, surname;
    private final String accountNumber;
    private final TransactionHistory transactionHistory;

    @JsonCreator
    public Client(@JsonProperty("name") String name, @JsonProperty("surname") String surname, @JsonProperty("accountNumber") String accountNumber, @JsonProperty("transactionHistory") TransactionHistory transactionHistory) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.transactionHistory = transactionHistory;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }
}
