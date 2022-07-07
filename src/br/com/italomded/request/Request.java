package br.com.italomded.request;

import java.time.LocalDateTime;

import br.com.italomded.budget.Budget;

public class Request {
    private Budget budget;
    private String client;
    private LocalDateTime time;

    public Request(Budget budget, String client) {
        this.budget = budget;
        this.client = client;
        this.time = LocalDateTime.now();
    }

    public Budget getBudget() {
        return budget;
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
