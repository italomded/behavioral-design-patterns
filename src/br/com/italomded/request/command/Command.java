package br.com.italomded.request.command;

import br.com.italomded.request.RequestGenerator;

// Simple Command Pattern implementation
public interface Command {
    public void execute(RequestGenerator requestGenerator);
}
