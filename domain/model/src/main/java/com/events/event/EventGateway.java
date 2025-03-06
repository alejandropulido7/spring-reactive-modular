package com.events.event;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EventGateway {

    Mono<Event> registerEvent(Event event);

    Mono<Event> getEventById(Long id);

    Flux<Event> getPreviousEvents(String sport, String location);

    Flux<Event> getNextEvents(String sport, String location);

    Flux<Event> getActiveEvents( String sport, String location);
}
