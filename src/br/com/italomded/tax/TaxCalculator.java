package br.com.italomded.tax;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;
import br.com.italomded.tax.type.Tax;

// Strategy Pattern
public class TaxCalculator {
    private Tax tax;

    public BigDecimal calculate(Budget budget) {
        return tax.execute(budget);
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }
}
