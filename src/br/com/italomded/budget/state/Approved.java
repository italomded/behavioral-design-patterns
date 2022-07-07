package br.com.italomded.budget.state;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;

// State Pattern
public class Approved extends BudgetState {
    public Approved(Budget budget) {
        super(budget);
    }

    @Override
    public BigDecimal applyDiscount() {
        return super.budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public BudgetState finish() {
        return new Finished(budget);
    }
}
