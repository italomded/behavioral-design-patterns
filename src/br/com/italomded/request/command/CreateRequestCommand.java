package br.com.italomded.request.command;

import java.util.List;

import br.com.italomded.request.Request;
import br.com.italomded.request.RequestGenerator;
import br.com.italomded.request.subscriber.RequestActionSubscriber;

// Simple Command Pattern implementation
public class CreateRequestCommand implements Command {
    // Observer Pattern
    private List<RequestActionSubscriber> requestActionSubscriberList;

    public CreateRequestCommand(List<RequestActionSubscriber> requestActionSubscriberList) {
        this.requestActionSubscriberList = requestActionSubscriberList;
    }

    @Override
    public void execute(RequestGenerator requestGenerator) {
        Request request = requestGenerator.generate();
        // Observer Pattern
        requestActionSubscriberList.forEach(action -> action.doAction(request));
    }
}
