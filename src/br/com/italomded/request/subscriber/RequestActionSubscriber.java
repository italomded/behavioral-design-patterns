package br.com.italomded.request.subscriber;

import br.com.italomded.request.Request;

// Observer Pattern
public interface RequestActionSubscriber {
    public void doAction(Request request);
}
