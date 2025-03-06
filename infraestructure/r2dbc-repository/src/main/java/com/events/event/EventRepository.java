package com.events.event;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface EventRepository extends ReactiveCrudRepository<EventEntity, Long> {

    @Query("SELECT * FROM events WHERE date_event < NOW() AND sport LIKE %:sport% AND location LIKE %:location%")
    Flux<EventEntity> getPreviousEvents(String sport, String location);

    @Query("SELECT * FROM events WHERE date_event > NOW() AND sport LIKE %:sport% AND location LIKE %:location%")
    Flux<EventEntity> getNextEvents(String sport, String location);

    @Query("SELECT * FROM events WHERE status = true AND sport LIKE %:sport% AND location LIKE %:location%")
    Flux<EventEntity> getActiveEvents(String sport, String location);
}
