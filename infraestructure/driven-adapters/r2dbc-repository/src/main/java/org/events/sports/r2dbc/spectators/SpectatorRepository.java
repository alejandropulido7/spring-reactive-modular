package org.events.sports.r2dbc.spectators;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpectatorRepository extends ReactiveCrudRepository<SpectatorEntity, Long> {
}
