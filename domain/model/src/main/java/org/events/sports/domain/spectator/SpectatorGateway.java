package org.events.sports.domain.spectator;

import reactor.core.publisher.Mono;

public interface SpectatorGateway {
    Mono<Spectator> registerSpectator(Spectator spectator);

    Mono<Spectator> cancelSpotAndStatus(Spectator spectator);
}
