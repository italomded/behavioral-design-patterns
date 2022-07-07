package br.com.italomded.request.subscriber;

import br.com.italomded.request.Request;

// Observer Pattern
public class GenerateEmailSubscriber implements RequestActionSubscriber {
    @Override
    public void doAction(Request request) {
        System.out.println("Sending email!");
    }
}
