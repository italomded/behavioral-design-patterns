package br.com.italomded.request;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;

public class RequestGenerator {
    private String client;
    private int budgetAmountItems;
    private BigDecimal budgetValue;

    public RequestGenerator(String client, int budgetAmountItems, BigDecimal budgetValue) {
        this.client = client;
        this.budgetAmountItems = budgetAmountItems;
        this.budgetValue = budgetValue;
    }

    public Request generate() {
        return new Request(new Budget(budgetValue, budgetAmountItems), client);
    }
}
