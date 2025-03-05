package org.events.sports.domain.team;

import reactor.core.publisher.Mono;

public interface TeamGateway {
    Mono<Team> registerTeam(Team team);
}
