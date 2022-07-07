package br.com.italomded.discount;

import java.math.BigDecimal;

import br.com.italomded.budget.Budget;
import br.com.italomded.discount.type.Discount;
import br.com.italomded.discount.type.MoreThanFiveItems;
import br.com.italomded.discount.type.NoDiscount;
import br.com.italomded.discount.type.ValueGreaterThanFiveHundred;

public class DiscountCalculator { 
    // Chain of Responsability Pattern
    public BigDecimal calculate(Budget budget) {
        Discount discount = new MoreThanFiveItems(
            new ValueGreaterThanFiveHundred(
                new NoDiscount()
            )
        );
        return discount.execute(budget);
    }

    public BigDecimal calculateExtraDiscount(Budget budget) {
        return budget.getState().applyDiscount();
    }
}
