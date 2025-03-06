package com.events.event;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class EventRepositoryAdapter implements EventGateway {

    private final EventRepository eventRepository;
    private final EventEntityTransformer eventEntityTransformer;

    @Override
    public Mono<Event> registerEvent(Event event) {

        return eventRepository.save(eventEntityTransformer.domainToEntity(event))
                .map(eventEntityTransformer::entityToDomain);
    }

    @Override
    public Mono<Event> getEventById(Long id) {
        return eventRepository.findById(id)
                .map(eventEntityTransformer::entityToDomain);
    }

    @Override
    public Flux<Event> getPreviousEvents(String sport, String location) {
        return eventRepository.getPreviousEvents(sport, location)
                .map(eventEntityTransformer::entityToDomain);
    }

    @Override
    public Flux<Event> getNextEvents(String sport, String location) {
        return eventRepository.getNextEvents(sport, location)
                .map(eventEntityTransformer::entityToDomain);
    }

    @Override
    public Flux<Event> getActiveEvents(String sport, String location) {
        return eventRepository.getActiveEvents(sport, location)
                .map(eventEntityTransformer::entityToDomain);
    }
}
