package br.com.italomded.tax.type;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;

// Strategy Pattern
public class ICMS implements Tax {
    @Override
    public BigDecimal execute(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }    
}
