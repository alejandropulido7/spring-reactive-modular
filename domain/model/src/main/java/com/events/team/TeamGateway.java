package com.events.team;

import reactor.core.publisher.Mono;

public interface TeamGateway {
    Mono<Team> registerTeam(Team team);
}
