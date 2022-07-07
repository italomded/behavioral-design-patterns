package br.com.italomded.request.subscriber;

import br.com.italomded.request.Request;

// Observer Pattern
public class SaveInDatabaseSubscriber implements RequestActionSubscriber {
    @Override
    public void doAction(Request request) {
        System.out.println("Saving into database!");
    }
}
