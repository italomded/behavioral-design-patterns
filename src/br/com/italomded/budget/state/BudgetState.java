package br.com.italomded.budget.state;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;
import br.com.italomded.exception.DomainException;

// State Pattern
public abstract class BudgetState {
    
    protected Budget budget;

    public BudgetState(Budget budget) {
        this.budget = budget;
    }
    
    public BigDecimal applyDiscount() {
        return BigDecimal.ZERO;
    }

    public BudgetState approve() {
        throw new DomainException("This update is not possible.");
    }

    public BudgetState disapprove() {
        throw new DomainException("This update is not possible.");
    }

    public BudgetState finish() {
        throw new DomainException("This update is not possible.");
    }

}
