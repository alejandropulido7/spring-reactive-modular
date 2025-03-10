package com.events.event.enroll_team;

import reactor.core.publisher.Mono;

public interface EnrollTeamEventGateway {
    Mono<EnrollTeamEvent> enrollTeamToEvent(EnrollTeamEvent enrollTeamEvent);
}
