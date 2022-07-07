package br.com.italomded.budget.state;

import br.com.italomded.budget.Budget;

// State Pattern
public class Finished extends BudgetState {
    public Finished(Budget budget) {
        super(budget);
    }
}
