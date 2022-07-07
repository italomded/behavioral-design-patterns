package br.com.italomded.tax.type;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;

// Strategy Pattern
public interface Tax {
    public BigDecimal execute(Budget budget);
}
