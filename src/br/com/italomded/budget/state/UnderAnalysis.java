package br.com.italomded.budget.state;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;

// State Pattern
public class UnderAnalysis extends BudgetState {
    public UnderAnalysis(Budget budget) {
        super(budget);
    }

    @Override
    public BigDecimal applyDiscount() {
        return super.budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public BudgetState approve() {
        return new Approved(budget);
    }

    @Override
    public BudgetState disapprove() {
        return new Disapproved(budget);
    }
}
