package com.events.teams;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends ReactiveCrudRepository<TeamEntity, Long> {
}
