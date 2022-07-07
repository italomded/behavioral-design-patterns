package br.com.italomded.discount.type;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;

// Chain of Responsability and Template Method Pattern
public class NoDiscount extends Discount {
    public NoDiscount() {
        super(null);
    }

    @Override
    protected BigDecimal applyDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean mustApplyDiscount(Budget budget) {
        return true;
    }
}
