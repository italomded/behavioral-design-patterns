package br.com.italomded;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.italomded.budget.Budget;

import br.com.italomded.request.RequestGenerator;
import br.com.italomded.request.command.CreateRequestCommand;
import br.com.italomded.request.subscriber.GenerateEmailSubscriber;
import br.com.italomded.request.subscriber.SaveInDatabaseSubscriber;
import br.com.italomded.tax.TaxCalculator;
import br.com.italomded.tax.type.ICMS;

public class SimulationGUI {
    public static void main(String[] args) throws Exception {
        Budget budget = new Budget(new BigDecimal("100.0"), 1);
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setTax(new ICMS());
        BigDecimal valor = taxCalculator.calculate(budget);
        System.out.println(valor);

        String client = "Josenaldo";
        int items = 3;
        BigDecimal value = new BigDecimal("600");

        RequestGenerator requestGenerator = new RequestGenerator(client, items, value);
        CreateRequestCommand createRequestCommand = new CreateRequestCommand(
            Arrays.asList(
                new GenerateEmailSubscriber(), new SaveInDatabaseSubscriber()
                )
            );
        createRequestCommand.execute(requestGenerator);
    }
}
