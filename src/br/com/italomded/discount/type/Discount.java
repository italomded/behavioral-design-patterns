package br.com.italomded.discount.type;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;

// Chain of Responsability Pattern
public abstract class Discount {
    protected Discount nextDiscount;
    
    public Discount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    // Template Method and Chain of Responsability Pattern
    public final BigDecimal execute(Budget budget) {
        if (mustApplyDiscount(budget)) {
            return applyDiscount(budget);
        }
        return nextDiscount.execute(budget);
    }

    // Template Method Pattern
    protected abstract BigDecimal applyDiscount(Budget budget);
    protected abstract boolean mustApplyDiscount(Budget budget);
}
