package br.com.italomded.budget;

import java.math.BigDecimal;

import br.com.italomded.budget.state.BudgetState;
import br.com.italomded.budget.state.UnderAnalysis;

public class Budget {
    private BigDecimal value;
    private int itemsAmount;
    
    // State Pattern
    private BudgetState state;

    public Budget(BigDecimal value, int itemsAmount) {
        this.value = value;
        this.itemsAmount = itemsAmount;
        this.state = new UnderAnalysis(this);
    }

    public int getItemsAmount() {
        return itemsAmount;
    }

    public BigDecimal getValue() {
        return value;
    }

    public BudgetState getState() {
        return state;
    }

    // State Pattern
    public void approve() {
        this.state = state.approve();
    }

    // State Pattern
    public void disapprove() {
        this.state = state.disapprove();
    }

    // State Pattern
    public void finish() {
        this.state = state.finish();
    }
}
