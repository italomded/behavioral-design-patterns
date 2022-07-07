package br.com.italomded.discount.type;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;

// Chain of Responsability and Template Method Pattern
public class ValueGreaterThanFiveHundred extends Discount {
    public ValueGreaterThanFiveHundred(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected BigDecimal applyDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    protected boolean mustApplyDiscount(Budget budget) {
        return new BigDecimal("500.0").compareTo(budget.getValue()) == 1;
    }
}
