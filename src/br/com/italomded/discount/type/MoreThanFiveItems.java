package br.com.italomded.discount.type;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;

// Chain of Responsability and Template Method Pattern
public class MoreThanFiveItems extends Discount {
    public MoreThanFiveItems(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean mustApplyDiscount(Budget budget) {
        return budget.getItemsAmount() > 5;
    } 
}
