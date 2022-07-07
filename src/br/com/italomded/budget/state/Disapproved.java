package br.com.italomded.budget.state;

import br.com.italomded.budget.Budget;

// State Pattern
public class Disapproved extends BudgetState {
    public Disapproved(Budget budget) {
        super(budget);
    }
    
    @Override
    public BudgetState finish() {
        return new Finished(budget);
    }
}
